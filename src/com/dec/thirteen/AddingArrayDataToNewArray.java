package com.dec.thirteen;

import java.util.Arrays;

public class AddingArrayDataToNewArray {
     public String[] m1(int arr1[],char arr2[]){
    	 int arr3[]= new int[arr1.length];
    	   for(int i=arr3.length-1;i>=0;i--) {
    		  
    		  
    	   }
    	   System.out.println(Arrays.toString(arr3));
    	 
    	//task-3
    	 String s[]= {"hai","hello","java"};
    	 return s;
     }
	public static void main(String[] args) {
		AddingArrayDataToNewArray a=new AddingArrayDataToNewArray();
		int arr1[]= {10,20,30,40,50};
		char arr2[]= {'A','B','C'};
		String s[]=a.m1(arr1,arr2);
		
		System.out.println(Arrays.toString(s));
		

	}

}
