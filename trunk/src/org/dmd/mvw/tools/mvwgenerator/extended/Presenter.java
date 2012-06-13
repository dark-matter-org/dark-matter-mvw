//	---------------------------------------------------------------------------
//	dark-matter-mvw
//	Copyright (c) 2012 dark-matter-mvw committers
//	---------------------------------------------------------------------------
//	This program is free software; you can redistribute it and/or modify it
//	under the terms of the GNU Lesser General Public License as published by the
//	Free Software Foundation; either version 3 of the License, or (at your
//	option) any later version.
//	This program is distributed in the hope that it will be useful, but WITHOUT
//	ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
//	FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for
//	more details.
//	You should have received a copy of the GNU Lesser General Public License along
//	with this program; if not, see <http://www.gnu.org/licenses/lgpl.html>.
//	---------------------------------------------------------------------------
package org.dmd.mvw.tools.mvwgenerator.extended;

import org.dmd.mvw.tools.mvwgenerator.generated.dmw.PresenterDMW;
import org.dmd.util.exceptions.ResultException;

public class Presenter extends PresenterDMW {

	StringBuffer		presenterInterfaces;

	// The run context item that's automatically created for us in the definition manager
	RunContextItem		runContextItem;

	public Presenter(){
		
	}
	
	@Override
	public void resetCodeGenInfo() {
		super.resetCodeGenInfo();
		initialized 		= false;
		presenterInterfaces	= null;
	}

	public void setRunContextItem(RunContextItem i){
		runContextItem = i;
	}
	
	public RunContextItem getRunContextItem(){
		return(runContextItem);
	}
	
	public String getPresenterInterfaces(){
		if (hasCommsMethods()){
			presenterInterfaces.append(", ResponseHandlerIF");
			if (handlesObjectEvents())
				presenterInterfaces.append(", EventHandlerIF");
		}
		
		// If we refer to any asynchronously loaded code, we have to implement the appropriate interfaces
		if (getUsesRunContextItemHasValue()){
			for(RunContextItem rci: getUsesRunContextItemIterable()){
				if (rci.refersToAsyncCode()){
					if (presenterInterfaces.length() == 0){
						presenterInterfaces.append("implements " + rci.getAsyncInterface());
					}
					else{
						presenterInterfaces.append(", " + rci.getAsyncInterface());
					}
				}
			}
		}
		
//		if (isCentralDMPErrorHandler()){
//			if (presenterInterfaces.length() > 0)
//				presenterInterfaces.append(", ");
//			presenterInterfaces.append("CentralDMPErrorHandlerIF");
//		}
//		if (isCentralRPCErrorHandler()){
//			if (presenterInterfaces.length() > 0)
//				presenterInterfaces.append(", ");
//			presenterInterfaces.append("CentralRPCErrorHandlerIF");
//		}
		return(presenterInterfaces.toString());
	}
	
	public void initCodeGenInfo(boolean rpc, boolean dmp) throws ResultException{
		if (!initialized){
			presenterInterfaces = new StringBuffer();
			
			if (getInstantiatesPresenterHasValue()){
				for(Presenter presenter: getInstantiatesPresenterIterable()){
					addUsesRunContextItem(presenter.getRunContextItem());
				}
			}
			
			super.initCodeGenInfo(rpc,dmp);

			if(getManagesViewHasValue()){
				boolean first = true;
				for(View view: getManagesViewIterable()){
					imports.addImportsFrom(view.getPresenterImplImports());
					if (first){
						first = false;
						presenterInterfaces.append(" implements ");
					}
					else
						presenterInterfaces.append(", ");
					presenterInterfaces.append(view.getViewName() + "PresenterIF");
				}
			}
		}
	}
	
	/**
	 * @return the fully qualified name of this presenter's extended implementation.
	 */
	public String getExtendedClassImport(){
		if (getSubpackage() == null)
			return(getDefinedInModule().getGenPackage() + ".extended." + getPresenterName());
		else
			return(getDefinedInModule().getGenPackage() + ".extended." + getSubpackage() + "." + getPresenterName());
		
	}
	
	/**
	 * @return the import for PresenterAsyncIF associated with this presenter. 
	 */
	public String getAsyncImport(){
		return(getDefinedInModule().getGenPackage() + ".generated.mvw.presenters." + getPresenterName() + "AsyncIF");
	}
	
	/**
	 * @return the PresenterAsyncIF name for this presenter. 
	 */
	public String getAsyncInterface(){
		return(getPresenterName() + "AsyncIF");
	}
	
	
	
	@Override
	public String genSubPackage(){
		return("presenters");
	}

}
