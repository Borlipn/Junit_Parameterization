package core.Junit;

public class PrimeNumber                            {
    public boolean isPrime(final int prime_number)  {
          if (prime_number <= 1) return false; //1 is not prime number
          	if (prime_number == 2) return true; //2 is only even prime number
          		if (prime_number % 2 == 0) return false; //excluding all even number

          for (int i = 2; i < prime_number; i++)             {
             if (prime_number % i == 0)      return false;   }
                       return true; 							
			                          				}}
