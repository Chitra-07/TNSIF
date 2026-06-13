package com.tnsif.statickeyworddemo;

class PaymentGateway{
	static void shownotification() {
		System.out.println("supported bank:sbi,hdfc.....");
	}
}
public class StaticMethod {
	public static void main(String[]args) {
		PaymentGateway.shownotification();
	}

}
