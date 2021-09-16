package com.java.class17;

public class ParameterizedConstructorExample {
	public static void main(String[] args) {

		Person p1 = new Person(12, "Student", "Chirag");
		Person p2 = new Person(34, "Student", "Madina");
		p1.printName();
		p2.printName();
	}
}

class Person {
	int age;
	String occupation;
	String name;

	Person(int ageFromUser, String occFromUser, String nameFromUser) {
		age = ageFromUser;
		occupation = occFromUser;
		name = nameFromUser;
	}

	void printAge() {
		System.out.println(age);
	}

	void printName() {
		System.out.println(name);
	}
}
