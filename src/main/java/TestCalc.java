import static org.junit.Assert.assertTrue;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestCalc {
	
	/**
	 * On teste l'addition de base
	 */
	public void testAddition() {
		assertTrue(Operation.addition(2, 3)==5);
	}

	/**
	 * On teste l'addition avec un param n�gatif
	 */
	public void testAdditionNeg() {
		assertTrue(Operation.addition(-6, 3)==-3);
	}
	
	/**
	 * On teste la soustraction avec un r�sultat positif
	 */
	public void testSoustraction() {
		assertTrue(Operation.soustraction(3, 2)==1);
	}

	/**
	 * On teste la soustraction avec une r�sultat n�gatif
	 */
	public void testSoustractionNeg() {
		assertTrue(Operation.soustraction(2, 3)==-1);
	}

	/**
	 * On teste la multiplication de deux positifs
	 */
	public void testMult() {
		assertTrue(Operation.multiplication(2, 3)==6);
	}

	/**
	 * On teste la multiplication avec un param�tre � z�ro
	 */
	public void testMultiplicationZero() {
		assertTrue(Operation.multiplication(0, 3)==0);
	}

	/**
	 * On teste la multiplication avec un param�tre n�gatif
	 */
	public void testMultiplicationNeg() {
		assertTrue(Operation.multiplication(-2, 3)==-6);
	}
	
	/**
	 * On teste une division avec deux param�tres positifs
	 */
	public void testDivision() {
		assertTrue(Operation.division(6, 3)==2);
	}
	
	/**
	 * On teste la division avec le second param�tre � z�ro
	 */
	public void testDivisionZero() {
		try {
			Operation.division(4, 0);
			assertTrue(false);
		}
		catch (Exception e){
			assertTrue(true);
		}
	}
}
