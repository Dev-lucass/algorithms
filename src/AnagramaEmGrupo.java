import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

public class AnagramaEmGrupo {

    public static void main(String[] args) {
        AnagramaEmGrupo.solution("roma amor ramo casa casaa");
    }

    public static void solution(String s) {

        Map<String, List<String>> map = new HashMap<>();
        String[] split = s.split(" ");

        for (String palavra : split) {
            String chave = ordenarLetras(palavra.toLowerCase());
            map.computeIfAbsent(chave, v -> new ArrayList<>()).add(palavra);
        }

        int grupoNum = 1;
        for (List<String> grupo : map.values()) {
            if (grupo.size() > 1) {
                System.out.println("Grupo " + grupoNum + ": " + String.join(", ", grupo));
                grupoNum++;
            }
        }
    }

    public static String ordenarLetras(String s) {
        char[] letras = s.toCharArray();
        Arrays.sort(letras);
        return new String(letras);
    }
}
