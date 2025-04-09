package com.ibm;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TestEvent {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Comparator<Event> compareEndDateAsc = new Comparator<Event>() {
			@Override
			public int compare(Event o1, Event o2) {
				// TODO Auto-generated method stub
				return o1.getEndDate().compareTo(o2.getEndDate());
			}
		};
		// create another reference of Comparator to sort based on the name & pass that to TreeSet constructor
		
		Set<Event> events = new TreeSet<Event>(compareEndDateAsc); // customized sorting
		events.add(new Event(788, "Wedding", LocalDate.parse("2025-04-25"), LocalDate.parse("2025-04-26")));
		events.add(new Event(688, "Training", LocalDate.parse("2025-04-22"), LocalDate.parse("2025-04-25")));
		events.add(new Event(898, "Birthday", LocalDate.parse("2025-04-20"), LocalDate.parse("2025-04-20")));
		events.add(new Event(600, "NamingCeremony", LocalDate.parse("2025-04-21"), LocalDate.parse("2025-04-22")));
		events.add(new Event(700, "BachelorsParty", LocalDate.parse("2025-04-23"), LocalDate.parse("2025-04-26")));
		events.add(new Event(898, "Birthday", LocalDate.parse("2025-04-19"), LocalDate.parse("2025-04-20")));
		printEvents(events);
		System.out.println("Enter event id:");
		int eventId = scan.nextInt();
		Iterator<Event> iterate = events.iterator();
		while(iterate.hasNext()) {
			Event event = iterate.next();
			if(event.getEventId() == eventId) 
				iterate.remove();
		}
		printEvents(events);
		scan.close();
	} //Add a duplicate event object in the same HashSet and check whether duplicate is added or not
	public static void printEvents(Collection<Event> collection) {
		Iterator<Event> iterate = collection.iterator();
		while(iterate.hasNext()) {
			System.out.println(iterate.next());
		}
		System.out.println("_______________________________________");
	}

}
