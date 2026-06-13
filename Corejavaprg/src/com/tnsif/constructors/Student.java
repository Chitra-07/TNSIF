package com.tnsif.constructors;

public class Student {

	private String name;
	private int age;
	private String USN;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getUSN() {
		return USN;
	}
	public void setUSN(String uSN) {
		USN = uSN;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", USN=" + USN + "]";
	}
	
}
