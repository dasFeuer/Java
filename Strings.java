import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the size of letter: ");
        int size = sc.nextInt();
        String[] array = new String[size];

        int tolLength = 0;

        for (int i = 0; i < size; i++) {
            System.err.print("Write the letter: ");
            array[i] = sc.next();
            tolLength += array[i].length();
        }
        System.out.println("The lenght of all input letter is " + tolLength);
    }
}
