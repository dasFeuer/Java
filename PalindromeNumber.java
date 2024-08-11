
import java.util.Scanner;

public class PalindromeNumber {

    public static void revPalindrome(int num, int rev, int orginalNum) {
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        if (orginalNum == rev) {
            System.out.println(orginalNum + " Palindrome Number.");
        } else {
            System.out.println(orginalNum + " Not Palindrome Number.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int rev = 0;
        int num = sc.nextInt();
        int orginalNum = num;
        revPalindrome(num, rev, orginalNum);
    }
}
