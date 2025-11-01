public class RecursaoVogaisIniciais {

    public static void main(String[] args) {
        int result = RecursaoVogaisIniciais.recursion(
                "amor elefante gato urso casa"
        );

        System.out.println(result);
    }

    public static int recursion(String s) {
        if (s.isBlank()) return 0;

        int spaceIndex = s.indexOf(" ");
        String palavra;
        String restante;

            if (spaceIndex == -1) {
            palavra = s;
            restante = "";
        } else {
            palavra = s.substring(0, spaceIndex);
            restante = s.substring(spaceIndex + 1);
        }

        char firstChar = palavra.toLowerCase().charAt(0);

        if (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u') {
            return 1 + recursion(restante);
        } else {
            return recursion(restante);
        }
    }
}
