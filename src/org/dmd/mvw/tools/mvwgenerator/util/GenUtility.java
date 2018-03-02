package org.dmd.mvw.tools.mvwgenerator.util;

import java.util.StringTokenizer;

/**
 * A replacement for a method removed from the base dark-matter-data GenUtility
 */
public class GenUtility {

	static public String capTheName(String value){
		StringBuffer 	name 	= new StringBuffer();
		name.append(value);
		name.setCharAt(0,Character.toUpperCase(name.charAt(0)));
		return(name.toString());
	}

	/**
	 * This method takes a dot name, for example app.event.explosion and turns it into a camel
	 * case string like: AppEventExplosion
	 * @return A camel case string.
	 */
	static public String dotNameToCamelCase(String in){
		StringBuffer sb = new StringBuffer();
		StringTokenizer	tokenizer = new StringTokenizer(in,".");
		
		while(tokenizer.hasMoreTokens()){
			StringBuffer t = new StringBuffer(tokenizer.nextToken());
	    	t.setCharAt(0,Character.toUpperCase(t.charAt(0)));
	    	sb.append(t.toString());
		}
		
		return(sb.toString());
	}	

}
