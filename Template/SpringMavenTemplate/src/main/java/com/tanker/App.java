package com.tanker;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tanker.example.HelloWorld;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
		HelloWorld obj = (HelloWorld)context.getBean("helloBean");
		obj.print();
	}
}
