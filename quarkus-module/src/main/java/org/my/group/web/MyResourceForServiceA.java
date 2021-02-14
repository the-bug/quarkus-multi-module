package org.my.group.web;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.my.group.ServiceA;

@Path("/service-a")
public class MyResourceForServiceA {

	@Inject
	ServiceA serviceA;

//	@Inject
//	HiddenServiceA ttest;

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String hello() {
		return serviceA.hello();
	}
}