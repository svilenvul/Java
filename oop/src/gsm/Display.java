package gsm;

public class Display {

	private int width;
	private int height;
	private int colours;

	public Display() {
		this(0, 0);
	}

	public Display(int width, int height) {
		this(width, height, 0);
	}

	public Display(int width, int height, int colours) {
		this.width = width;
		this.height = height;
		this.colours = colours;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getColours() {
		return colours;
	}

	public void setColours(int colours) {
		this.colours = colours;
	}

	void printInfo() {
		System.out.println("The display size is: " + this.width + "x"
				+ this.height + "px");
		System.out.println("The dislay has: " + this.colours
				+ "million colours");
	}
}
