package strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AgruparNomesPorLetra2 {

    public static void main(String[] args) {
        solution(new String[]{
                "lucas", "sofia", "pedro", "vitor", "mauricio"
        });
    }

    public static void solution(String[] names) {

        Map<Character, List<String>> map = new HashMap<>();

        for (String values : names) {
            char key = values.toUpperCase().charAt(0);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(values.toUpperCase());
        }
        for (String values : names) {
            char key = values.toUpperCase().charAt(0);
            map.computeIfPresent(key, (k,v) -> {
                v.replaceAll(s -> s.concat("-2025"));
                return v;
            });
        }

        System.out.println(map);
    }
}
