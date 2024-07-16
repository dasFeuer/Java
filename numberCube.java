
import java.util.Scanner;

public class numberCube {
    public static  void printCube(int number) {

        System.out.println("The cube of " + number + " is " + (number * number * number));

        System.out.println("------------------------------------");
    
        for (int i = 1; i <= number; i++) {
            System.out.println("The cube of " + i + " is " + i*i*i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number: ");
        int number = sc.nextInt();
        printCube(number);
    }
}
