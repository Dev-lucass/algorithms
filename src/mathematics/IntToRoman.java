package mathematics;

import java.util.Map;

public class IntToRoman {

    public static void main(String[] args) {
        var intToRoman = new IntToRoman();
        String solution = intToRoman.solution(58);
        System.out.println(solution);
    }

    public Map<Integer, String> mapRoman() {
        return Map.ofEntries(
                Map.entry(1, "I"),
                Map.entry(4, "IV"),
                Map.entry(5, "V"),
                Map.entry(9, "IX"),
                Map.entry(10, "X"),
                Map.entry(40, "XL"),
                Map.entry(50, "L"),
                Map.entry(90, "XC"),
                Map.entry(100, "C"),
                Map.entry(400, "CD"),
                Map.entry(500, "D"),
                Map.entry(900, "CM"),
                Map.entry(1000, "M")
        );
    }

    public String solution(int num) {
        if (num <= 0) return "";

        StringBuilder result = new StringBuilder();
        Map<Integer, String> map = mapRoman();


        int[] valores = map.keySet().stream().sorted((a, b) -> b - a).mapToInt(Integer::intValue).toArray();

        int i = 0;

        while (num > 0) {

            int valorAtual = valores[i];

            if (num >= valorAtual) {
                num -= valorAtual;
                result.append(map.get(valorAtual));
            } else {
                i++;
            }
        }

        return result.toString();
    }
}
