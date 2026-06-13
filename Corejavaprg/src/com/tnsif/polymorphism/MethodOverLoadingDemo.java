package com.tnsif.polymorphism;

class Override{
	int add(int a,int b) {
		return a+b;
	}
	double add(double a,double b) {
		return a+b;
	}
	int add(int a,int b,int c) {
		return a+b+c;
	}
}

public class MethodOverLoadingDemo {
	public static void main(String[] args) {
		Override o=new Override();
		System.out.println(o.add(3, 5));
		System.out.println(o.add(45.8, 6.8));
		System.out.println(o.add(3, 5,7));
		
	}

}
