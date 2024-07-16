
import java.util.Scanner;

public class VowelAndConsonant {

    public static void printAlphabet(String input) {
        boolean lowercase = input.charAt(0) >= 'a' && input.charAt(0) <= 'z';
        boolean vowels = input.equals("a") || input.equals("e") || 
        input.equals("i") || input.equals("o") || input.equals("u");

        if(input.length() > 1) {
            System.out.println("Error. Not a single character.");
        } else if (!(lowercase)) {
            System.out.println("Error. Not a letter. Enter uppercase or lowercase letter.");
        } else if (vowels) {
            System.out.println("Input letter is vowel.");
        } else {
            System.out.println("Input letter is consonant.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input an alphabet: ");
        String input = sc.next().toLowerCase();

        printAlphabet(input);
    }
}
