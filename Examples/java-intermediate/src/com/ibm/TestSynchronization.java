package com.ibm;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * Thread synchronization allows only one thread to execute the method, other threads need to wait
 * until the entered thread completes the task
 */
class TicketBooking implements Runnable {
	int ticketCounter = 1;

	@Override
	public synchronized void run() {
		String name = Thread.currentThread().getName();
		if(ticketCounter != 0) {
			System.out.println(name+" booked the ticket");
			ticketCounter--;
		} else {
			System.err.println(name+" ticket is unavilable");
		}
	} 
}
public class TestSynchronization {
	public static void main(String[] args) {
		TicketBooking ticket = new TicketBooking();
		ExecutorService exe = Executors.newFixedThreadPool(3); // 3 threads will be created in the pool and reused
		for(int i = 1; i <= 10; i++) {
			exe.execute(ticket);
		}
		exe.shutdown(); // it destroys the pool
		
//		new Thread(ticket, "Siddharth").start();
//		new Thread(ticket, "Ravi").start();
//		new Thread(ticket, "Atharva").start();
	}
}
