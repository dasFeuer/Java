import java.util.*;

public class JavaP {

    public static void createUsername(String email, String username) {
        for (int i = 0; i < email.length(); i++) {
            if(email.charAt(i) == '@'){
                break;
            } else {
                username += email.charAt(i);
            }
        }
        System.out.println("Your username is:" + username);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your email: ");
        String email = sc.next();
        System.out.print("Enter your password: ");
        String password = sc.next();

        String username = " ";

        createUsername(email, username);
        System.out.println("Your email: " + email);
        System.out.print("Your password: " + password);
    }
}