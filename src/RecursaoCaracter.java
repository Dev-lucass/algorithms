public class RecursaoCaracter {

    public static void main(String[] args) {
        RecursaoCaracter.recursion("amor");
    }

    public static void recursion (String s) {

        if (s.isEmpty()) {
            return;
        }

        System.out.println(s.charAt(0));
        recursion(s.substring(1));
    }
}
