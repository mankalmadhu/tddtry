package tddtry.even;

import java.util.List;
import java.util.ArrayList;

public class PrimeFactorCalculator {

	List<Integer> getPrimeFactors(int input)
	{
		if(input == 2)
		{
			return new ArrayList<Integer>(2);
		}
		return new ArrayList<Integer>();
	}
}
