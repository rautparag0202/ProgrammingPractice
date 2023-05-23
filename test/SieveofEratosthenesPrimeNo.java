package test;

import java.util.Arrays;

public class SieveofEratosthenesPrimeNo {

	public static void main(String[] args) {

		int n = 50;
		System.out.print("Prime numbers between 1 and " + n + ": ");
		boolean[] isPrime = new boolean[n+1];
		Arrays.fill(isPrime, true);
		isPrime[0] = false;
		isPrime[1] = false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (isPrime[i]) {
				for (int j = i*i; j <= n; j += i) {
					isPrime[j] = false;
				}
			}
		}
		for (int i = 2; i <= n; i++) {
			if (isPrime[i]) {
				System.out.print(i + " ");
			}
		}
	}

}

/*

The Sieve of Eratosthenes algorithm is an ancient algorithm used to find all prime numbers up to a given limit n.
 It is named after the Greek mathematician Eratosthenes who discovered it. The algorithm works as follows:

    Create a boolean array isPrime of size n+1 and initialize all elements to true.
    Set isPrime[0] and isPrime[1] to false, since 0 and 1 are not prime.
    For each number i from 2 to the square root of n, if isPrime[i] is true, then mark all multiples of i as false in the isPrime array.
    Finally, iterate over the isPrime array and print all indices i where isPrime[i] is true.

We then use a for loop to iterate over each number i from 2 to the square root of n. 
If isPrime[i] is true, then we use another for loop to mark all multiples of i as false in the isPrime array. 
We start with j = i*i since all smaller multiples of i have already been marked as composite by smaller primes.

Finally, we iterate over the isPrime array and print all indices i where isPrime[i] is true. 
The time complexity of this algorithm is O(n * log(log(n))), 
which is much more efficient than the previous approach.

*/




