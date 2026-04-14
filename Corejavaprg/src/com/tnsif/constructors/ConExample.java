package com.tnsif.constructors;

public class ConExample {

	public ConExample() { 
		System.out.println("default");
		// TODO Auto-generated constructor stub
	}
	ConExample(int r){
		System.out.println("1 para");
	
		}
	ConExample(int r,String s){
		System.out.println("2 para");
	}
	ConExample(int s,int b,int d){
		System.out.println("3 para");
	}
	
	public static void main(String[] args) {
		ConExample ce =new ConExample();
		ConExample c1=new ConExample(6);
		ConExample c2=new ConExample(6,"chitra");
		ConExample c3=new ConExample(6,5,4);
		
		
	}

}
