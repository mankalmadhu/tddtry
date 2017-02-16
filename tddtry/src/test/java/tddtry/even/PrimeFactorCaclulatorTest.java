package tddtry.even;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PrimeFactorCaclulatorTest {

	@Test
	public void testForOne() {
		List<Integer> primeFactors = new PrimeFactorCalculator().getPrimeFactors(1);
		assertTrue(primeFactors.isEmpty());
	}

	@Test
	public void testForTwo() {
		List<Integer> primeFactors = new PrimeFactorCalculator().getPrimeFactors(2);
		assertTrue(primeFactors.get(0) == 2);
	}

	@Test
	public void testForThree() {
		List<Integer> primeFactors = new PrimeFactorCalculator().getPrimeFactors(3);
		assertTrue(primeFactors.get(0) == 2);
	}

	@Test
	public void testForFour() {
		assertEquals(new ArrayList<Integer>(Arrays.asList(2, 2)), new PrimeFactorCalculator().getPrimeFactors(4));
	}

}
