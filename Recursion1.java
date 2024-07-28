import java.util.Scanner;

public class Recursion1 {
    public static int printSum(int num) {        
        if(num == 1) {
            return 1;
        } else {
            return num + printSum( num - 1);
        }
    }
    public static int printPower(int num, int power){
        if(num == 1 || power == 1) {
            return num;
        } else if (num == 0 || power == 0) {
            return 0;
        } else {
            return num * printPower(num , power - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        int result = printSum(num);
        System.out.println("The sum upto " + num + " is " +result);

        int result1 = printPower(num, power);
        System.out.println(num + " ^ " + power + " = " + result1);
    }
}
