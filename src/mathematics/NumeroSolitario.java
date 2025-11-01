package mathematics;

import java.util.HashSet;

public class NumeroSolitario {

    public static void main(String[] args) {
        System.out.println(
                NumeroSolitario.solution(new int[]{
                        4, 1, 2, 1, 2
                })
        );
    }

    public static HashSet<Integer> solution(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        for (int j : arr) {
            if (set.contains(j)) {
                set.remove(j);
            } else {
                set.add(j);
            }
        }

        return set;
    }

}