package com.tnsif.accessmodifierdemo;

public class Protecteddemo {


public static void main(String[] args) {
	Publicdemo p=new Publicdemo();
	System.out.println(p.a);
	System.out.println(p.S);
	p.display();
	
}
}