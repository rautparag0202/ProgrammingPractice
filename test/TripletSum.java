package test;

import java.util.Arrays;

public class TripletSum {

    public static boolean findTriplets(int[] arr, int sum) {
        int n = arr.length;
 
        // Sort the array
        Arrays.sort(arr);
 
        // Fix the first element and find the other two elements  and  iterate from second to last-2 element (arrayoutofindex)
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                if (arr[i] + arr[left] + arr[right] == sum) {
                    // Triplet found
                    System.out.println("Triplet is " + arr[i] + ", " + arr[left] + ", " + arr[right]);
                    return true;
                } else if (arr[i] + arr[left] + arr[right] < sum) {
                    left++;
                } else {
                    right--;
                }
            }
        }
 
        // No triplet found
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, 8};
        int sum = 22;
        if (!findTriplets(arr, sum)) {
            System.out.println("No triplet found with sum " + sum);
        }
    }
}

/*
 * 
This code takes an array of integers and a target sum as input and finds a triplet of numbers from the array 
whose sum is equal to the target sum. If such a triplet is found, it returns true and prints the triplet. 
If not, it returns false and prints a message saying that no triplet was found.

For example, if we run the above code with the input array {1, 4, 45, 6, 10, 8} and the target sum 22, it will output:
 * 
 * 
 * The triplet problem in Java refers to finding triplets of numbers in an array that sum up to a given target value. 
 * The problem can be solved by iterating over all possible combinations of three numbers in the array and checking 
 * if their sum equals the target value. However, this approach has a time complexity of O(n^3),
 *  where n is the size of the array, which can be very inefficient for large arrays.

To improve the performance of the algorithm, we can first sort the array in ascending order.
 Then, we can use two nested loops to iterate over pairs of numbers in the array. For each pair,
  we can check if there is a third number in the array that sums up to the target value minus the sum of the pair.
   This can be done using binary search or two pointers. This approach has a time complexity of O(n^2 log n) or O(n^2), 
   depending on the method used for searching for the third number.

Overall, the triplet problem in Java is a common coding interview question 
that tests the candidate's ability to optimize algorithms for time and space complexity.


 */






