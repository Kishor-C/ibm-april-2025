package com.ibm;

import java.time.LocalDate;
import java.util.Objects;

public class Event implements Comparable<Event> {
	private int eventId;
	private String eventName;
	private LocalDate startDate;
	private LocalDate endDate;
	public Event(int eventId, String eventName, LocalDate startDate, LocalDate endDate) {
		super();
		this.eventId = eventId;
		this.eventName = eventName;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	@Override
	public String toString() {
		return "Event [eventId=" + eventId + ", eventName=" + eventName + ", startDate=" + startDate + ", endDate="
				+ endDate + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(eventId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Event other = (Event) obj;
		return eventId == other.eventId;
	}
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	@Override
	public int compareTo(Event o) {
		// TODO Auto-generated method stub
		//return Integer.compare(eventId, o.eventId); // if(x < y) = -1, else if (x == y) = 0, else if (x > y) = 1
		return startDate.compareTo(o.startDate);
	}
}
