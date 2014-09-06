package recordlabel;

public class Song {
	private String name =  null;
	private double duration = 0.00;
	
	public Song (String name, double duration) {
		this.name = name;
		this.duration = duration;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}
	
	@Override 
	public String toString() {
		String result = this.name + " : " + this.duration;
		return result;
	}
}
