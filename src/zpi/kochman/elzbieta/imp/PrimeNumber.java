package zpi.kochman.elzbieta.imp;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {
	
	public static int primesToGet = 10001;
	
	public static int addValueToListAndReturnSize(long value, List<Long> list){
		list.add(value);
		return list.size();
	}
	
	public static long calculateNextPrimeNumberOfThis(long prime){
		long new_prime = prime+1;
		while(true){
			for(int i = 2; i < new_prime/2; i++){
				if(new_prime % i == 0){
					break;
				}
				else if(new_prime/i <= i ){
					return new_prime;
				}
			}
			new_prime++;
		}
	}
	
	public static List<Long> getNPrimeNumbers(int numbersToGet){
		List<Long> primeNumbers = new ArrayList<Long>();
		primeNumbers.add(2L);
		while(primeNumbers.size() != numbersToGet){
			long next_prime = calculateNextPrimeNumberOfThis(primeNumbers.get(primeNumbers.size()-1));
			addValueToListAndReturnSize(next_prime, primeNumbers);
		}
		return primeNumbers;
	}
	
	public static long getAnswerToExcercise(){
		int nthPrime = 10001;
		List<Long> listOfPrimes = getNPrimeNumbers(nthPrime);
		return listOfPrimes.get(listOfPrimes.size()-1);
	}
	
}
