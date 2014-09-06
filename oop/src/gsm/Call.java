package gsm;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Call implements Comparable<Call> {
	private static DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
	private static DateFormat hoursFormat = new SimpleDateFormat("HH:mm:ss");
	private Date date;
	private int duration;
	private long fromNumber;
	
	public Call(int durationInSec,long fromNumber) {	
		this.date = new Date();
		this.duration = durationInSec;
		this.fromNumber = fromNumber;
	}
	
	
	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getCurrentDate() {
		return dateFormat.format(this.date);
	}
	
	public String getCurrentTime() {
		return hoursFormat.format(this.date);
	}
	
	public String getDuration() {
		return Integer.toString(this.duration);
	}
	
	public String getFromNumber() {
		return Double.toString(this.fromNumber);
	}
	void printCall () {			
		System.out.println("Last call on:" + date + ",at " +this.getCurrentTime() +" from: " + this.getFromNumber() + " ,lasts " + this.getDuration() + " s");
	}

	@Override
	public int compareTo(Call call) {
		return call.getDate().compareTo(this.getDate());
	}
}
