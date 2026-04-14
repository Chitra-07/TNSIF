package com.tnsif.polymorphism;
class Persons{
	private String name;
	private  int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void display() {
		System.out.println("name:"+name);
		System.out.println("ID:"+id);
	}
	
	
}


public class ThisKey {
	public static void main(String[] args) {
		Persons p=new Persons();
		p.setName("Chitra");
		p.getName();
		p.setId(07);
		p.getId();
		p.display();
	}
	

}
