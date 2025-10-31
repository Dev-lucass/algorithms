import java.util.HashMap;
import java.util.Map;

public class PalavrasUnicas {

    public static void main(String[] args) {
        PalavrasUnicas.solution("o gato e o cachorro brincam no jardim com o gato");
    }

    public static void solution(String frase) {

        Map<String, Integer> map = new HashMap<>();

        String[] palavras = frase.split(" ");

        for (String v : palavras) {
            map.put(v, map.getOrDefault(v, 0) + 1);
        }

        System.out.print("Palavras únicas: ");

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
