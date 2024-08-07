import java.util.Scanner;

public class SwapMethod {
    public static void swapNum(int a, int b) {
        System.out.println("Before swapping values are " + a + " and " + b);
        // Logik 1

        // int temp;
        // temp = a;
        // a = b;
        // b = temp;

        //Logik 2

        // a = a + b;
        // b = a - b;
        // a = a - b;

        //Logik 3

        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println("After swapping the value are " + a + " and " + b);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a: ");
        int a = sc.nextInt();
        System.out.print("Enter number b: ");
        int b = sc.nextInt();

        swapNum(a, b);
    }
 }