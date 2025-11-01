package recursion;

public class RecursaoEmprimirPalavras {

    public static void main(String[] args) {
        RecursaoEmprimirPalavras.recursion("amor elefante gato urso casa");
    }

    public static void recursion(String s) {

        if (s.isBlank()) return;

        int indexOf = s.indexOf(" ");

        if (indexOf > 0) {
            System.out.println(s.substring(0,indexOf));
            recursion(s.substring(indexOf + 1));
        } else {
            System.out.println(s);
        }

    }

}
