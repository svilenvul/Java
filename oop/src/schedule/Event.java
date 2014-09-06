package schedule;

import java.util.Date;

public class Event {
	private Date startTime ;
	private Date endTime;
	private String name;
	
	public Event(Date startTime,Date endTime, String name) {
		this.startTime = startTime;
		this.endTime = endTime;
		this.name = name;
	}
	
	public Date getStartTime () {
		return this.startTime;
	}
	
	public void setStartTime (Date startTime) {
		this.startTime = startTime;
	}	
	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name + " from " + this.startTime + " to " + this.endTime;
	}
}
