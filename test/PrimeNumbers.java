package test;

public class PrimeNumbers {
    public static void main(String[] args) {
        int n = 50;
        System.out.print("Prime numbers between 1 and " + n + ": ");
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}


/*

Sum of prime


public static void main(String[] args) {
int n = 50;
int sum = 0;
System.out.print("Prime numbers between 1 and " + n + ": ");
for (int i = 2; i <= n; i++) {
    if (isPrime(i)) {
        sum += i;
        System.out.print(i + " ");
    }
}
System.out.println("\nSum of prime numbers between 1 and " + n + ": " + sum);
}


*/