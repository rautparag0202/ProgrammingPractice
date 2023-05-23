package test;

public class UncommonElemntinTwoArray {

	
	    public static int findUncommonElement(int[] arr1, int[] arr2) {
	        int result = 0;
	        
	        for (int num : arr1) {
	            result ^= num;
	        }
	        
	        for (int num : arr2) {
	            result ^= num;
	        }
	        
	        return result;
	    }
	    
	    public static void main(String[] args) {
	        int[] arr1 = {1, 2, 3, 4, 5};
	        int[] arr2 = {3, 4, 5, 6, 7};
	        int uncommonElement = findUncommonElement(arr1, arr2);
	        System.out.println("The uncommon element is: " + uncommonElement);
	    }
	}

