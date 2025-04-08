package com.ibm;

class T1 extends Thread {
	// run method is an entry point for the threads
	@Override
	public void run() {
		Thread thread = Thread.currentThread();
		for(int i = 1; i <= 100; i++) {
			System.out.println("i = "+i+", thread name = "+thread.getName());
		}
	}
}
class T2 implements Runnable {
	@Override
	public void run() {
		Thread thread = Thread.currentThread();
		for(int i = 500; i <= 600; i++) {
			System.out.println("i = "+i+", thread name = "+thread.getName());
		}
	}
}

public class TestThreads {
	public static void main(String[] args) {
		T1 a = new T1();
		T2 b = new T2();
		Thread t = new Thread(b); // Since b is not a thread but runnable type we will pass it to the thread
		a.setName("DB-Worker");
		t.setName("File-Worker");
		a.start();
		t.start(); // b doesn't have start() method
		Thread thread = Thread.currentThread();
		System.out.println("main method thread name is :"+thread.getName());
	}
}
