public class PrimeNumbers
{
	public static void main(String[] args)
	{
		int amountToCheck = 1000000000;
		int primeCount = 0;
		// Adjustment factor is an approximation of the ration of primes and non-primes, in a given range
		// This fine-tunes the size of the array so that primes can be found minutely quicker
		// This only works on the second pass of the system. The first pass will run slower and return an adjustment factor for
		// That value of amountToCheck
		// Any adjustment factor smaller than that given (or even slightly more than) will kill the system

		float adjustmentFactor = 0.005f;
		
		// An array of all the primes that have been found
		int	primeArray[] = new int[(int)(amountToCheck * adjustmentFactor)];
		
		primeArray[0] = 2;
		for(int i = 1; i < amountToCheck; i++)
		{
			if(checkPrime(i, primeArray))
			{
				primeArray[primeCount] = i;
				primeCount++;
			}
		}
				
		System.out.println("Primes: " + primeCount);
		System.out.println("Adjustment Factor: " + (float)1/(amountToCheck/primeCount));
	}
	
	//public static boolean checkPrime(int i, ArrayList<Integer> newList)
	public static boolean checkPrime(int i, int[] arr)
	{
		boolean isPrime = true;
		//int max = (int)(Math.ceil(Math.sqrt(i)));
		
			for(int k : arr)
			{
				if(k > 1)
				{
					if(i % k == 0)
					{
						isPrime = false;
						break;
					}
				}
				else
					continue;
			}
			
		if(isPrime)
			System.out.println(i);
			 
		return isPrime;
	}
}
