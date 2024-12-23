package com.dec.twelve;

import java.util.Scanner;

public class EnterNames {
	static Scanner sc=new Scanner(System.in);
	void getNames() {
		System.out.println("how many names you want to enter ???");
		String names[]=new String[sc.nextInt()];
		System.out.println("enter "+names.length+" names");
		for(int i=0;i<=names.length-1;i++) {
			names[i]=sc.next();
		}
		System.out.println("you entered "+names.length+" names are ");
		for(int i=0;i<=names.length-1;i++) {
			System.out.println(names[i]);
		}
		System.out.println("\nthe retriving the data in reverse  order is \n");
		for(int i=names.length-1;i>=0;i--) {  
			System.out.println(names[i]);

		}
		System.out.println("\n for each method");
		for(String s:names)
		{
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		new EnterNames().getNames();

	}

}
