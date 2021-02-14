package org.my.group;

import javax.enterprise.context.ApplicationScoped;

/**
 * this class can be injected in the other modules
 * 
 * @author Jonas Scholz (jonas@die-honigwanderer.de)
 *
 */
@ApplicationScoped
public class ServiceA {

	public String hello() {
		return "Hello ServiceA";
	}
}