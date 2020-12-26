import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import main.java.MathOps;

import static org.junit.Assert.assertEquals;

public class MathOpsTest {

	int num1;
	int num2;
	MathOps mathOps = new MathOps(num1, num2);

	@BeforeClass
	public static void SetupBeforeTesting() {
		System.out.println("Staring MathOps Unit Tests");
	}

	@AfterClass
	public static void FinishedTesting() {
		System.out.println("finished Testing MathOps Unit Tests");
	}

	@Test
	public void whenAddIsUsed_ThenReturnAddition() {
		int number1 = 5;
		int number2 = 4;
		mathOps.setNumber1(number1);
		mathOps.setNumber2(number2);
		assertEquals(mathOps.add(), number1 + number2);
	}

	@Test
	public void whenDivideIsUsed_TheReturnDivision() {
		int number1 = 10;
		int number2 = 2;
		mathOps.setNumber1(number1);
		mathOps.setNumber2(number2);
		assertEquals(mathOps.divide(), number1 / number2);
	}

	@Test
	public void whenNumber2inDivideIsZero_thenReturnZero() {
		int number1 = 10;
		int number2 = 0;
		mathOps.setNumber1(number1);
		mathOps.setNumber2(number2);
		assertEquals(mathOps.divide(), 0);
	}
}
