package schedule;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.TreeMap;

public class Schedule {
	private TreeMap <Date,Event> eventsSortedByStart;
	private TreeMap <Date,Event> eventsSortedByEnd;
	
	public Schedule () {
		this.eventsSortedByStart = new TreeMap<Date,Event>();
		this.eventsSortedByEnd = new TreeMap<Date,Event>();
	}
	
	public void addEvent(Event event) {
		eventsSortedByStart.put(event.getStartTime(), event);
		eventsSortedByEnd.put(event.getEndTime(), event);
	}
	
	public  Collection<Event> findEvents (Date startTime,Date endTime) {
		Collection<Event> events = new HashSet<Event>();
		Collection<Event> startedAfter = this.eventsSortedByStart.subMap(startTime, endTime).values();
		Collection<Event> endedBefore = this.eventsSortedByEnd.subMap(startTime, endTime).values();
		events.addAll(startedAfter);
		events.retainAll(endedBefore);
		return events;
	}
}
