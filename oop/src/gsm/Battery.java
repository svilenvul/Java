package gsm;

public class Battery {

	private long capacity;
	private long idleTime;
	private long hoursTalk;

	public Battery() {
		this(0);
	}

	public Battery(long capacity) {
		this(capacity, 0);
	}

	public Battery(long capacity, long idleTime) {
		this(capacity, idleTime, 0);
	}

	public Battery(long capacity, long idleTime, long hoursTalk) {
		this.capacity = capacity;
		this.idleTime = idleTime;
		this.hoursTalk = hoursTalk;
	}

	public long getCapacity() {
		return this.capacity;
	}

	public void setCapacity(long capacity) {
		this.capacity = capacity;
	}

	public long getIdleTime() {
		return this.idleTime;
	}

	public void setIdleTime(long idleTime) {
		this.idleTime = idleTime;
	}

	public long getHoursTalk() {
		return this.hoursTalk;
	}

	public void setHoursTalk(long hoursTalk) {
		this.hoursTalk = hoursTalk;
	}

	void printInfo() {
		System.out.println("The capacity of the battery is: " + this.capacity
				+ "mAh");
		System.out.println("The battery idle time is: " + this.idleTime
				+ "days");
		System.out.println("The battery talk hours are: " + this.hoursTalk
				+ "hours");

	}
}
