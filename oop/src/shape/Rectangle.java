package shape;

public class Rectangle extends Shape {

	Rectangle(double width, double height) {
		super(width, height);
	}

	@Override
	double calculateSurface() {
		return (super.height * super.width);
	}

}
