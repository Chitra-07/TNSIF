package com.tnsif.exceptionhandling;

public class StringIndexoutofbound {
	public static void main(String[] args) {
		String str="Atria clg";
		try {
			char ch=str.charAt(20);
		}
		catch(Exception r) {
			System.out.println(r);
			
		}
		System.out.println("Exception caught");
		
	}

}
