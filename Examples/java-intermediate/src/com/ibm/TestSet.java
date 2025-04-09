package com.ibm;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSet {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		// use TreeSet & LinkedHashSet and observe the output
		set.add("welcome");
		set.add("hello");
		set.add("hi");
		set.add("thankyou");
		set.add("hi");
		System.out.println("Size = "+set.size());
		System.out.println("Set = "+set);
		// Iterate and remove hello
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			String ele = itr.next();
			if(ele.equals("hello")) {
				itr.remove();
			}
		}
		System.out.println("____ After itr.remove ____");
		System.out.println("Size = "+set.size());
		System.out.println("Set = "+set);
		// for simple types of data you can directly remove by passing the object
		set.remove("welcome"); // list.remove(5)
		System.out.println("____ After remove(obj) ____");
		System.out.println("Size = "+set.size());
		System.out.println("Set = "+set);
		/*
		 * In Set you can remove integers by directly passing the value
		 * set.remove(5) if the Set<Integer> is having 5 in it
		 */
	}

}
