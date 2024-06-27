import java.util.*;

public class Even_num {
    public static void printEven(int evenNumber){
        int number = 0;
        for (int i = 0; i <= evenNumber; i++) {
            if(i % 2 == 0) {
                number = number + i;
            }
        }
        System.out.println("The addition of upto " + evenNumber + " for even number is " + number);
    }

    public static void printOdd(int oddNumber) {
        int num = 0;
        for (int i = 0; i <= oddNumber; i++) {
            if(i % 2 != 0) {
                num = num + i;
            }
        }
        System.out.println("The addition of upto " + oddNumber + " for even number is " + num);
    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("----EVEN NUMBERS----");
    System.out.print("Enter the number to get even numbers: ");
    int evenNumber = sc.nextInt();
    printEven(evenNumber);

    System.out.println();
    System.out.println("----ODD NUMBERS----");
    System.out.print("Enter the number to get odd numbers: ");
    int oddNumber = sc.nextInt();
    printOdd(oddNumber);

    }
}