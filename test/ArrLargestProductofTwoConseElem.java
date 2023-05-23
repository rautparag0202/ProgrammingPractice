package test;

public class ArrLargestProductofTwoConseElem {
		  public static void main(String[] args) {
		    int[] arr = {1, 9, 2, 3, 4, 5, 6};
		    int largestProduct = arr[0] * arr[1];
		    
		    for (int i = 1; i < arr.length - 1; i++) {
		      int currentProduct = arr[i] * arr[i+1];
		      if (currentProduct > largestProduct) {
		        largestProduct = currentProduct;
		      }
		    }
		    
		    System.out.println("The largest product of two consecutive elements is: " + largestProduct);
		  }
		}
/*
The time complexity of the program is O(n), where n is the length of the array, 
and the space complexity is O(1), since the program only uses a constant amount
of extra memory regardless of the size of the input array. 
*/