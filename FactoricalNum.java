
import java.util.Scanner;

public class FactoricalNum {
    //Logik 1
    public static void findFactorial(int num){
        long factorial = 1;
        for(int i = 1; i <= num; i++){
            factorial = factorial * i;
        }
        System.out.println("1. Factorical of " + num + " is " + factorial);
    }
    //Logik 2
    public static void descendingFindFactorial(int num){
        long factorial = 1;
        for (int i = num; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println("2. Factorical of " + num + " is " + factorial);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        System.out.println();
        findFactorial(num);
        System.out.println("------------------------");
        descendingFindFactorial(num);
    }
}
