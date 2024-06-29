import java.util.*;
public class Input_Array {
    public static void printName(String [] names) {
        for (int i = 0; i < names.length; i++) {
            System.out.println("Name " + (i+1) + " is " + names[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size/turns of your name: ");
        int nameSize = sc.nextInt();
        String [] names = new String[nameSize];

        //Input size
        for (int i = 0; i < nameSize; i++) {
            System.out.print("Enter your name: ");
            names[i] = sc.next();
        }
        printName(names);
    }
}