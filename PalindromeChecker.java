public class PalindromeChecker {
    public static void main(String[] args) {
        String str = "abcba";
        
        if (isPalindrome(str)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) {
            return true;
        }

        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length() - 1);

        if (firstChar == lastChar) {
            // Recursively check the substring without the first and last characters.
            String subString = str.substring(1, str.length() - 1);
            return isPalindrome(subString);
        }

        return false;
    }
}
