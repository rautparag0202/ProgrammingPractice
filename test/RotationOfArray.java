package test;

import java.util.Arrays;

public class RotationOfArray {

	public static void leftRotate(int[] arr, int k) {
	    int n = arr.length;
	    k = k % n; // handle cases where k is greater than the length of the array
	    reverse(arr, 0, k - 1);
	    reverse(arr, k, n - 1);
	    reverse(arr, 0, n - 1);
	}

	public static void rightRotate(int[] arr, int k) {
	    int n = arr.length;
	    k = k % n; // handle cases where k is greater than the length of the array
	    reverse(arr, 0, n - 1);
	    reverse(arr, 0, k - 1);
	    reverse(arr, k, n - 1);
	}

	private static void reverse(int[] arr, int start, int end) {
	    while (start < end) {
	        int temp = arr[start];
	        arr[start] = arr[end];
	        arr[end] = temp;
	        start++;
	        end--;
	    }
	}

	
	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 4, 5};
		leftRotate(arr, 2);
		System.out.println(Arrays.toString(arr)); // Output: [3, 4, 5, 1, 2]

		int[] arr2 = {1, 2, 3, 4, 5};
		rightRotate(arr2, 2);
		System.out.println(Arrays.toString(arr2)); // Output: [4, 5, 1, 2, 3]

	}
	
}


// Time O(n) and Space - O(1)
/*

public static void leftRotate(int[] arr, int k) {
    int n = arr.length;
    k = k % n; // handle cases where k is greater than the length of the array
    for (int i = 0; i < k; i++) {
        int temp = arr[0];
        for (int j = 1; j < n; j++) {
            arr[j - 1] = arr[j];
        }
        arr[n - 1] = temp;
    }
}

public static void rightRotate(int[] arr, int k) {
    int n = arr.length;
    k = k % n; // handle cases where k is greater than the length of the array
    for (int i = 0; i < k; i++) {
        int temp = arr[n - 1];
        for (int j = n - 2; j >= 0; j--) {
            arr[j + 1] = arr[j];
        }
        arr[0] = temp;
    }
}


*/