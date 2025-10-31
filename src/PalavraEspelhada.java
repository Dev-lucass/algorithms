import java.util.ArrayList;
import java.util.List;

public class PalavraEspelhada {

    public static void main(String[] args) {
        PalavraEspelhada.solution("amor roma casa asa ovo voo");
    }

    public static void solution(String s) {

        String[] split = s.toLowerCase().strip().split(" ");
        List<String> pares = new ArrayList<>();

        for (int i = 0; i < split.length; i++) {
            for (int j = i + 1; j < split.length; j++) {
                if (split[i].equals(reverse(split[j]))) {
                    pares.add(split[i] + " <-> " + split[j]);
                }
            }
        }

        if (pares.isEmpty()) {
            System.out.println("Nenhum espelho encontrado");
        } else {
            System.out.println("Pares espelhados encontrados:");
            for (String par : pares) {
                System.out.println(par);
            }
        }
    }

    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
