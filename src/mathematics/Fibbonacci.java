package mathematics;

public class Fibbonacci {

    public static void main(String[] args) {
        Fibbonacci.fibbonacci(5);
    }

    public static void fibbonacci(int n) {

        if (n < 0 || n == 1) return;


        int n1 = 0;
        int n2 = 1;
        int n3 = 0;

        System.out.println(n1);
        System.out.println(n2);

        for (int i = 1; i < n; i++) {
            n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
        }

    }

}
