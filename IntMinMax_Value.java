import java.util.*;
public class IntMinMax_Value {
    public static void printMinMax(int [] numbers) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] < min) {
                min = numbers[i];
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Largest number is " + max);
        System.out.println("Smallest number is " + min);
        
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the size of the number: ");
       int numberSize = sc.nextInt();
       int [] numbers = new int[numberSize];
       
       for (int i = 0; i < numberSize; i++) {
        System.out.print("Enter the number: ");
        numbers[i] = sc.nextInt();
       }
       printMinMax(numbers);
    }
}
