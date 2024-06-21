import java.util.Scanner;

public class Variablen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Wie heißen Sie?: ");
        String name = sc.next();
        System.out.print("Was machen Sie Beruflich?: ");
        String job = sc.next();

        System.out.println("Hallo" + " " + name + "." + " Also, Sie sind eigentlich ein " + job + ", der Java lernst.");
        sc.close();

        //     System.out.print("Wie viel Uhr ist es?: ");
        //     int uhr = sc.nextInt();
        //     if (uhr < 12 && uhr > 1) {
        //         System.out.println("Guten Morgen!" + name);
        //     } else if (uhr > 12 && uhr < 16) {
        //         System.out.println("Guten Tag!" + name);
        //     } else if (uhr > 17 && uhr < 19) {
        //         System.out.println("Guten Abend!" + name);
        //     } else {
        //         System.out.println("Gute Nacht!" + name);
        //     }
    }
}
