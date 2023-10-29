package Week3;

public class vjezba_rrr {
    public static void main(String[] args) {
        System.out.println(isPalindrome("anavolimilovana"));
        System.out.println(isPalindrome("luka"));
    }

    public static boolean isPalindrome(String str) {

        for (int i = 0, j = str.length()-1; i < j; i++, j--) {
            if (str.charAt(i) == str.charAt(j)) {
                return true;
            }
        }
        return false;
    }
}
