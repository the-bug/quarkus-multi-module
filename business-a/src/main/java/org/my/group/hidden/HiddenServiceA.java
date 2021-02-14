package org.my.group.hidden;

import javax.enterprise.context.ApplicationScoped;

/**
 * No exposed so it is not visible in the othere modules
 * 
 * @author Jonas Scholz (jonas@die-honigwanderer.de)
 *
 */
@ApplicationScoped
public class HiddenServiceA {

	public String hello() {
		return "Hello ServiceA";
	}
}