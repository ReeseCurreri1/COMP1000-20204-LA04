import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuadraticEqcalcTest {

	@Test
	void testTwoRealRoots1() {
		double a = 1.0, b = -7.0, c = 10.0;
		assertTrue(QuadraticEqcalc.hasRealRoots(a, b, c));
		double root1 = QuadraticEqcalc.getRoot1(a, b, c);
		double root2 = QuadraticEqcalc.getRoot1(a, b, c);
		double TOLERANCE = 1.0e-6;
		assertEquals(2.0,root1, TOLERANCE);
		assertEquals(5.0,root2, TOLERANCE);
		
	}
	@Test
	void testTwoImaginaryRoots1() {
		double a = 1.0, b = 1.0, c = 10.0;
		assertFalse(QuadraticEqcalc.hasRealRoots(a, b, c));
		double root1 = Double.NaN;
		double root2 = Double.NaN;
		double TOLERANCE = 1.0e-6;
		assertEquals(Double.NaN,root1, TOLERANCE);
		assertEquals(Double.NaN,root2, TOLERANCE);

		
		
	}
	@Test
	void testTwoEqualRoots1() {
		double a = 1.0, b = 2.0, c = 1.0;
		assertFalse(QuadraticEqcalc.hasRealRoots(a, b, c));
		double root1 = (QuadraticEqcalc.getRoot1(a, b, c));
		double root2 = (QuadraticEqcalc.getRoot2(a, b, c));
		double TOLERANCE = 1.0e-6;
		assertEquals(-1.0,root1, TOLERANCE);
		assertEquals(-1.0,root2, TOLERANCE);
	}
	@Test
	void testTwononuniqueRoots1() {
		double a = 1.0, b = -5.0,c = 6.0;
		assertTrue(QuadraticEqcalc.hasRealRoots(a, b, c));
		double root1 = QuadraticEqcalc.getRoot1(a, b, c);
		double root2 = QuadraticEqcalc.getRoot1(a, b, c);
		double TOLERANCE = 1.0e-6;
		assertEquals(2.0, root1, TOLERANCE);
		assertEquals(2.0, root2, TOLERANCE);
	}

	@Test
	void testCaseARoots1() {
		double a = 2, b = 4, c = 10;
		assertFalse(QuadraticEqcalc.hasRealRoots(a, b, c));
		double root1 = QuadraticEqcalc.getRoot1(a, b, c);
		double root2 = QuadraticEqcalc.getRoot2(a, b, c);
		double TOLERANCE = 1.0e-6;
		assertEquals(Double.NaN, root1, TOLERANCE);
		assertEquals(Double.NaN, root2, TOLERANCE);
	}

	@Test
	void testCaseBRoots1() {
		double a = 2, b = 0, c = 4;
		assertFalse(QuadraticEqcalc.hasRealRoots(a, b, c));
		double root1 = QuadraticEqcalc.getRoot1(a, b, c);
		double root2 = QuadraticEqcalc.getRoot1(a, b, c);
		double TOLERANCE = 1.0e-6;
		assertEquals(Double.NaN, root1, TOLERANCE);
		assertEquals(Double.NaN, root2, TOLERANCE);
}

	@Test
	void testCaseCRoots1() {
		double a = 2, b = 4, c = 0;
		assertTrue(QuadraticEqcalc.hasRealRoots(a, b, c));
		double root1 = QuadraticEqcalc.getRoot1(a, b, c);
		double root2 = QuadraticEqcalc.getRoot1(a, b, c);
		double TOLERANCE = 1.0e-6;
		assertEquals(-2.0, root1, TOLERANCE);
		assertEquals(-2, root2, TOLERANCE);
}

	@Test
	void testCombinationOfOtherCaseRoots1() {
		double a = 0, b = 4, c = 2;
		assertTrue(QuadraticEqcalc.hasRealRoots(a, b, c));
		double root1 = QuadraticEqcalc.getRoot1(a, b, c);
		double root2 = QuadraticEqcalc.getRoot1(a, b, c);
		double TOLERANCE = 1.0e-6;
		assertEquals(-0.5, root1, TOLERANCE);
		assertEquals(-0.5, root2, TOLERANCE);
	}

}



	

	


