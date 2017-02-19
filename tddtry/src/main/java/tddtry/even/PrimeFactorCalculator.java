package tddtry.even;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorCalculator {

	List<Integer> getPrimeFactors(int input) {
		List<Integer> result = new ArrayList<Integer>();

		if(input == 1){
			return result;
		}
		while (!isPrime(input)) {
			result.add(2);
			input /= 2;
		}
		if (isPrime(input)) {
			result.add(input);
		}

		return result;
	}

	private boolean isPrime(int input) {

		if(input == 2){
			return true;
		}
		if (input % 2 == 0){
			return false;
		}
		for (int i = 3; i * i <= input; i += 2) {
			if (input % i == 0)
				return false;
		}
		return true;

	}
}
