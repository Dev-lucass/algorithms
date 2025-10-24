public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flor", "fluxo", "voo"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs != null && strs.length != 0) {
            StringBuilder builder = new StringBuilder();
            int minLength = Integer.MAX_VALUE;

            for(String s : strs) {
                if (s.length() < minLength) {
                    minLength = s.length();
                }
            }

            for(int i = 0; i < minLength; ++i) {
                char c = strs[0].charAt(i);

                for(int j = 1; j < strs.length; ++j) {
                    if (strs[j].charAt(i) != c) {
                        return builder.toString();
                    }
                }

                builder.append(c);
            }

            return builder.toString();
        } else {
            return "";
        }
    }
}
