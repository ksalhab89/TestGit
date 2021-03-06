package main.java;

public class MathOps {
	private int number1;
	private int number2;

	public MathOps(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}

	public int getNumber1() {
		return number1;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public int getNumber2() {
		return number2;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}

	public int add() {
		return number1 + number2;
	}

	public int subtract() {
		return number1 - number2;
	}

	public int multiplication() {
		return number1 * number2;
	}

	public int divide() {
		if (number2 == 0) {
			System.out.println("Division by Zero is not allowed!");
			return 0;
		}
		return number1 / number2;
	}

	@Override
	public String toString() {
		return "MathOps{" +
				       "number1=" + number1 +
				       ", number2=" + number2 +
				       '}';
	}
}
