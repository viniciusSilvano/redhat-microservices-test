package com.redhat.examples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

class HelloRestControllerTest {

	private static HelloRestController helloRestController;
	
	@BeforeAll
	public static void before() {
		helloRestController = new HelloRestController();
	}
	
	@Test
	void helloNotEmpty() {
		assertTrue(helloRestController.hello() != null && helloRestController.hello().length() > 0);
	}

}
