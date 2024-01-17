package com.avacre.micro;

public class Student {
	String name;
	Integer age;
	Integer deparmentId;

	public Student(String name, Integer age, Integer deparmentId) {
		this.name = name;
		this.age = age;
		this.deparmentId = deparmentId;

	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", deparmentId=" + deparmentId + "]";
	}

	
	
}