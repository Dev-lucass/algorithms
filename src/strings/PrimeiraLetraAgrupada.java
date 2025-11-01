package strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrimeiraLetraAgrupada {

    public static void main(String[] args) {
        PrimeiraLetraAgrupada.solution(
                "amor aranha avião casa cachorro carro"
        );
    }

    public static void solution(String s) {
        Map<Character, List<String>> map = new HashMap<>();

        String[] split = s.split(" ");

        for(String v : split) {
            map.computeIfAbsent(v.toUpperCase().charAt(0), k -> new ArrayList<String>()).add(v);
        }

        for(var entry : map.entrySet()) {
            if (entry.getValue().size() > 1) {
                System.out.println("Letra " + entry.getKey() + ": " + String.join(", ", entry.getValue()));
            }
        }
    }
}
