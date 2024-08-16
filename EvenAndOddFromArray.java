
import java.util.Scanner;

public class EvenAndOddFromArray {

    public static void printEven(int[] a) {
        System.out.println("Even numbers in array.");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i]);
            }
            
        }

        System.out.println();
        //Enchanced for loop
        System.out.println("Even numbers in array using enchanced loop.");
        for (int value : a) {
            if (value % 2 == 0) {
                System.out.print(value);
            }
        }
    }

    public static void printOdd(int[] a) {
        System.out.println("Odd numbers in array.");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                System.out.print(a[i]);
            }
        }

        System.out.println();

        //Enchanced for loop
        System.out.println("Odd numbers in array using enchanced loop.");
        for (int value : a) {
            if (value % 2 != 0) {
                System.out.print(value);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();

        int[] a = new int[size];

        System.out.println("Enter " + size + " numbers to find out the results: ");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println();
        printEven(a);
        System.out.println();
        printOdd(a);
    }
}
