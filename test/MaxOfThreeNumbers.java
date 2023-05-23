package test;

public class MaxOfThreeNumbers {
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		int c = 3;

		int max = a;

		if (b > max) {
			max = b;
		}

		if (c > max) {
			max = c;
		}

		System.out.println("The maximum of " + a + ", " + b + ", and " + c + " is: " + max);
	}
}


/*
he time complexity and The space complexity of this program is O(1), 
since we're only comparing three numbers and performing a few simple operations.
*/