
import java.util.Scanner;

public class CheckPrime {

    public static void primeNum(int num) {
        int count = 0;
        if (num > 1) {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println("A prime number");
            } else {
                System.out.println("Not a prime number");
            }
        } else {
            System.out.println("Not a palindrome number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        primeNum(num);
    }
}
