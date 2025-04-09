package com.ibm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestList {
	public static void main(String[] args) {
		// all the collection interfaces & classes are present in java.util
		//List<Integer> list = new ArrayList<Integer>();
		List<Integer> list = new LinkedList<Integer>();
		list.add(50);	list.add(20);	list.add(5);	list.add(20);	list.add(5);	list.add(40);
		list.add(30);	list.add(70);	list.add(15);	list.add(5);	list.add(20);	list.add(70);
		
		System.out.println("Size: "+list.size()); // 12
		System.out.println("List: "+list);
		list.remove(5); // removes based on the index
		list.remove(Integer.valueOf(5)); // remove the value 5
		System.out.println("______ After remove(5) _____");
		System.out.println("Size: "+list.size()); // 10
		System.out.println("List: "+list);
		//Iterator : hasNext(), next(), remove
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			int ele = itr.next();
			if(ele == 5) { 
				itr.remove(); // removes 5 by iterating all the elements
			}
		}
		System.out.println("______ After itr.remove() _____");
		System.out.println("Size: "+list.size()); // 8
		System.out.println("List: "+list);
		// call the clear() method of list and print the list
	}
}
