package recursion;

public class RecursaoLetrasMaiusculas {

    public static void main(String[] args) {
        int result = RecursaoLetrasMaiusculas.recursion(
                "Amor Elefante GaTo uRso CasA"
        );

        System.out.println(result);
    }

    public static int recursion(String s) {

        if (s.isBlank()) return 0;

        if (Character.isUpperCase(s.charAt(0))) {
            return 1 + recursion(s.substring(1));
        }

        return recursion(s.substring(1));
    }
}
