package test;

public class GetSingleDigitSum {
	    public static void main(String[] args) {
	        int num = 123456789;
	        int result = getSingleDigitSum(num);
	        System.out.println("The single digit sum of " + num + " is: " + result);
	    }

	    public static int getSingleDigitSum(int num) {
	        int sum = 0;

	        while (num > 0 || sum > 9) {
	            if (num == 0) {
	                num = sum;
	                sum = 0;
	            }

	            sum += num % 10;
	            num /= 10;
	        }

	        return sum;
	    }
	}


/*

The time complexity of the given program is O(log n) where n is the number of digits in the input 
integer because the number of iterations in the while loop is proportional to the number of digits in the input integer.
The space complexity of the program is O(1) because the amount of memory used by the program is constant, 
regardless of the size of the input integer.

*/