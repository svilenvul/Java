package calculator;

import java.util.*;

public class SimpleCalculator {

	public static double calculate(String expression) {
		Queue<String> convertedExpression = converPrefixToInfix(expression);
		double result = calculateExpression(convertedExpression);
		return result;
	}

	private static Queue<String> converPrefixToInfix(String expression) {
		Queue<String> result = new LinkedList<String>();
		Stack<String> operators = new Stack<String>();

		for (int i = 0; i < expression.length(); i++) {
			char token = expression.charAt(i);
			StringBuilder temp = new StringBuilder();
			while (Character.isDigit(token) || token == '.') {
				temp.append(token);
				i++;
				if (i < expression.length()) {
					token = expression.charAt(i);
				} else {
					break;
				}
			}
			if (temp.length() != 0) {
				result.offer(temp.toString());
			}
			if (token == '+' || token == '-') {
				if (!operators.isEmpty()) {
					while (operators.peek().matches("\\*")
							|| operators.peek().matches("/")) {
						String toRemove = operators.pop();
						result.offer(toRemove);
						if (operators.size() == 0) {
							break;
						}
					}
				} else {
					temp.append(token);
					i++;
					token = expression.charAt(i);
					while (Character.isDigit(token) || token == '.') {
						temp.append(token);
						i++;
						token = expression.charAt(i);
					}
					result.offer(temp.toString());
				}
				operators.add(Character.toString(token));
			}
			if (token == '*' || token == '/') {
				operators.push(Character.toString(token));
			}
			if (token == '(') {
				char next = expression.charAt(i + 1);
				if (next == '-') {
					temp.append(next);
					i++;
					i++;
					token = expression.charAt(i);
				}
				while (Character.isDigit(token) || token == '.') {
					temp.append(token);
					i++;
					token = expression.charAt(i);
				}
				if (temp.length() != 0) {
					result.offer(temp.toString());
				}
				operators.push(Character.toString('('));
			}
			if (token == ')') {
				while (!operators.peek().matches("\\(")) {
					String toRemove = operators.pop();
					result.offer(toRemove);
				}
				operators.pop();
			}
		}
		while (!operators.isEmpty()) {
			String toRemove = operators.pop();
			result.offer(toRemove);
		}
		return result;
	}

	private static double calculateExpression(Queue<String> convertedExpression) {
		Stack<Double> calculationStack = new Stack<Double>();
		while (!convertedExpression.isEmpty()) {
			String currToken = convertedExpression.poll();
			if (currToken.matches("[-0123456789.]+")) {
				double value = Double.parseDouble(currToken);
				calculationStack.push(value);
			}
			if (currToken.matches("\\*")) {
				double first = calculationStack.pop();
				double second = calculationStack.pop();
				double result = first * second;
				calculationStack.push(result);
			}
			if (currToken.matches("/")) {
				double second = calculationStack.pop();
				double first = calculationStack.pop();
				double result = first / second;
				calculationStack.push(result);
			}
			if (currToken.matches("-")) {
				double second = calculationStack.pop();
				double first = calculationStack.pop();
				double result = first - second;
				calculationStack.push(result);
			}
			if (currToken.matches("\\+")) {
				double first = calculationStack.pop();
				double second = calculationStack.pop();
				double result = first + second;
				calculationStack.push(result);
			}
		}
		double result = calculationStack.pop();
		return result;
	}
}
