public class RecursaoVogais {

    public static void main(String[] args) {
        int total = recursion("recursao");
        System.out.println(total);
    }

    public static int recursion(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        char c = s.toLowerCase().charAt(0);

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return 1 + recursion(s.substring(1));
        } else {
            return recursion(s.substring(1));
        }
    }
}
