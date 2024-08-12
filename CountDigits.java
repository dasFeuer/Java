
import java.util.Scanner;

public class CountDigits {
    public static void digitCount(int input){
        int count = 0;
        while(input > 0) {
            input = input/10;
            count++;
        }
        System.out.println("Number of digits: " + count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number: ");
        int input = sc.nextInt();

        digitCount(input);
    }
}
