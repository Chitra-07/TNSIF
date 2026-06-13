package com.tnsif.finalkeyworddemo;
//cant override final
 class Ecommerceplatform{
	final void calculate() {
		System.out.println("base discount 10%");
	}
}
 class Amazon extends Ecommerceplatform{
	 @Override
	 final void calculate() {
		 System.out.println("base discount 20%");
	 }
 }
public class FInalMethod {
	public static void main(String[] args) {
		Amazon a=new Amazon();
	}

}
