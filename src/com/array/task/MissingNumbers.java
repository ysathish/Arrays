package com.array.task;

public class MissingNumbers {

	public static void main(String[] args) {
int arr[]= {1,2,6,5,3};
int n=6;
int summOfAll=n*(n+1)/2;
System.out.println(summOfAll);
  int add=0;
  for(int a:arr) {
	  add+=a;
  }
  System.out.println(add);
  int missingNumbers=summOfAll-add;
  System.out.println(missingNumbers);
	}

}
