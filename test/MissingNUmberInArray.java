package test;

public class MissingNUmberInArray {

	    public static int findMissingNumber(int[] arr) {
	        int n = arr.length + 1;
	        int sum = n * (n + 1) / 2;
	        int arrSum = 0;
	        for (int i = 0; i < arr.length; i++) {
	            arrSum += arr[i];
	        }
	        return sum - arrSum;
	    }
	    
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 4, 6, 3, 7, 8, 5};
	        int missingNumber = findMissingNumber(arr);
	        System.out.println("The missing number in the array is: " + missingNumber);
	    }
	}