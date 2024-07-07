import java.util.Scanner;



public class GreaterNum {

    public static void printGreaterNum(int num1, int num2, int num3) {
    if(num1 > num2 && num1 > num3) {
        System.out.println("Largest: " + num1);
    } else if (num2 > num1 && num2 > num3) {
        System.out.println("Largest: " + num2);     
    } else {
        System.out.println("Largest: " + num3);
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter 2st number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter 3st number: ");
        int num3 = sc.nextInt();

        printGreaterNum(num1, num2, num3);
    }
}
