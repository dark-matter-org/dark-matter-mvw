package org.dmd.dmp.server.servlet.base;

/**
 * The SessionIF is implemented by components that represent a validated session
 * with a web application.
 */
public interface SessionIF {

	/**
	 * @return a unique identifier for a particular session.
	 */
	public String sessionID();
}
