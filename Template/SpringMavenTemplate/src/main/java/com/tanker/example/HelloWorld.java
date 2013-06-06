package com.tanker.example;

public class HelloWorld {
	private String name;
	public void setName(String name){
		this.name = name;
	}
	public String print(){
		System.out.println("Hello world!"+ this.name);
		return "Hello world! "+ this.name;
	}
}
