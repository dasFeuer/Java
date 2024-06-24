import java.util.*;

public class Währungsrechner {
    public static void convertToDollar(double eur) {
        System.out.println("Der Betrag in Dollar ist: " + eur * 1.20);
    }
    public static void convertToYen(double eur) {
        System.out.println("Der Betrag in Yen ist: " + eur * 132.31);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bitte gebe einen Betrag in EUR an: ");
        double eur = sc.nextDouble();
        // double eur = 10.50;
        convertToYen(eur);
        convertToDollar(eur);
    }
    
}
