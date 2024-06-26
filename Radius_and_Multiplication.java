import java.util.Scanner;

public class Radius_and_Multiplication {
    public static double printRaduis(double diameter) {
        double radius = diameter / 2;
        return radius;
    }

    public static void multiplication(int number) {
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(number + " X " + i + " = " + number*i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number to find out the raduis: ");
        double diameter = sc.nextDouble();
        double circle = printRaduis(diameter);
        System.out.println("Radius of circle is: " + circle + "m");

        System.out.println();

        System.out.println("------MULTIPLICATION------");
        System.out.print("Enter the number to get the multiplication from 1 to 10: ");
        int number = sc.nextInt();
        multiplication(number);
    }
}