package shape;

import java.util.Arrays;

public class ShapeTest {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[5];
		shapes[0] = new Rectangle(4.0, 4.0);
		shapes[1] = new Triangle(5.0, 3.0);
		shapes[2] = new Circle(4.0);
		shapes[3] = new Triangle(6.0, 6.0);
		shapes[4] = new Circle(6.0);

		double[] areas = new double[5];
		areas[0] = shapes[0].calculateSurface();
		areas[1] = shapes[1].calculateSurface();
		areas[2] = shapes[2].calculateSurface();
		areas[3] = shapes[3].calculateSurface();
		areas[4] = shapes[4].calculateSurface();

		System.out.println(Arrays.toString(areas));
	}

}
