package strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AgruparNomesPorLetra {

    public static void main(String[] args) {
        solution(new String[]{
                "lucas", "sofia", "pedro", "vitor", "mauricio"
        });
    }

    public static void solution(String[] names) {

        Map<Character, List<String>> map = new HashMap<>();

        for (String v : names) {
            map.computeIfAbsent(
                    v.toUpperCase().charAt(0),
                    k -> new ArrayList<String>()
            ).add(v.toUpperCase());
        }

        System.out.println(map);
    }
}
