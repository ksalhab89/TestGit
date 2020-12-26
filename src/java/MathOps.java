package java;

public class MathOps {
	private final int number1;
	private final int number2;

	MathOps(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}


	public int add() {
		return number1 + number2;
	}

	public int divide() throws Exception {
		if (number2 == 0)
			throw new Exception("Division by Zero is not allowed!");

		return number1 / number2;

	}
}
