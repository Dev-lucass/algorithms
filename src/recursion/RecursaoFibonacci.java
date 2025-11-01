package recursion;

public class RecursaoFibonacci {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacciRecursion(i) + " ");
        }
    }

    public static int fibonacciRecursion(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
    }
}
