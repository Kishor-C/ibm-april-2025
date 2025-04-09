package com.ibm;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestQueue {
	public static void main(String[] args) {
		Queue<Integer> queue = new PriorityQueue<Integer>();
		// change PriorityQueue to LinkedList
		queue.add(8);
		queue.add(1);
		queue.add(5);
		queue.add(4);
		queue.add(3);
		
		System.out.println("Queue = "+queue);
		System.out.println("Peek = "+queue.peek());
		System.out.println("Queue = "+queue);
		System.out.println("Poll = "+queue.poll()); //1
		System.out.println("Queue = "+queue);
		System.out.println("Poll = "+queue.poll()); //3
		System.out.println("Queue = "+queue);
		System.out.println("Poll = "+queue.poll()); //4
		System.out.println("Queue = "+queue);
		// remove element based on value
		queue.remove(8);
		System.out.println("_____ After remove(8) ____");
		System.out.println("Queue = "+queue);
	}
}
