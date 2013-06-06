package com.tanker.example;

import junit.framework.Assert;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void test() {
		HelloWorld obj = new HelloWorld();
		obj.setName("Tanker");
		Assert.assertEquals("message", "Hello world! Tanker", obj.print());
	}

}
