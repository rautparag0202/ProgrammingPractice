package test;

public class Meadinoftwoarray {


	    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
	        int[] merged = new int[nums1.length + nums2.length];
	        int i = 0, j = 0, k = 0;
	        
	        // Merge the two arrays into a single sorted array
	        while (i < nums1.length && j < nums2.length) {
	            if (nums1[i] < nums2[j]) {
	                merged[k++] = nums1[i++];
	            } else {
	                merged[k++] = nums2[j++];
	            }
	        }
	        while (i < nums1.length) {
	            merged[k++] = nums1[i++];
	        }
	        while (j < nums2.length) {
	            merged[k++] = nums2[j++];
	        }
	        
	        // Find the median of the merged array
	        int n = merged.length;
	        if (n % 2 == 0) {
	            return (merged[n / 2 - 1] + merged[n / 2]) / 2.0;
	        } else {
	            return merged[n / 2];
	        }
	    }

	    public static void main(String[] args) {
	        int[] nums1 = {1, 3};
	        int[] nums2 = {2};
	        double median = findMedianSortedArrays(nums1, nums2);
	        System.out.println("The median of the two arrays is: " + median);
	    }
	}

/*
 * 

int[] arr1 = {1, 2, 3};
int[] arr2 = {4, 5, 6};

int[] mergedArr = new int[arr1.length + arr2.length];

System.arraycopy(arr1, 0, mergedArr, 0, arr1.length);
System.arraycopy(arr2, 0, mergedArr, arr1.length, arr2.length);

In this example, System.arraycopy() is used to copy the contents of arr1 and arr2 into a new array called mergedArr.
 The first parameter is the source array, the second parameter is the starting index of the source array to copy from, 
 the third parameter is the destination array, 
the fourth parameter is the starting index of the destination array to copy to, 
and the fifth parameter is the number of elements to copy.


or


public static int[] mergeArrays(int[] arr1, int[] arr2) {
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
    return merged;
}




 * 
 */






