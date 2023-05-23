package test;

public class FibonacciSeries {

	// SUing Recursive 
	
	public static void main(String[] args) {
        int n = 10; // number of terms
        System.out.print("Fibonacci Series up to " + n + " terms: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
    
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
}

/*

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10; // number of terms
        int first = 0, second = 1, next;
        
        System.out.print("Fibonacci Series up to " + n + " terms: ");
        
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                System.out.print(first + " ");
                continue;
            }
            
            if (i == 2) {
                System.out.print(second + " ");
                continue;
            }
            
            next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }
}


*/