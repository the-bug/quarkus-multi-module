package org.my.group.web;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class MyResourceBTest {

	@Test
	public void testHelloEndpoint() {
		given().when().get("/service-b-directly").then().statusCode(200)
				.body(is("Hello ServiceA and via CDI inject from: Hello ServiceA"));
	}

}