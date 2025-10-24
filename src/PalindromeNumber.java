public class PalindromeNumber {
    public static void main(String[] args) {
        PalindromeNumber palindrome = new PalindromeNumber();
        boolean isPalindrome = palindrome.isPalindrome(121);
        System.out.println(isPalindrome);
    }

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else {
            int original = x;

            int numReverse;
            for(numReverse = 0; x > 0; x /= 10) {
                int lastDigit = x % 10;
                numReverse = numReverse * 10 + lastDigit;
            }

            return original == numReverse;
        }
    }
}
