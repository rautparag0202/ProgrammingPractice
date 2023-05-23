package test;

public class NearestPrimenumber {
    public static void main(String[] args) {
        int n = 25;
        int nearestPrime = findNearestPrime(n);
        System.out.println("The nearest prime number to " + n + " is " + nearestPrime);
    }
    
    public static int findNearestPrime(int n) {
        if (isPrime(n)) {
            return n;
        }
        int lower = n - 1;
        while (!isPrime(lower)) {
            lower--;
        }
        int upper = n + 1;
        while (!isPrime(upper)) {
            upper++;
        }
        if (n - lower < upper - n) {
            return lower;
        } else {
            return upper;
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
