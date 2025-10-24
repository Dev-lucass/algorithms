public class MatrizeEspiral {
    public static void main(String[] args) {
        solution();
    }

    static void solution() {
        int[][] matriz = new int[3][3];
        int sum = 1;
        int left = 0;
        int right = 2;
        int top = 0;

        for(int bottom = 2; top <= bottom && left <= right; --right) {
            for(int coluna = left; coluna <= right; ++coluna) {
                matriz[top][coluna] = sum++;
            }

            for(int linha = top + 1; linha <= bottom; ++linha) {
                matriz[linha][right] = sum++;
            }

            if (top < bottom) {
                for(int coluna = right - 1; coluna >= left; --coluna) {
                    matriz[bottom][coluna] = sum++;
                }
            }

            if (left < right) {
                for(int linha = bottom - 1; linha > top; --linha) {
                    matriz[linha][left] = sum++;
                }
            }

            ++top;
            --bottom;
            ++left;
        }

        print(matriz);
    }

    static void print(int[][] matriz) {
        for(int[] ints : matriz) {
            for(int j = 0; j < ints.length; ++j) {
                System.out.print("  " + ints[j]);
            }

            System.out.println();
        }

    }
}
