package test;

public class ArmstronfNo {
	
	public static void main(String[] args) {
		
		int num = 153; // The number to check for Armstrong
		int original = num;
		int sum = 0;

		while (num > 0) {
		    int lastdigit = num % 10;
		    sum += (lastdigit * lastdigit * lastdigit);
		    num /= 10;
		}

		if (original == sum) {
		    System.out.println(original + " is an Armstrong number");
		} else {
		    System.out.println(original + " is not an Armstrong number");
		}

	}

}

/*

Time complexity: O(log N), where N is the number of digits in the input number.
 This is because we iterate through each digit in the number once, and the number of digits in N is log base 10 of N.
Space complexity: O(1), as we are only using a few variables to store the input number, 
the sum of cubes, and some temporary variables, and the amount of space used by these variables does not depend on the input size.

*/