package calculator;

public class SimpleCalculatorTest {
	public static void main(String[] args) {
		String expression = "2*4.14654";
		double result = SimpleCalculator.calculate(expression);
		System.out.println(result);
	}
}
