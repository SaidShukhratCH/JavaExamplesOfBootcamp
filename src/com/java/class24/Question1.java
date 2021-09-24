package com.java.class24;

class Person {
	public int age;
	String name;
	private String occupation;
}

public class Question1 {
	public static void main(String args[]) {
		Person p = new Person();
		System.out.println(p.age);
		System.out.println(p.name);
		// System.out.println(p.occupation);
	}
}
