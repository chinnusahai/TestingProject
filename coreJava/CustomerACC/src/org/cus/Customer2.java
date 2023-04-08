package org.cus;

public class Customer2 {

	private void customerD(String n) {
		System.out.println(n);
	}
	private void customerD(int mob, int age) {
		System.out.println(mob +"	"+age);
	}
	private void customerD(float f, String State) {
		System.out.println(f);
	}
	
	public static void main(String[] args) {
		Customer2 c = new Customer2();
		
		c.customerD(77884455, 50);
		c.customerD(784512784512f, "chennai");
		c.customerD("priya");
	}
}
