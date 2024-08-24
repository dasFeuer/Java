import java.util.Scanner;

public class PracticeProgram {
    public static void multiplyTable(String name, int table, int size){

        for (int i = 1; i <= size ; i++) {
            System.out.println(table + " X " + i + " = " + table *  i);
        }
        System.out.println();
        System.out.println(name + " has printed the table by giving userinput.");
        System.out.println("Thank you and see you soon again!");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter the number for the table of you need: ");
        int table = sc.nextInt();
        System.out.print("Enter the size of table: ");
        int size = sc.nextInt();

        System.out.println();

        multiplyTable(name, table, size);
    }
}
