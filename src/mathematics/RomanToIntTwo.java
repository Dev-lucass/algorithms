package mathematics;

public class RomanToIntTwo {
    public static void main(String[] args) {
        RomanToInt romanToInt = new RomanToInt();
        int romanedToInt = romanToInt.romanToInt("MCMXCIV");
        System.out.println(romanedToInt);
    }

    private int value(char c) {
        switch (c) {
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'J':
            case 'K':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'W':
            default:
                return 0;
            case 'I':
                return 1;
            case 'L':
                return 50;
            case 'M':
                return 1000;
            case 'V':
                return 5;
            case 'X':
                return 10;
        }
    }

    public int romanToInt(String s) {
        int parsed = 0;

        for(int i = 0; i < s.length() - 1; ++i) {
            int c1 = this.value(s.charAt(i));
            int c2 = this.value(s.charAt(i + 1));
            if (c1 < c2) {
                parsed -= c1;
            } else {
                parsed += c1;
            }
        }

        parsed += this.value(s.charAt(s.length() - 1));
        return parsed;
    }
}
