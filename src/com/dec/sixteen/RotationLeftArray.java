package com.dec.sixteen;

import java.util.Arrays;
import java.util.Scanner;

public class RotationLeftArray {
	static Scanner sc=new Scanner(System.in);
	int[] rotationArray(int arr[]) {
		int temp=arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
		arr[arr.length-1]=temp;
		
		
		
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 RotationLeftArray a=new RotationLeftArray();
		int nums[]= {10,20,30};
				int b[]=a.rotationArray(nums);
				System.out.println(Arrays.toString(b));
				
	}

}
