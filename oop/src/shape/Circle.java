package shape;

public class Circle extends Shape {

	Circle(double diameter) {
		super(diameter, diameter);
	}

	@Override
	double calculateSurface() {
		return Math.PI * (super.height / 2) * (super.height / 2);
	}

}
