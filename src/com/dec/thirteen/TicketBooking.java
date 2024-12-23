package com.dec.thirteen;

import java.util.Scanner;

public class TicketBooking {
	static Scanner sc=new Scanner(System.in);
	public void getTicket() {
		System.out.println("Which movie you want to see ??");
		String movieName=sc.nextLine();
		System.out.println(movieName+" is a very nice choice !!");
		System.out.println("How many tickets you need for "+movieName+" ?");
		String names[]=new String[Integer.parseInt(sc.nextLine())];
		System.out.println("Please enter"+names.length+" names for ticket booking");
		for(int i=0;i<names.length;i++) {
			names[i]=sc.next();
			
		}
		System.out.println("Please choose your row between A to Z");
		String row=sc.next();
		System.out.println("Please enter your starting seat number");
		int seatNo=sc.nextInt();
		System.out.println("\n your ticketss were booked for "+movieName+", below are the details");
		for(String data:names) {
			System.out.println(data+"-"+row+"-"+seatNo++);{
				
			}
		}
	}

	public static void main(String[] args) {
		TicketBooking tickets=new TicketBooking();
		tickets.getTicket();

	}

}
