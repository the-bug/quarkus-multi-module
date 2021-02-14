package org.my.group.b;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("service-b-directly")
public class MyResourceB {

	@Inject
	ServiceB serviceB;

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String hello() {
		return serviceB.hello();
	}
}