package matriz;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class MatrizZigZag {
    public static void main(String[] args) {
        int[][] m = matriz(4);

        for(int i = 0; i < m.length; ++i) {
            for(int j = 0; j < m[i].length; ++j) {
                System.out.print("  " + m[i][j]);
            }

            System.out.println();
        }

    }

    public static int[][] matriz(int n) {
        int[][] m = new int[n][n];
        int c = 1;

        for(int i = 0; i < n; ++i) {
            if (i % 2 == 0) {
                for(int j = 0; j < n; ++j) {
                    m[i][j] = c++;
                }
            } else {
                for(int j = n - 1; j >= 0; --j) {
                    m[i][j] = c++;
                }
            }
        }

        return m;
    }
}
