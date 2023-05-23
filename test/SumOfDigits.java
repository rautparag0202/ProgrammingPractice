package test;

public class SumOfDigits {
	
	public static void main(String[] args) {
        int num = 12345;
        int sum = 0;
        
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        
        System.out.println("The sum of digits of " + num + " is: " + sum);
    }

}

/*
The time complexity of this program is O(log n), where n is the value of num. 
This is because we iterate over the digits of num one by one, and the number of digits in num is proportional to log n.

The space complexity of this program is O(1), 
since we're only using a few integer variables to store the input value and the sum.
*/
			

// Using  recursive function  Space and time complexity -- O(log n)

			//The space complexity of this program is O(log n) using recursive function, 
			// since we're using the call stack to store the intermediate results of the recursive calls. However, 
			//this can be optimized using tail recursion or iteration to avoid using the call stack.
/*

public class SumOfDigits {
    public static void main(String[] args) {
        int num = 12345;
        int sum = sumOfDigits(num);
        
        System.out.println("The sum of digits of " + num + " is: " + sum);
    }
    
    public static int sumOfDigits(int num) {
        if (num == 0) {
            return 0;
        } else {
            return (num % 10) + sumOfDigits(num / 10);
        }
    }
}

*/