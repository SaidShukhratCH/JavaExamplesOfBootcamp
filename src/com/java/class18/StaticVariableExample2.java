package com.java.class18;

class Person {
	String name;
	static int numberOfPerson;

	Person(String nameFromUser) {
		name = nameFromUser;
		numberOfPerson++;
	}

	void showInfo() {
		System.out.println(name);
		System.out.println(numberOfPerson);
	}

}

public class StaticVariableExample2 {
	public static void main(String[] args) {
		Person p1 = new Person("Chirag");
		Person p2 = new Person("Ibrahim");
		Person p3 = new Person("Sumeyra");

		p3.showInfo();

	}
}
