package Lab04;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 6;
        int result = fibonacciRecursive(n);
        System.out.println("Fibonacci (recursive) of " + n + " is: " + result);

        int result2 = fibonacciIterative(n);
        System.out.println("Fibonacci (iterative) of " + n + " is: " + result2);
    }

    public static int fibonacciRecursive(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
    public static int fibonacciIterative(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        int prev1 = 0, prev2 = 1, current = 0;
        for (int i = 2; i <= n; i++) {
            current = prev1 + prev2;
            prev1 = prev2;
            prev2 = current;
        }
        return current;
    }
}
