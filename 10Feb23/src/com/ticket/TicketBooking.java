package com.ticket;


public class TicketBooking {

	public static void main(String[] args) {
		 BookingThread obj=new BookingThread();
         
         Thread thread1=new Thread(obj,"person 1");
         Thread thread2=new Thread(obj,"person 2");
         
         thread1.start();
         thread2.start();

	}

}
