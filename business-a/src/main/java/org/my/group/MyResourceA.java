package org.my.group;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * It is possible to use JAX-RS annotation in a module and quarkus figures out
 * how to deploy this stuff
 * 
 * @author Jonas Scholz (jonas@die-honigwanderer.de)
 *
 */
@Path("service-a-directly")
public class MyResourceA {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String hello() {
		return "Hello service-a-directly";
	}
}