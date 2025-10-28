import java.util.*;

public class OrganizadorDePalavras {

    public static void main(String[] args) {
        System.out.println(
                new OrganizadorDePalavras().solution(new String[]{
                        "banana", "uva", "abacaxi", "laranja", "kiwi", "pera", "manga"
                })
        );
    }

    public Map<Integer, List<String>> solution(String[] list) {
        Map<Integer, List<String>> map = new HashMap<>();

        for (String palavra : list) {
            int tamanho = palavra.length();
            map.computeIfAbsent(tamanho, k -> new ArrayList<>()).add(palavra);
        }

        for (List<String> grupo : map.values()) {
            Collections.sort(grupo);
        }

        return map;
    }
}
