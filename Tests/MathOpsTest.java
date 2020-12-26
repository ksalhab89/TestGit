import main.java.MathOps;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

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
	public void whenSetAndGetNumber1_thenSetAndGetNumber1() {
		int number0 = 1;
		mathOps.setNumber1(number0);
		int number1 = mathOps.getNumber1();

		assertEquals(number0, number1);
	}

	@Test
	public void whenSetAndGetNumber2_thenSetAndGetNumber2() {
		int number0 = 10;
		mathOps.setNumber2(number0);
		int number2 = mathOps.getNumber2();

		assertEquals(number0, number2);
	}

	@Test
	public void whenAddIsUsed_ThenReturnAddition() {
		int number1 = 5;
		int number2 = 4;
		mathOps.setNumber1(number1);
		mathOps.setNumber2(number2);
		assertEquals(number1 + number2, mathOps.add());
	}

	@Test
	public void whenDivideIsUsed_TheReturnDivision() {
		int number1 = 10;
		int number2 = 2;
		mathOps.setNumber1(number1);
		mathOps.setNumber2(number2);
		assertEquals(number1 / number2, mathOps.divide());
	}

	@Test
	public void whenNumber2inDivideIsZero_thenReturnZero() {
		int number1 = 10;
		int number2 = 0;
		mathOps.setNumber1(number1);
		mathOps.setNumber2(number2);
		assertEquals(0, mathOps.divide());
	}

	@Test
	public void whenMultiply_thenReturnMultiplication() {
		int number1 = 5;
		int number2 = 5;
		mathOps.setNumber1(number1);
		mathOps.setNumber2(number2);
		assertEquals(number1 * number2, mathOps.multiplication());
	}

	@Test
	public void whenSubtract_thenReturnSubtraction() {
		int number1 = 6;
		int number2 = 5;
		mathOps.setNumber1(number1);
		mathOps.setNumber2(number2);
		assertEquals(number1 - number2, mathOps.subtract());
	}

}
