package shape;

public class Triangle extends Shape {

	Triangle(double width, double height) {
		super(width, height);
	}

	@Override
	double calculateSurface() {
		return (super.height * super.width) / 2;
	}

}
