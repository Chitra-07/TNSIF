package com.tns.scannerclasdemo;
import java.util.Scanner;

public class Mainmethod {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("enter the person name:");
		String name=sc.next();
		System.out.print("enter the income:");
		int income=sc.nextInt();
		
		Person pp=new Person();
		pp.setName(name);
		pp.setIncome(income);
		
		Taxcalculation  t=new Taxcalculation();
		t.CalculateTax(pp);
		
		System.out.print("after tax calculation:");
		
		System.out.println(pp);
		
		// TODO Auto-generated method stub

	}

}
