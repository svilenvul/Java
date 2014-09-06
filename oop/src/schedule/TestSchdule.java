package schedule;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Locale;

public class TestSchdule {

	public static void main(String[] args) throws ParseException {		
		//Create schedule
		
		String [] timeTable = {
				"25.08.2014 18:00,25.08.2014 19:30,Introduction to java",
				"20.10.2014 16:15,20.10.2014 18:00,Fundamentals of PHP",
				"20.11.2014 12:15,20.11.2014 16:00,HTML Overview"
		};
		Schedule congressHall = new Schedule();
		
		for (String singleEvent : timeTable ) {
			String [] information = singleEvent.split(",");
			String startDate = information [0];
			String endDate = information [1];
			String eventName = information [2];
			
			Date start = new SimpleDateFormat
					("dd.MM.yyyy HH:mm", Locale.ENGLISH).parse(startDate);
			Date end = new SimpleDateFormat
					("dd.MM.yyyy HH:mm", Locale.ENGLISH).parse(endDate);
			
			Event event = new Event (start,end,eventName);	
			congressHall.addEvent(event);
		}		
		//Search in the schedule
		
		String dateFrom = "25.08.2014 18:30";
		String dateTo = "20.11.2014 14:00";
		
		Date fromDate = new SimpleDateFormat
				("dd.MM.yyyy HH:mm", Locale.ENGLISH).parse(dateFrom);
		Date toDate = new SimpleDateFormat
				("dd.MM.yyyy HH:mm", Locale.ENGLISH).parse(dateTo);
		
		Collection<Event> events = congressHall.findEvents(fromDate, toDate);
		//Print the result
		
		if (events.isEmpty()) {
			System.out.println("The hall is free in the time range.");
		} else {
			for(Event event : events) {
				System.out.println(event);
			}	
		}
	}
}
