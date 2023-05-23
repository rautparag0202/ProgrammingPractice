package test;

public class PalindormNumber {
	
	public static void main(String[] args) {
		
	
	int num = -121; // The number to check for palindrome
	int original = num;
	num = Math.abs(num);
	int rev = 0;

	while (num > 0) {
	    int digit = num % 10;
	    rev = rev * 10 + digit;
	    num /= 10;
	}

	if (Math.abs(original) == rev) {
	    System.out.println(original + " is a palindrome");
	} else {
	    System.out.println(original + " is not a palindrome");
	}
	}
}


/*
The time complexity of the palindrome checking algorithm is O(log n), 
where n is the value of the input number. The space complexity of the algorithm is O(1), 
which is constant as the amount of memory used by the algorithm does not depend on the size of the input.

*/