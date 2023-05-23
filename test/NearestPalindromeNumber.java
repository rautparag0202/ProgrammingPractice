package test;

public class NearestPalindromeNumber {
	public static int findNearestPalindrome(int num) {
		if (num < 10) { // Single-digit numbers are already palindromes
			return num;
		}
		int originalNum = num;
		int reverse = 0;
		while (num > 0) { // Reverse the number
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num /= 10;
		}
		System.out.println("The original numbber: " +originalNum);
		System.out.println("reverse of original numbber: " +reverse);

		if (originalNum == reverse) { // If the number is already a palindrome, return it
			return originalNum;
		}
		int diff1 = originalNum - reverse; // Calculate the difference between the original number and its reverse
		int newNum1 = originalNum - diff1; // Get the nearest palindrome less than the original number
		int diff2 = originalNum - reverse + 11; // Calculate the difference between the original number and its next palindrome
		int newNum2 = originalNum + diff2; // Get the nearest palindrome greater than the original number
		System.out.println("diff1 = originalNum - reverse is: "+diff1);
		System.out.println("newNum1 = originalNum - diff1 is: "+newNum1 );
		System.out.println("diff2 = originalNum - reverse + 11 is: "+diff2);
		System.out.println("newNum2 = originalNum + diff2 is: "+newNum2);

		if (Math.abs(diff1) < Math.abs(diff2)) { // Return the nearest palindrome
			return newNum1;
		} else {
			return newNum2;
		}
	}

	public static void main(String[] args) {
		int num = 12345;
		int nearestPalindrome = findNearestPalindrome(num);
		System.out.println("The nearest palindrome number to " + num + " is " + nearestPalindrome);
	}
}


/*

In this program, we first check if the input number is a single-digit number,
in which case it is already a palindrome and we can return it.

We then reverse the input number to check if it is already a palindrome.If it is, we can return it.

Otherwise, we calculate the difference between the input number and its reverse, 
and use this to find the nearest palindromes less than and greater than the input number. We then return the nearest palindrome.

 ***************************************************************************************************************
 *
The time complexity of this program is O(log n),
where n is the input number. This is because we reverse the input number,
which takes O(log n) time. The rest of the program performs constant-time operations.


The space complexity of this program is O(1), 
because we use only a fixed number of integer variables to perform the calculations.

 ***************************************************************************************************************

    diff1 is calculated by subtracting the reverse of the input number from the original input number.
    This gives the difference between the two numbers.

    newNum1 is then obtained by subtracting diff1 from the original input number.
    This gives the nearest palindrome number that is less than the original input number.

    diff2 is calculated by adding 11 to the difference between the original input number and its reverse.
    This is because if the difference between the original input number and its reverse is less than 11, then the next palindrome number is obtained by simply adding 11 to the original input number.

    newNum2 is then obtained by adding diff2 to the original input number.
    This gives the nearest palindrome number that is greater than the original input number.

Finally, the function returns the nearest palindrome number by comparing the absolute values of diff1 and diff2. 
If diff1 is smaller, then newNum1 is returned, otherwise newNum2 is returned.

 ***************************************************************************************************************

The reason for adding 11 to the difference between the original input number and 
its reverse is that adding 11 will result in the next palindrome number that is greater than the original input number.

For example, let's say the original input number is 200. The reverse of 200 is 2, 
so the difference between the two is 198. However, the next palindrome number greater than 200 is 202, not 398.

To handle such cases, the program adds 11 to the difference between the original input number and 
its reverse to get the next palindrome number that is greater than the original input number.
 ***************************************************************************************************************

The original numbber: 12345
reverse of original numbber: 54321
diff1 = originalNum - reverse is: -41976
newNum1 = originalNum - diff1 is: 54321
diff2 = originalNum - reverse + 11 is: -41965
newNum2 = originalNum + diff2 is: -29620
The nearest palindrome number to 12345 is -29620


 */




