package javaLabCard1;
public class CheckPrimeNumber {
	public static void main(String[] args) {
		int number = 1239;
		
		boolean isPrime = true;
		
		for (int i =2; i<=Math.sqrt(number); i++) {
			if(number % i==0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println(number + "is a prime number");
		}else {
			System.out.println(number + "is not a prime number");
		}
		
	}


}
