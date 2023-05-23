package test;

public class RecursonPrintNumbers {
	
	
	  public static void main(String[] args) {
	        int n = 10;
	        printNumbersrecursive(n);
	        printNumbers(n);
	    }
	  
	
	public static void printNumbersrecursive(int n) {
        if (n > 0) {
        	printNumbersrecursive(n - 1);
            System.out.print(n + " ");
        }
    }
	
	public static void printNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

/*

Time and Space - O(n)
*/