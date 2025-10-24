public class MatrizZigZagReverse {
    public static void main(String[] args) {
        solution(4);
    }

    public static void solution(int n) {
        int[][] m = new int[n][n];
        int c = 1;

        for(int row = n - 1; row >= 0; --row) {
            if (row % 2 == 0) {
                for(int col = 0; col <= n - 1; ++col) {
                    m[row][col] = c++;
                }
            } else {
                for(int col = n - 1; col >= 0; --col) {
                    m[row][col] = c++;
                }
            }
        }

        printMatriz(m);
    }

    public static void printMatriz(int[][] m) {
        for(int i = 0; i < m.length; ++i) {
            for(int j = 0; j < m[i].length; ++j) {
                System.out.print("   " + m[i][j]);
            }

            System.out.println();
        }

    }
}
