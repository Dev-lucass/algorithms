import java.util.HashSet;

public class SubArrayIgualA0 {


    public static void main(String[] args) {
        System.out.println(
                solution(new int[]{
                        4, 2, -3, 1, 6
                })
        );
    }

    // O subarray [2, -3, 1] soma 0.
    public static boolean solution(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        boolean result = false;

        int sum = 0;

        for (int nums : arr) {
            sum += nums;

            if(sum == 0) result = true;

            if (set.contains(sum)) result = true;
            else set.add(sum);
        }
        return result;
    }
}
