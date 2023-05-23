package test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonElemntinThreeARaay {
	
	    public static int[] findCommonElements(int[] arr1, int[] arr2, int[] arr3) {
	        Set<Integer> set1 = new HashSet<>();
	        Set<Integer> set2 = new HashSet<>();
	        Set<Integer> commonSet = new HashSet<>();
	        
	        for (int i = 0; i < arr1.length; i++) {
	            set1.add(arr1[i]);
	        }
	        
	        for (int i = 0; i < arr2.length; i++) {
	            if (set1.contains(arr2[i])) {
	                set2.add(arr2[i]);
	            }
	        }
	        
	        for (int i = 0; i < arr3.length; i++) {
	            if (set2.contains(arr3[i])) {
	                commonSet.add(arr3[i]);
	            }
	        }
	        
	        int[] commonArray = new int[commonSet.size()];
	        int index = 0;
	        for (int num : commonSet) {
	            commonArray[index++] = num;
	        }
	        return commonArray;
	    }
	    
	    public static void main(String[] args) {
	        int[] arr1 = {1, 5, 10, 20, 40, 80};
	        int[] arr2 = {6, 7, 20, 80, 100};
	        int[] arr3 = {3, 4, 15, 20, 30, 70, 80, 120};
	        int[] commonElements = findCommonElements(arr1, arr2, arr3);
	        System.out.println("Common elements in the arrays: " + Arrays.toString(commonElements));
	    }
	}

