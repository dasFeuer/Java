
import java.util.Scanner;

public class CountOddAndEven {

    public static void countDigitOddAndEven(int num) {
        int evenCount = 0;
        int oddCount = 0;

        while (num > 0) {
            int remiander = num % 10;

            if (remiander % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            num = num / 10;
        }
        System.out.println("Number ofnEven digits: " + evenCount);
        System.out.println("Number of Odd digits: " + oddCount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        countDigitOddAndEven(num);

    }
}
