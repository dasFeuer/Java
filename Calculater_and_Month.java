
import java.util.Scanner;

public class Calculater_and_Month {

    public static void calculator(int firstNumber, String operaters, int secondNumber) {
        switch (operaters) {
            case "+" ->
                System.out.println("The addition of " + firstNumber + " and " + secondNumber + " is " + (firstNumber + secondNumber));
            case "-" ->
                System.out.println("The subtraction of " + firstNumber + " and " + secondNumber + " is " + (firstNumber - secondNumber));
            case "*" ->
                System.out.println("The multiplication of " + firstNumber + " and " + secondNumber + " is " + (firstNumber * secondNumber));
            case "/" -> {
                if (secondNumber != 0) {
                    double result = (double) firstNumber / secondNumber;
                    System.out.println("The division of " + firstNumber + " and " + secondNumber + " is " + result);
                } else {
                    System.out.println("Syntax Error! Division by 0 is not allowed.");
                }
            }
            default -> System.out.print("Invaild Operators! Restart the calaculator and try again.");

        }
    }

    public static void printMonth(int numberMonth) {
        switch (numberMonth) {
            case 1 -> System.out.println("1 is January");     
            case 2 -> System.out.println("2 is February");     
            case 3 -> System.out.println("3 is March");     
            case 4 -> System.out.println("4 is April");     
            case 5 -> System.out.println("5 is May");     
            case 6 -> System.out.println("6bis June");     
            case 7 -> System.out.println("7 is July");     
            case 8 -> System.out.println("8 is August");     
            case 9 -> System.out.println("9 is September");     
            case 10 -> System.out.println("10 is October");     
            case 11 -> System.out.println("11 is November");     
            case 12-> System.out.println("12 is December");
            default -> System.out.println("Input error! Restart the program and try again.");   
        }
    }

    public static void main(String[] args) {
        System.out.println("-----Welcome to my calculator-----");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter the operators +, -, *, / : ");
        String operaters = sc.next();
        System.out.print("Enter the second number: ");
        int secondNumber = sc.nextInt();
        calculator(firstNumber, operaters, secondNumber);

        System.out.println();

        System.out.println("-----Number to Months-----");
        System.out.println();
        System.out.print("Enter 1 to 12 to find out the respective months: ");
        int numberMonth = sc.nextInt();
        printMonth(numberMonth);
    }
}
