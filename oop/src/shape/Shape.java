package shape;

public abstract class Shape {

	protected double width = 0.0;
	protected double height = 0.0;

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	abstract double calculateSurface();

	Shape(double width, double height) {
		this.width = width;
		this.height = height;
	}
}
