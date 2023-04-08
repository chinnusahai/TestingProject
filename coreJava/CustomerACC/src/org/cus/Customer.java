package org.cus;

public class Customer {

	private void customerD(String n) {
		System.out.println(n);
	}
	private void customerD(int n) {
		System.out.println(n);
	}
	private void customerD(float f) {
		System.out.println(f);
	}
	
	public static void main(String[] args) {
		Customer c = new Customer();
		
		c.customerD(77884455);
		c.customerD(784512784512f);
		c.customerD("priya");
	}
}
