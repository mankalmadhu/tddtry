package tddtry.even;

import java.util.List;
import java.util.ArrayList;

public class PrimeFactorCalculator {

	List<Integer> getPrimeFactors(int input)
	{
		List<Integer> result = new ArrayList<Integer>();
		if(input == 2 || input == 3)
		{
			result.add(2);
		}
		return result;
	}
}
