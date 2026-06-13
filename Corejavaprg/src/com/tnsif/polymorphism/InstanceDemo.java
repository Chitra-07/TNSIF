package com.tnsif.polymorphism;

class Person{
	
}
class Manager extends Person{
	
}
class Employee extends Person{
	
}

public class InstanceDemo {
	public static void main(String[] args) {
		Person p=new Person();
		Manager m=new Manager();
		Employee e=new Employee();
		System.out.println(p instanceof Person);
		System.out.println(e instanceof Person);
		System.out.println(p instanceof Manager);
		System.out.println(m instanceof Manager);
		
	}

}
