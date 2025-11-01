package matriz;

public class MatrizNumerosCrescentes {
    

    
        public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int num = 1;

        for(int i = 0; i < matriz.length; ++i) {
            for(int j = 0; j < matriz[i].length; ++j) {
                matriz[i][j] = num++;
            }
        }

        for(int i = 0; i < matriz.length; ++i) {
            for(int j = 0; j < matriz[i].length; ++j) {
                System.out.print("  " + matriz[i][j]);
            }

            System.out.println();
        }

    }
}
