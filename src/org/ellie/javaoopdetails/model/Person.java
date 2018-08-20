package org.ellie.javaoopdetails.model;

public class Person {

	public String name;
	public int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s - %d", name, age);
	}
}
