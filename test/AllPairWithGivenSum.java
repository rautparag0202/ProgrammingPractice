package test;

import java.util.HashSet;
import java.util.Set;


/*
 * Create a Hasset
 * Find sCompletemnt in hasset if it conatins
 * complement = target -  arra[i]
 * if haset contains compliement return  complement and arra[i[
 * else add arra[i] in hasset
 */
public class AllPairWithGivenSum {
	
	public static void printPairs(int[] arr, int sum) {
	    Set<Integer> set = new HashSet<>();
	    for (int i = 0; i < arr.length; i++) {
	        int complement = sum - arr[i];
	        if (set.contains(complement)) {
	            System.out.println("(" + complement + ", " + arr[i] + ")");
	        }
	        set.add(arr[i]);
	    }
	}
	
	public static void main(String[] args) {
		int[] arr = {2, 4, 5, 6, 7, 8, 9};
		int sum = 13;
		printPairs(arr, sum);

	}


}


//Time  and space - o(n)