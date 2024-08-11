
import java.util.Scanner;

public class PalindromeString {

    public static void returnPalindromeString(String str, String originalStr, String rev) {
        int len = str.length();
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (originalStr.equals(rev)) {
            System.out.println(str + " is Palindrome String");
        } else {
            System.out.println(str + " is not Palindrome String");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        String originalStr = str;
        String rev = "";

        returnPalindromeString(str, originalStr, rev);
    }
}
