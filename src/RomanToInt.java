import java.util.Map;

public class RomanToInt {
    private static final Map<Character, Integer> romanNums = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);

    public static void main(String[] args) {
        RomanToInt romanToInt = new RomanToInt();
        int romanedToInt = romanToInt.romanToInt("MCMXCIV");
        System.out.println(romanedToInt);
    }

    public int romanToInt(String s) {
        int parsed = 0;

        for(int i = 0; i < s.length() - 1; ++i) {
            int c1 = (Integer)romanNums.get(s.charAt(i));
            int c2 = (Integer)romanNums.get(s.charAt(i + 1));
            if (c1 < c2) {
                parsed -= c1;
            } else {
                parsed += c1;
            }
        }

        parsed += (Integer)romanNums.get(s.charAt(s.length() - 1));
        return parsed;
    }
}
