
import java.util.Scanner;

public class CountWords {
    public static void words(String str){
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if ((str.charAt(i) == ' ') && (str.charAt(i + 1)!=' ')){
                count++;
            }
        }
        System.out.println("Number of words: " + count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String str = sc.nextLine();
        words(str);
    }
    
}
