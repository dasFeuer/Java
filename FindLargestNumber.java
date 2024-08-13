
import java.util.Scanner;

public class FindLargestNumber {

    public static void findLarge(int num1, int num2, int num3) {
        //Logik 1
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is largest number");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is largest number");
        } else {
            System.out.println(num3 + " is largest number");
        }
    }

    public static void findLarge2(int num1, int num2, int num3) {
        //Logik 2

        //Ternary operator

        //Method 1
        // int largest = num1 > num2 ? num1 : num2; // Largest of num1 and num2
        // int largest2 = num3 > largest ? num3 : largest; //Largest of num3 and largest1

        //Method 2
         int largest = num3 > (num1 > num2 ? num1 : num2) ? num3 : (num1 > num2 ? num1 : num2);
        System.out.println(largest + " is largest number");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter 3rd number: ");
        int num3 = sc.nextInt();

        System.out.println("-----------------------");

        findLarge(num1, num2, num3);

        System.out.println("-----------------------");

        findLarge2(num1, num2, num3);
    }
}
