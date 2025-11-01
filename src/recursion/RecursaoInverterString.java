package recursion;

public class RecursaoInverterString {

    public static void main(String[] args) {
        System.out.println(recursion("amor"));
    }

    public static String recursion(String s) {

        if (s.isEmpty() || s.length() == 1) {
            return s;
        }

        return s.charAt(s.length() - 1) + recursion(s.substring(0, s.length() - 1));
    }
}
