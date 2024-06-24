import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Zahl_Raten {

    static int myNumber = ThreadLocalRandom.current().nextInt(0, 100 + 1);
    static  int tries = 0;
    public static void guess(int number) {
        if(number == myNumber) {
            System.out.println("Richtig geraten!");
            System.out.println("Du hast " + tries + " Versuche gebraucht!");
        } else {
            System.out.println("Falsch geraten!");

            if(number < myNumber) {
                System.out.println("Deine Zahl ist zu klein!\n");
            } else {
                System.out.println("Deine Zahl ist zu groß!\n");
            }
            nextRound();
        }
    }

    public static void nextRound() {
        tries++;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte gebe eine Zahl ein: ");
        int number = sc.nextInt();
        guess(number);
    }

    public static void main(String[] args) {
        nextRound();
    }
}
