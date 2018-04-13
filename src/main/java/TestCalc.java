import static org.junit.Assert.assertTrue;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestCalc {
	
	public void testAddition() {
		assertTrue(Operation.addition(2, 3)==5);
	}

	public void testAdditionNeg() {
		assertTrue(Operation.addition(-6, 3)==-3);
	}
	
	public void testSoustraction() {
		assertTrue(Operation.soustraction(3, 2)==1);
	}

	public void testSoustractionNeg() {
		assertTrue(Operation.soustraction(2, 3)==-1);
	}

	public void testMult() {
		assertTrue(Operation.multiplication(2, 3)==6);
	}

	public void testMultiplicationZero() {
		assertTrue(Operation.multiplication(0, 3)==0);
	}

	public void testMultiplicationNeg() {
		assertTrue(Operation.multiplication(2, 3)==5);
	}
	
	public void testDivision() {
		assertTrue(Operation.division(6, 3)==2);
	}

	public void testDivisionZero() {
		assertTrue(Operation.division(5, 0)==5);
	}
}
