public class MatrizParEImpar {
    public static void main(String[] args) {
        int[][][] matrizes = matrizes(6);
        System.out.println("Matriz Par:");
        printMatriz(matrizes[0]);
        System.out.println("\nMatriz Ímpar:");
        printMatriz(matrizes[1]);
    }

    public static int[][][] matrizes(int num) {
        int[][] matrizPar = new int[num][num];
        int[][] matrizImpar = new int[num][num];

        for(int i = 0; i < num; ++i) {
            for(int j = 0; j < num; ++j) {
                int valor = i * num + j;
                if (valor % 2 == 0) {
                    matrizPar[i][j] = valor;
                } else {
                    matrizImpar[i][j] = valor;
                }
            }
        }

        return new int[][][]{matrizPar, matrizImpar};
    }

    public static void printMatriz(int[][] matriz) {
        for(int[] linha : matriz) {
            for(int elemento : linha) {
                System.out.printf("%3d ", elemento);
            }

            System.out.println();
        }

    }
}
