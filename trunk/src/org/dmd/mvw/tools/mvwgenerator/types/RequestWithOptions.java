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
package org.dmd.mvw.tools.mvwgenerator.types;

import java.io.Serializable;
import java.util.Iterator;
import java.util.HashSet;

import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcMappedAttributeIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcValueException;
import org.dmd.mvw.tools.mvwgenerator.generated.enums.RequestOptionEnum;

/**
 * The RequestWithOptions class is used to store a base function name fragment along with
 * a set of RequestOptionEnum values:
 * functionFragment LOCALERRORS 
 */
@SuppressWarnings("serial")
public class RequestWithOptions implements DmcMappedAttributeIF, Serializable {

	String 						functionName;
	HashSet<RequestOptionEnum> 	options;
	
	public RequestWithOptions(){
		functionName 	= null;
		options 		= null;
	}
	
	public RequestWithOptions(String fn, HashSet<RequestOptionEnum> o){
		functionName 	= fn;
		options 		= o;
	}
	
	public RequestWithOptions(RequestWithOptions gwm){
		functionName 	= gwm.functionName;
		options 		= gwm.options;
	}
	
	public RequestWithOptions(String v) throws DmcValueException {
		String value = v.trim();
		int spacepos = value.indexOf(" ");
		
		if (spacepos == -1){
			functionName 	= value;
			options 		= new HashSet<RequestOptionEnum>();
			options.add(RequestOptionEnum.NONE);
		}
		else{
			functionName = value.substring(0, spacepos);
			options = new HashSet<RequestOptionEnum>();
			String remainder = value.substring(spacepos+1);
			String[] opts = remainder.split(" ");
			for(int i=0; i<opts.length; i++){
				if (opts[i].length() > 0){
					RequestOptionEnum val = RequestOptionEnum.get(opts[i]);
					if (val == null)
						throw(new DmcValueException(opts[i] + " is not a valid option."));
					options.add(val);
				}
			}
		}
		
			
	}
	
	public String getFunctionName(){
		return(functionName);
	}
	
	public HashSet<RequestOptionEnum> getOptions(){
		return(options);
	}
	
	@Override
	public String toString(){
		if (options.size() == 0)
			return(functionName);
		else{
			StringBuffer sb = new StringBuffer();
			sb.append(functionName);
			Iterator<RequestOptionEnum> it = options.iterator();
			while(it.hasNext()){
				sb.append(" " + it.next());
			}
			
			return(sb.toString());
		}
	}

	@Override
	public Object getKey() {
		return(functionName);
	}

	@Override
	public String getKeyAsString() {
		return(functionName);
	}

	@Override
	public boolean valuesAreEqual(DmcMappedAttributeIF obj) {
		boolean rc = false;
		
		if (obj instanceof RequestWithOptions){
			RequestWithOptions other = (RequestWithOptions)obj;
			if (functionName.equals(other.functionName)){
				if (options.equals(other.options)){
					rc = true;
				}
			}
		}
		return(rc);
	}
	
	public void serializeIt(DmcOutputStreamIF dos) throws Exception {
		dos.writeUTF(functionName);
		if (options.size() == 0){
			dos.writeInt(0);
		}
		else{
			dos.writeInt(options.size());
			Iterator<RequestOptionEnum> it = options.iterator();
			while(it.hasNext()){
				dos.writeInt(it.next().intValue());
			}
		}
	}
	
	public void deserializeIt(DmcInputStreamIF dis) throws Exception {
		functionName = dis.readUTF();
		options = new HashSet<RequestOptionEnum>();
		int size = dis.readInt();
		
		if (size > 0){
			for(int i=0; i<size; i++){
				int val = dis.readInt();
				options.add(RequestOptionEnum.get(val));
			}
		}
	}
}
