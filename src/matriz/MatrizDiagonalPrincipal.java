package matriz;

public class MatrizDiagonalPrincipal {
    public static void main(String[] args) {
        solution(3, 3);
    }

    public static void solution(int r, int c) {
        int[][] matriz = new int[r][c];

        for(int i = 0; i < matriz.length; ++i) {
            for(int j = 0; j < matriz[i].length; ++j) {
                if (i == j) {
                    matriz[i][j] = 1;
                }
            }
        }

        for(int i = 0; i < matriz.length; ++i) {
            for(int j = 0; j < matriz[i].length; ++j) {
                System.out.print(matriz[i][j] + " ");
            }

            System.out.println();
        }

    }
}
