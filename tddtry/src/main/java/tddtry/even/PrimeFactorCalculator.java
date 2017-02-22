package tddtry.even;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeFactorCalculator {

	public List<Integer> getPrimeFactors(int input) {

		if (input == 1) {
			return new ArrayList<Integer>();
		}

		if (input == 2) {
			return new ArrayList<Integer>(Arrays.asList(2));
		}

		if ((input % 2) == 0) {

			return getPrimeFactorsForEvenNumbers(input);

		} else {

			return getPrimeFactorsForOddNumbers(input);
		}

	}

	private List<Integer> getPrimeFactorsForEvenNumbers(int input) {

		List<Integer> result = new ArrayList<Integer>();

		while (!isPrime(input)) {
			result.add(2);
			input /= 2;
		}

		if (isPrime(input)) {
			result.add(input);
		}

		return result;

	}

	private List<Integer> getPrimeFactorsForOddNumbers(int input) {

		List<Integer> result = new ArrayList<Integer>();
		if (isPrime(input)) {
			result.add(input);
		} else {
			for (int i = 3; i <= (int) Math.sqrt(input); i += 2) {
				if (isPrime(i) && (input % i) == 0) {
					result.add(i);
					input /= i;
				}
			}
			result.add(input);
		}

		return result;

	}

	private boolean isPrime(int input) {

		if (input == 2) {
			return true;
		}
		if (input % 2 == 0) {
			return false;
		}
		for (int i = 3; i * i <= input; i += 2) {
			if (input % i == 0)
				return false;
		}
		return true;

	}
}
