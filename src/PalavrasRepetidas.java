import java.util.HashMap;
import java.util.Map;

public class PalavrasRepetidas {

    public static void main(String[] args) {
        PalavrasRepetidas.solution("o sol brilha e o sol aquece a terra");
    }

    public static void solution(String s) {

        Map<String,Integer> map = new HashMap<>();

        String[] split = s.split(" ");

        for ( String v : split) {
            map.put(v,map.getOrDefault(v,0) + 1);
        }

        System.out.println("TOTAL DE PALAVRAS REPETIDAS");
        System.out.println(map);
    }

}
