
import java.util.Scanner;

public class Swap {
    public static void swapNumber(int number1, int number2){
        int anotherNumber = number1;
        number1 = number2;
        number2 = anotherNumber;

        System.out.println("The first number " + number1 + " is swapped with " + number2);
        System.out.println("The second number " + number2 + " is swapped with " + number1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number:");
        int number1 = sc.nextInt();
        System.out.print("Input second number:");
        int number2 = sc.nextInt();

        swapNumber(number1, number2);

    }   
}
