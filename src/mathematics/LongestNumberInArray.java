package mathematics;

public class LongestNumberInArray {

    public static void main(String[] args) {
        System.out.println(
                LongestNumberInArray.solution(new int[]{
                        4, 5, 1, 2, 2, 4, 5, 6, 7, 7
                })
        );
    }

    public static int solution(int[] array) {
        int longest = 0;

        for (int i = 0; i < array.length; i++) {
            int count = 0;

            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }

            if (count == 1 && array[i] > longest) {
                longest = array[i];
            }
        }

        return longest;
    }
}
