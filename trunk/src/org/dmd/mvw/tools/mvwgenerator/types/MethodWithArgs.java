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

import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcMappedAttributeIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcValueException;

/**
 * The MethodWithArgs class is used to store a local method call and possibly an argument vector
 * and fully qualified class names in the form:
 * returnType functionName(type arg1, type arg2...) comment...
 */
@SuppressWarnings("serial")
public class MethodWithArgs implements DmcMappedAttributeIF, Serializable {

	String returnType;
	String methodName;
	String argVector;
	String comment;
	
	public MethodWithArgs(){
		returnType	= null;
		methodName 	= null;
		argVector 	= null;
		comment 	= null;
	}
	
	public MethodWithArgs(String rt, String mn, String av, String c){
		returnType	= rt;
		methodName 	= mn;
		argVector 	= av;
		comment 	= c;
	}
	
	public MethodWithArgs(MethodWithArgs mwa){
		returnType	= mwa.comment;
		methodName 	= mwa.methodName;
		argVector 	= mwa.argVector;
		comment 	= mwa.comment;
	}
	
	public MethodWithArgs(String v) throws DmcValueException{
		String value = v.trim();
		int	spacepos = value.indexOf(" ");
		int lbpos = value.indexOf("(");
		
		if (lbpos == -1)
			throw(new DmcValueException("You must specify the argument vector, even if it's empty i.e ()"));

		int rbpos = value.indexOf(")", lbpos+1);
		
		if (rbpos == -1)
			throw(new DmcValueException("Missing ) for the argument vector: " + v));
			
		if (spacepos == -1)
			throw(new DmcValueException("Missing return type: " + v));
		
		returnType	= value.substring(0,spacepos);
		
		if (spacepos+1 == lbpos)
			throw(new DmcValueException("Missing method name: " + v));
		
		if (spacepos > lbpos)
			throw(new DmcValueException("Missing return type: " + v));
			
		methodName = value.substring(spacepos+1, lbpos).trim();
		
		if (methodName.length() == 0)
			throw(new DmcValueException("Missing method name: " + v));

		argVector 	= value.substring(lbpos,rbpos+1);
		
		comment = "";
		if (value.length() > (rbpos+1)){
			// the remainder should be a comment
			comment = value.substring(rbpos+1).trim();
		}
					
	}
	
	public String getReturnType(){
		return(returnType);
	}
	
	public String getMethodName(){
		return(methodName);
	}
	
	public String getArgVector(){
		return(argVector);
	}
	
	public String getComment(){
		return(comment);
	}
	
	public String getSignature(){
		return(returnType + " " + methodName + argVector);
	}
	
	@Override
	public String toString(){
		return(returnType + " " + methodName + argVector + " " + comment);
	}

	@Override
	public Object getKey() {
		return(methodName);
	}

	@Override
	public String getKeyAsString() {
		return(methodName);
	}

	@Override
	public boolean valuesAreEqual(DmcMappedAttributeIF obj) {
		boolean rc = false;
		
		if (obj instanceof MethodWithArgs){
			MethodWithArgs other = (MethodWithArgs)obj;
			if (returnType.equals(other.returnType)){
				if (methodName.equals(other.methodName)){
					if (argVector.equals(other.argVector)){
						if (comment.equals(other.comment)){
							rc = true;
						}
					}
				}
			}
		}
		return(rc);
	}
	
	public void serializeIt(DmcOutputStreamIF dos) throws Exception {
		dos.writeUTF(returnType);
		dos.writeUTF(methodName);
		dos.writeUTF(argVector);
		dos.writeUTF(comment);
	}
	
	public void deserializeIt(DmcInputStreamIF dis) throws Exception {
		returnType 	= dis.readUTF();
		methodName 	= dis.readUTF();
		argVector 	= dis.readUTF();
		comment 	= dis.readUTF();
	}
}
