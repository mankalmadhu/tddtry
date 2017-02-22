package tddtry.even;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class PrimeFactorCaclulatorTest {

	public PrimeFactorCaclulatorTest(Integer inputNumber,
			List<Integer> expectedResult) {
		super();
		this.input = inputNumber;
		this.expectedResult = expectedResult;
		this.primeFactorCalculator = new PrimeFactorCalculator();
	}

	@Parameterized.Parameters
	public static Collection<Object[]> primeNumbers() {
		return Arrays.asList(new Object[][]{{1, new ArrayList<Integer>()},
				{2, new ArrayList<Integer>(Arrays.asList(2))},
				{3, new ArrayList<Integer>(Arrays.asList(3))},
				{4, new ArrayList<Integer>(Arrays.asList(2, 2))},
				{5, new ArrayList<Integer>(Arrays.asList(5))},
				{6, new ArrayList<Integer>(Arrays.asList(2, 3))},
				{7, new ArrayList<Integer>(Arrays.asList(7))},
				{8, new ArrayList<Integer>(Arrays.asList(2, 2, 2))},
				{9, new ArrayList<Integer>(Arrays.asList(3, 3))},
				{10, new ArrayList<Integer>(Arrays.asList(2, 5))},
				{11, new ArrayList<Integer>(Arrays.asList(11))},
				{12, new ArrayList<Integer>(Arrays.asList(2, 2, 3))},
				{13, new ArrayList<Integer>(Arrays.asList(13))},
				{14, new ArrayList<Integer>(Arrays.asList(2,7))},
				{15, new ArrayList<Integer>(Arrays.asList(3,5))}});
	}

	@Test
	public void testPrimeFactors() {
		assertEquals(expectedResult,
				primeFactorCalculator.getPrimeFactors(input));
	}

	private Integer input;
	private List<Integer> expectedResult;
	private PrimeFactorCalculator primeFactorCalculator;

}
