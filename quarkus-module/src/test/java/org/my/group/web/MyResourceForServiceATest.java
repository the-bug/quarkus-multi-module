package org.my.group.web;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class MyResourceForServiceATest {

	@Test
	public void testHelloEndpoint() {
		given().when().get("/service-a").then().statusCode(200).body(is("Hello ServiceA"));
	}

}