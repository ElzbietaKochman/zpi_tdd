package zpi.kochman.elzbieta.imp;

import java.util.List;

public class PrimeNumber {
	
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
	
}
