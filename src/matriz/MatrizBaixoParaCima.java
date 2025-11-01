package matriz;

public class MatrizBaixoParaCima {
    public static void main(String[] args) {
        solution(3);
    }

    public static void solution(int n) {
        int[][] matriz = new int[n][n];
        int count = 1;

        for(int i = 0; i < matriz.length; ++i) {
            for(int j = 0; j < matriz[i].length; ++j) {
                matriz[j][i] = count++;
            }
        }

        printMatriz(matriz);
    }

    private static void printMatriz(int[][] matriz) {
        System.out.println("\nMATRIZ COMPLETA");

        for(int i = 0; i < matriz.length; ++i) {
            for(int j = 0; j < matriz[i].length; ++j) {
                System.out.print("  " + matriz[i][j]);
            }

            System.out.println();
        }

    }
}
