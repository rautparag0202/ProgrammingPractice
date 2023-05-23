package test;

public class RecBasics {

}
/*

----------------------------------------------------------------------------------------------------

public class StringReverser {

    public static void main(String[] args) {
        String str = "Hello, World!";
        String reversedStr = reverseString(str);
        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reversedStr);
    }

    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}

----------------------------------------------------------------------------------------------------

public class FactorialCalculator {

    public static void main(String[] args) {
        int number = 5;
        long factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is " + factorial);
    }

    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }
}

----------------------------------------------------------------------------------------------------

public class FibonacciSeries {

    public static void main(String[] args) {
        int count = 10;
        System.out.print("Fibonacci series of " + count + " numbers: ");
        for (int i = 0; i < count; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}

// int i,fact=1;  
  int number=5;//It is the number to calculate factorial    
  for(i=1;i<=number;i++){    
      fact=fact*i;    
  }    
  System.out.println("Factorial of "+number+" is: "+fact);    
 }  
// 
----------------------------------------------------------------------------------------------------
    Factorial of number using recursion: Time Complexity - O(2^n), Space Complexity - O(n)
    Fibonacci series using recursion: Time Complexity - O(2^n), Space Complexity - O(n)
    Reverse a string using recursion: Time Complexity - O(2^n), Space Complexity - O(1)

----------------------------------------------------------------------------------------------------
*/