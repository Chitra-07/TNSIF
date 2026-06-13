package com.tnsif.accessmodifierdemo;

public class Publicdemo {
	int a=9;
	public String S="Chitra";
	
	public void display() {
		System.out.println("welcome");
	}
	
	public static void main(String[] args) {
		Publicdemo p=new Publicdemo();
		System.out.println(p.a);
		System.out.println(p.S);
		p.display();
		
	}

}
