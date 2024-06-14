public class Pallindrome {
    public static boolean ispalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean validPallindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                return ispalindrome(s, i + 1, j) || ispalindrome(s, i, j - 1);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abc";
        System.out.println(validPallindrome(s, 0, s.length() - 1));
    }
}
