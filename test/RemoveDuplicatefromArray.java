package test;

import java.util.Arrays;

public class RemoveDuplicatefromArray {
	
	    public static int[] removeDuplicates(int[] arr) {
	        int n = arr.length;
	        if (n == 0 || n == 1) { // if array length is 0 or 1, return the original array
	            return arr;
	        }
	        int[] temp = new int[n];
	        int j = 0;
	        for (int i = 0; i < n - 1; i++) { // loop through the array and compare each element with its next element
	            if (arr[i] != arr[i + 1]) {
	                temp[j++] = arr[i];
	            }
	        }
	        temp[j++] = arr[n - 1]; // add the last element to the new array
	        int[] result = new int[j];
	        System.arraycopy(temp, 0, result, 0, j); // copy the non-duplicate elements to a new array
	        return result;
	    }

	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 2, 3, 5, 6, 6, 7};
	        int[] result = removeDuplicates(arr);
	        System.out.print("Original array: ");
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	        System.out.print("Array without duplicates: ");
	        for (int i = 0; i < result.length; i++) {
	            System.out.print(result[i] + " ");
	        }
	    }
	}

/*
 * 
 * 
  public static int[] removeDuplicates(int[] arr) {
  
    Arrays.sort(arr); // Sort the array first
    
    int n = arr.length;
    int j = 0; // Keep track of the index of the last unique element
    
    for (int i = 1; i < n; i++) {
        if (arr[i] != arr[j]) {
            arr[++j] = arr[i]; // Move the next unique element to the next position
        }
    }
    return Arrays.copyOf(arr, j + 1); // Return the new array with unique elements
}

 */

//time complexity of this method is O(nlogn) due to the sorting operation, 
//a the space complexity is O(1) as we are modifying the original array in place.