import java.util.*;

public class DeleteAndAddStr {
    public static void printUsername(String email, String username){
        for (int i = 0; i < email.length(); i++) {
            if(email.charAt(i) == '@') {
                break;
            } else {
                username += email.charAt(i);
            }
        }
        System.out.print("Your username is: " + username);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please give your email: ");
        String email = sc.next();
        String username = "";

        printUsername(email, username);
    }
}
