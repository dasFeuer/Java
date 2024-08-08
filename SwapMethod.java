import java.util.Scanner;

public class SwapMethod {
    public static void swapNum(int a, int b) {
        System.out.println("Before swapping values are " + a + " and " + b);
        // Logik 1

        // int temp; 
        // temp = a; //  t = 3
        // a = b; // a = 4
        // b = temp; // b = 3

        //Logik 2

        // a = a + b;
        // b = a - b;
        // a = a - b;

        //Logik 3

        // a = a * b; // 3 * 4= 12
        // b = a / b; // 12 / 4 = 3
        // a = a / b; // 12 / 3 = 4 

        //Logik 4

        // a = a ^ b;
        // b = a ^ b;
        // a = a ^ b;

        //Logik 5

        b = a + b - (a = b);
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