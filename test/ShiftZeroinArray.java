package test;

import java.util.Arrays;

public class ShiftZeroinArray {

	public static void shiftZerosLeft(int[] arr) {
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[j] = arr[i];
				j++;
			}
		}
		while (j < arr.length) {
			arr[j] = 0;
			j++;
		}
	}

	public static void shiftZerosRight(int[] arr) {
		int j = arr.length - 1;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] != 0) {
				arr[j] = arr[i];
				j--;
			}
		}
		while (j >= 0) {
			arr[j] = 0;
			j--;
		}
	}
	
	
	public static void main(String[] args) {
		int[] arr = {0, 1, 0, 3, 12};

		// Shift zeros to the left
		shiftZerosLeft(arr);
		System.out.println(Arrays.toString(arr));

		// Shift zeros to the right
		shiftZerosRight(arr);
		System.out.println(Arrays.toString(arr));
		

	}

	// TIme - o(n) and space O(1)




}
