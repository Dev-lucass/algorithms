public class TabuadaMatriz {
    public static void main(String[] args) {
        int num = 100;
        int[][] tabuada = new int[10][2];

        for(int i = 0; i < 10; ++i) {
            tabuada[i][0] = num;
            tabuada[i][1] = (i + 1) * num;
        }

        for(int i = 0; i < 10; ++i) {
            System.out.println(tabuada[i][0] + " x " + (i + 1) + " = " + tabuada[i][1]);
        }

    }
}
