import java.util.Scanner;

public class ShowAndAdd {

    public static void showOdd(int inputNumber) {
        for (int i = 0; i <= inputNumber; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd number upto " + inputNumber + " is " + i);
            }
        }
        System.out.println("---------------------");
    }

    public static void addOdd(int inputNumber) {
        int sum = 0;
        for (int i = sum; i <= inputNumber; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("The odd sum up to " + inputNumber + " is " + sum);
        System.out.println("---------------------");
    }

    public static void showEven(int inputNumber) {
        for (int i = 1; i <= inputNumber; i++) {
            if (i % 2 == 0) {
                System.out.println("Even number upto " + inputNumber + " is " + i);
            }
        }
        System.out.println("---------------------");
    }

    public static void addEven(int inputNumber) {
        int sum = 0;
        for (int i = sum; i <= inputNumber; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("The evem sum up to " + inputNumber + " is " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bitte geben Sie ein: ");
        int inputNumber = sc.nextInt();
        System.out.println("-----------------");

        showOdd(inputNumber);
        addOdd(inputNumber);
        showEven(inputNumber);
        addEven(inputNumber);
    }
}