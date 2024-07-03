
import java.util.Scanner;

public class DecToBin {

    public static void decimalToBinary(int number, int size, int[] binaryNumber) {

        int i = 0;
        while (number > 0) {
            binaryNumber[i] = number % 2;
            number = number / 2;
            i++;
        }

        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binaryNumber[j]);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        System.out.print("Enter the Size of Binary: ");
        int size = sc.nextInt();
        int[] binaryNumber = new int[size];

        System.out.println("Decimal- " + number);
        System.out.print("Binary- ");
        decimalToBinary(number, size, binaryNumber);
    }
}
