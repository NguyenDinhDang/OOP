package bai6_basic.java;
import java.util.Scanner;

public class Main {
    int n;

    public Main(int n) {
        this.n = n;
    }
    
    public int factorial(int n) {
        if (n ==0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public boolean isPrime(int n) {
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

    public int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Main obj = new Main(n);
        System.out.println("Factorial of " + obj.n + " is: " + obj.factorial(obj.n));
        System.out.println("Is " + obj.n + " a prime number? " + obj.isPrime(obj.n));
        System.out.println("Sum of numbers from 1 to " + obj.n + " is: " + obj.sum(obj.n));
    }
}
