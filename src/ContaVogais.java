import java.util.Scanner;

public class ContaVogais {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escreva uma palavra/frase:");
        String palavra = input.nextLine().trim().toLowerCase().replace(" ", "");
        int totalVogais = totalVogais(palavra);
        System.out.println("O total de vogais da palavra " + palavra + " é " + totalVogais);
    }

    public static int totalVogais(String palavra) {
        int contador = 0;

        for(int i = 0; i <= palavra.length() - 1; ++i) {
            char c = palavra.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                ++contador;
            }
        }

        return contador;
    }
}
