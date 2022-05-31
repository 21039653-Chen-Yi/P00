import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testadd() {
		int a = 1234;
		int b = 8765;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 9999;
		assertEquals(expected, actual);
	}
	public void testSubtract() {
		int a = 8765;
		int b = 1234;
		
		Calculator cal = new Calculator();
		int actual = cal.substract(a, b);
		
		int expected = 7531;
		assertEquals(expected, actual);
	}
	public void testMultiply() {
		int a = 5;
		int b = 2;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);
		
		int expected = 10;
		assertEquals(expected, actual);
	}
	public void testDivide() {
		int a = 10;
		int b = 2;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		
		int expected = 5;
		assertEquals(expected, actual);
	}
	
	
}
