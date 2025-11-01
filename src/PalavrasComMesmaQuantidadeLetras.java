import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PalavrasComMesmaQuantidadeLetras {

    public static void main(String[] args) {
        PalavrasComMesmaQuantidadeLetras.solution(
                "sol lua casa arara gato cachorro"
        );
    }

    public static void solution(String s) {

        Map<Integer, List<String>> map = new HashMap<>();
        String[] split = s.split(" ");

        for (String v : split) {
            map.computeIfAbsent(v.length(), k -> new ArrayList<>()).add(v);
        }

        for (Map.Entry<Integer, List<String>> entry : map.entrySet()) {
            if (entry.getValue().size() > 1) {
                System.out.println("Tamanho " + entry.getKey() + ": " + String.join(", ", entry.getValue()));
            }
        }

    }


}
