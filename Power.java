import java.util.Scanner;

public class Power {
    public static int power(int baseNumber, int powerRaised) {
        if(powerRaised != 0) {
            return baseNumber * power(baseNumber, powerRaised - 1);
        } else {
            return 1;
        }
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the base number: ");
    int baseNumber  = sc.nextInt();
    System.out.print("Enter the power for the number: ");
    int powerRaised = sc.nextInt();

    int result = power(baseNumber, powerRaised);
    System.out.println(baseNumber + " ^ " + powerRaised + " = " + result);
    }
}
