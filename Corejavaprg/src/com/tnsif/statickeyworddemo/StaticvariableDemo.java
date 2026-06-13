package com.tnsif.statickeyworddemo;
class Student{
	String name;
	int id;
	static String collegename="Atria";
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
		this.collegename = collegename;
	}
	 void showdetails() {
		 System.out.println("Student: "+name+" id: "+id+"  College Name: "+collegename);
	 }
}

public class StaticvariableDemo {
	public static void main(String[] args) {
		Student S1 = new Student("chitra",8);
		Student s2=new Student("Ram",10);
		
		S1.showdetails();
		s2.showdetails();
		
		
		
		
		
	}

}
