package test;

public class MergeTwoArrays {
	
	//Time and space -- o(m+n)

		    public static void main(String[] args) {
		        int[] arr1 = {1, 2, 3};
		        int[] arr2 = {4, 5, 6, 7};

		        int[] merged = new int[arr1.length + arr2.length];

		        int i = 0, j = 0, k = 0;

		        while (i < arr1.length && j < arr2.length) {
		            if (arr1[i] < arr2[j]) {
		                merged[k++] = arr1[i++];
		            } else {
		                merged[k++] = arr2[j++];
		            }
		        }

		        while (i < arr1.length) {
		            merged[k++] = arr1[i++];
		        }

		        while (j < arr2.length) {
		            merged[k++] = arr2[j++];
		        }

		        // Print the merged array
		        for (int x : merged) {
		            System.out.print(x + " ");
		        }
		    }
		}


/*

int[] arr1 = {1, 2, 3};
int[] arr2 = {4, 5, 6};

int[] mergedArr = Arrays.copyOf(arr1, arr1.length + arr2.length);
System.arraycopy(arr2, 0, mergedArr, arr1.length, arr2.length);


*/
