package matriz;

public class MatrizEmL {
    public static void main(String[] args) {
        solution(3);
    }

    public static void solution(int n) {
        int[][] m = new int[n][n];
        int c = 1;

        for(int i = n - 1; i >= 0; --i) {
            for(int j = 0; j < n; ++j) {
                m[j][i] = c++;
            }
        }

        printMatriz(m);
    }

    public static void printMatriz(int[][] m) {
        for(int i = 0; i < m.length; ++i) {
            for(int j = 0; j < m[i].length; ++j) {
                System.out.print("  " + m[i][j]);
            }

            System.out.println();
        }

    }
}
