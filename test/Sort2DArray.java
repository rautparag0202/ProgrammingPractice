package test;

import java.util.Arrays;

public class Sort2DArray {
  public static void main(String[] args) {
	  
    int[][] arr = {{3, 2, 1}, {6, 5, 4}, {9, 8, 7}};
    
    // Flatten the 2D array into a 1D array
    int[] flatArr = new int[arr.length * arr[0].length];
    int k = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        flatArr[k++] = arr[i][j];
      }
    }
    
    // Sort the flattened array
    Arrays.sort(flatArr);
    
    // Reshape the sorted 1D array back into a 2D array
    int[][] sortedArr = new int[arr.length][arr[0].length];
    
    k = 0;
    
    for (int i = 0; i < sortedArr.length; i++) {
      for (int j = 0; j < sortedArr[i].length; j++) {
    	  
        sortedArr[i][j] = flatArr[k++];
      }
    }
    
    // Print the sorted 2D array
    for (int[] row : sortedArr) {
      System.out.println(Arrays.toString(row));
    }
  }
}
