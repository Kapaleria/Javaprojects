public class PrimeNumberMethod{
	public static void main(String[] args){
	System.out.println("the first 50 prime numbers are: \n");
	printPrimeNumbers(50);
	}
public static void printPrimeNumbers(int numberOfPrimes){
	final int NUMBER_OF_PRIMES_PER_LINE=10;
	int count=0;
	int number=2;
		//repeatedly find prime numbers
	while(count<numberOfPrimes){
		//print prime numbers and increase count
	if(isPrime(number)){
		count++;      //increase count
	if(count%NUMBER_OF_PRIMES_PER_LINE==0){
		
	System.out.printf("%-5s\n ",number);      //print the number and advance to a new line
	}
	else
		System.out.printf("%-5s ",number);	
		}
		number++;
	}	
}
public static boolean isPrime(int number){
	//check whether a number is a prime number
	for(int divisor=2;divisor<=number/2;divisor++){
		if(number%divisor==0){
	return false;//if true,the number is not prime
		}
		}
		return true; //number is prime
	}
}
