package com.array.task;

public class SumOfAllElements {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		int sum=0;
		for(int i=0;i<=arr.length-1;i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
		System.out.println("\n---\n");
		int add=0;
		for(int a:arr) {
			add+=a;
		}
		System.out.println(add);

		
	}

}
