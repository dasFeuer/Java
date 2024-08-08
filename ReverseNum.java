
import java.util.Scanner;

public class ReverseNum {

    public static int revNum(int num, int reverse) {
        // Logik 1
        while (num != 0) {
            reverse = reverse * 10 + num % 10;
            num = num / 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();

        int reverse = 0;

        int result = revNum(num1, reverse);
        System.out.println("1. Reversed number is " + result);

        // Logik 2 -- String Buffer class
        StringBuffer sb = new StringBuffer(String.valueOf(num1));
        StringBuffer rev = sb.reverse();
        System.out.println("2. Reversed number is " + rev);

        // Logik 3 -- String Builder class
        StringBuilder sb1 = new StringBuilder(String.valueOf(num1));
        StringBuilder rev1 = sb1.reverse();
        System.out.println("3. Reversed number is " + rev1);

        // or

        StringBuilder sb2 = new StringBuilder();
        sb2.append(num1);
        StringBuilder rev2 = sb2.reverse();
        System.out.println("4. Reversed number is " + rev2);

        // Or

        StringBuilder sb3 = new StringBuilder();
        sb3.append(num1);
        sb3.reverse();
        System.out.println("5. Reversed number is " + rev1);




    }
}
