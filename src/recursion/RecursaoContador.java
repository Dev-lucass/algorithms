package recursion;

public class RecursaoContador {

    public static void main(String[] args) {
        recursion(1);
    }

    public static int recursion (int n) {
        System.out.println(n);

        if (n == 5) {
            return n;
        }

        return recursion(n + 1);
    }
}
