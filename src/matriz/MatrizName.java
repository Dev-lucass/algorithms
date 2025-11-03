package matriz;

import java.util.Arrays;

public class MatrizName {

    public static void main(String[] args) {
        String[][] m = new String[5][25];

        for (String[] linha : m) {
            Arrays.fill(linha, " ");
        }

        desenharL(m, 0);
        desenharU(m, 5);
        desenharC(m, 10);
        desenharA(m, 15);
        desenharS(m, 20);

        for (String[] linha : m) {
            for (String c : linha) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void desenharL(String[][] m, int offset) {
        for (int i = 0; i < 5; i++) {
            m[i][offset] = "|";
        }
        m[4][offset + 1] = "_";
        m[4][offset + 2] = "_";
    }

    public static void desenharU(String[][] m, int offset) {
        for (int i = 0; i < 4; i++) {
            m[i][offset] = "|";
            m[i][offset + 3] = "|";
        }
        m[4][offset + 1] = "_";
        m[4][offset + 2] = "_";
    }

    public static void desenharC(String[][] m, int offset) {

        for (int i = 1; i < 4; i++) {
            m[i][offset] = "|";
        }

        m[0][offset + 1] = "_";
        m[4][offset + 1] = "_";
        m[4][offset + 2] = "_";
    }

    public static void desenharA(String[][] m, int offset) {
        m[0][offset + 1] = "_";
        m[0][offset + 2] = "_";
        for (int i = 1; i < 5; i++) {
            m[i][offset] = "|";
            m[i][offset + 3] = "|";
        }
        m[2][offset + 1] = "_";
        m[2][offset + 2] = "_";
    }

    public static void desenharS(String[][] m, int offset) {
        m[0][offset + 1] = "_";
        m[0][offset + 2] = "_";
        m[1][offset] = "|";
        m[2][offset + 1] = "_";
        m[3][offset + 3] = "|";
        m[4][offset + 1] = "_";
        m[4][offset + 2] = "_";
    }
}
