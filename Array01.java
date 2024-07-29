
import java.util.Arrays;
import java.util.Scanner;

public class Array01 {
    public static void addArr (int []input) {
        int sum = 0;
        for(int num: input) {
            sum += num;
        }
        System.out.print("Sum of the " + Arrays.toString(input) + " are: " + sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers you want to print: ");
        int size = sc.nextInt();
        System.out.println("------------------------------------");
        System.out.println("Please type 10 numbers to add: ");
        int [] input = new int[size];

        for (int i = 0; i < size; i++) {
            input[i] = sc.nextInt();
        }
        addArr(input);
        // int sum = 0;
        // for(int num: input) {
        //     sum += num;
        // }
        // System.out.println(sum);
    }
}