package org.scanner;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter name");
		String name;
		name = s.nextLine();
		System.out.println("phone no:");
		long num= s.nextLong();
		s.nextLine();
		System.out.println("enter ur email");
		String e =s.nextLine();
		System.out.println("name	"+name+"	mobile	"
		+num+"	email	"+e);
	}
}
