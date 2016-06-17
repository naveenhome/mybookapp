package rpn.calc;

import java.util.Stack;

public class RPNCalc {

	public int Calculate(String expr) {
		String[] input = expr.split(",");
		Stack<String> myStack = new Stack<String>();
		for (int i = 0; i < input.length; i++) {
			if (input[i].equals("+")) {
				int result = Integer.parseInt(myStack.pop()) + Integer.parseInt(myStack.pop());
				myStack.push(String.valueOf(result));
			}
			else if (input[i].equals("-")) {
				int secondNumber = Integer.parseInt(myStack.pop());
				int firstNumber = Integer.parseInt(myStack.pop());
				int result =  firstNumber- secondNumber;
				myStack.push(String.valueOf(result));
			}
			else if (input[i].equals("*")) {
				int secondNumber = Integer.parseInt(myStack.pop());
				int firstNumber = Integer.parseInt(myStack.pop());
				int result =  firstNumber * secondNumber;
				myStack.push(String.valueOf(result));
			}
			else {
				myStack.push(input[i]);
			}
			
		}
		return Integer.valueOf(myStack.pop());
	}
}