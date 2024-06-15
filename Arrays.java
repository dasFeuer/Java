
import java.util.*;

public class Arrays {

    public static void main(String[] args) {
        // int [] marks = new int[3];
        // int [] marks = {99, 97, 93};
        // marks [0] = 99;
        // marks [1] = 97;
        // marks [2] = 93;
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int [] numbers = new int[size];
        // //Input
        // for (int i = 0; i < size; i++) {
        //     numbers[i] = sc.nextInt();
        // }
        // //Output
        // for (int i = 0; i < size; i++) {
        //     System.out.print(numbers[i]);
        // }

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numbers = new int[size];
        //Input
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        //Output
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                System.out.println("X is found at index: " + i);
            }
        }
        sc.close();
    }
}
