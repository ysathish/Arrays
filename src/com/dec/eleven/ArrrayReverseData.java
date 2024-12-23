package com.dec.eleven;

import java.util.Arrays;

public class ArrrayReverseData {
	boolean[] m1(boolean arr[]) {
		boolean a[]=new boolean[arr.length];
		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
		}
		System.out.println("--------------------\n");
		for(int i=a.length-1;i>=0;i--) {
//			System.out.println(arr[i]);
			a[i]=arr[i];
			}
		System.out.println("--------------------\n");
           System.out.println("for each method\n");
		for(boolean flag:arr) {
//			System.out.println(flag);
		}
		System.out.println("--------------------\n");


		
		return a;
		
	}

	public static void main(String[] args) {
		ArrrayReverseData reverse=new ArrrayReverseData();
		boolean flag[]= {true,false,true,false,false};
		boolean f[]=reverse.m1(flag);
		System.out.println(Arrays.toString(f));
	}

}
