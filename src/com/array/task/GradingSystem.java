package com.array.task;

import java.util.Arrays;
import java.util.Scanner;
public class GradingSystem {
	static Scanner sc=new Scanner(System.in);
	static int highest;
	int student[];
	public static void main(String[] args) {
		System.out.println("Welcome to the Student Grade Management System");
		GradingSystem grade=new GradingSystem();
		grade.getStudent();
	}
	public void getStudent() {
		System.out.println("enter the number of students:");
		int student[]=new int[sc.nextInt()];
		int count=0;
		for(int i=0;i<student.length;i++) {
			count++;
			System.out.println("Enter the grade of students"+count);
			student[i]=sc.nextInt();
			this.student=student;
			highest+=student[i];
		}
		getMenu();
	}
	public void getMenu() {
		while(true) {
			System.out.println("Menu:");
			System.out.println("1.View all grades");
			System.out.println("2.view the average grade");
			System.out.println("3.view the highest grade");
			System.out.println("4.view the lowest grade");
			System.out.println("5.exit");
			System.out.println("Enter your choice:");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.print("All grades of students:"+Arrays.toString(student)+"\n");
				break;
			case 2:
				System.out.println("Average Grade of Student:"+highest/student.length);
				break;
			case 3:
				int max=student[0];
				for(int i=0;i<=student.length-1;i++) {
					if(student[i]>max) {
						max=student[i];
					}
					System.out.println();
				}
				System.out.println("highest :"+max);
				break;
			case 4:
				int min=student[0];
				for(int i=0;i<=student.length-1;i++) {
					if(student[i]<min) {
						min=student[i];
					}
				}
				System.out.println("lowest:"+min);
				break;
			case 5:
				System.out.println("Exiting the program good bye");
				System.exit(0);
				break;
			}
		}
	}
}







