package org.my.group.b.hidden;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HiddenServiceB {

	public String hello() {
		return "Hello ServiceA";
	}
}