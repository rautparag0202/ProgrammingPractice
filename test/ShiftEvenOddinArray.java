package test;

import java.util.Arrays;

public class ShiftEvenOddinArray {
	
	public static void shiftEvenOdd(int[] arr) {
	    int left = 0;
	    int right = arr.length - 1;
	    while (left < right) {
	        // Find the first even number from the left side
	        while (left < right && arr[left] % 2 == 0) {
	            left++;
	        }
	        // Find the first odd number from the right side
	        while (left < right && arr[right] % 2 != 0) {
	            right--;
	        }
	        // Swap the even and odd numbers
	        if (left < right) {
	            int temp = arr[left];
	            arr[left] = arr[right];
	            arr[right] = temp;
	            left++;
	            right--;
	        } }
	}
	 public static void main(String[] args) {
		 int[] arr = {2, 4, 1, 5, 6, 8, 9};
		 shiftEvenOdd(arr);
		 System.out.println(Arrays.toString(arr)); // Output: [2, 4, 8, 6, 5, 1, 9]
	}
}

/*
The time complexity of this algorithm is O(n), where n is the length of the input array. 
This is because we perform a constant amount of work for each element in the array.
 The space complexity is O(1), as we only need to store two integer variables.
*/