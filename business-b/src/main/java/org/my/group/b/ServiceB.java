package org.my.group.b;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.my.group.ServiceA;

/**
 * this class can be injected in the web module
 * 
 * @author Jonas Scholz (jonas@die-honigwanderer.de)
 *
 */
@ApplicationScoped
public class ServiceB {

	@Inject
	ServiceA serviceA;

	public String hello() {
		return "Hello ServiceA and via CDI inject from: " + serviceA.hello();
	}
}