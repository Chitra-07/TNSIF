package com.tnsif.polymorphism;

class A{
	A(int a){
		System.out.println("Hi");
	}
	A(int a,String s){
		System.out.println("heyy");
	}
	A(int a,int b){
		System.out.println("Bye");
	}
}
public class ConstructorOverload {
	public static void main(String[] args) {
		A a=new A(3);
		A b=new A(4,"hi");
		A c=new A(5,6);
		
	}

}
