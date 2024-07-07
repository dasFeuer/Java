
import java.util.Scanner;

public class NaturalNum {

    public static void printNaturalNum(int number) {
        for (int i = 1; i <= number; i++) {
            
            System.out.println(i);
        }
        System.out.println();
    }
    public static void sumNatural(int number) {
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum = sum + i;

        }
        System.out.println("The sum of the natural number is: " + sum);
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        System.out.println("The natural number upto " + number +  " is: ");
        printNaturalNum(number);


        sumNatural(number);
    }
}
