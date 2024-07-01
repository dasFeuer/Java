import java.util.*;

public class ChangeString {
    public static void printLetterChange(String result, String str) {
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'E' || str.charAt(i) == 'e') {
                result += 'b';
            } else {
                result += str.charAt(i);
            }
        }
        System.out.println("Letters: " + result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Any e letter change into b: ");
        String str = sc.next();
        String result = "";

        printLetterChange(result, str);
    }
}
