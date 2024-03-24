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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getDeparmentId() {
		return deparmentId;
	}

	public void setDeparmentId(Integer deparmentId) {
		this.deparmentId = deparmentId;
	}

	
	
}