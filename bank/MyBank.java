import java.util.Scanner;

public class MyBank {

    static double balance = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------Welcome to the Barun's Bank Pvt. Ltd.-------");
        Integer Options = 0;

        while (Options != 4) {
            System.out.println("1. Check balace");
            System.out.println("2. Deposit balace");
            System.out.println("3. Withdraw Balance");
            System.out.println("4. Exit");
            System.out.print("Enter the option 1/2/3/4: ");
            Options = sc.nextInt();

            switch (Options) {
                case 1 ->
                    checkBalance();
                case 2 ->
                    depositBalance();
                case 3 ->
                    withdrawBalance();
                case 4 ->
                    exit();
                default -> System.out.println("INVALID OPTION!! Please enter the right option.");
            }
            System.out.println();
        }

    }

    public static void checkBalance() {
        System.out.println("Your curret balance is $" + balance);
        System.out.println();
    }

    public static void depositBalance() {
        Scanner sc = new Scanner(System.in);
        System.out.print("How much do you want to deposit: ");
        double amount = sc.nextDouble();
        balance += amount; //balance = balance + amount;
        System.out.println("You have successfully deposited: $" + amount);
        checkBalance();
        System.out.println();
    }


    public static void withdrawBalance() {
        Scanner sc = new Scanner(System.in);
        System.out.print("How much do you want to withdraw: ");
        double amount = sc.nextDouble();
        
        if (balance < amount) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount; //balance = balance - amount;
            System.out.println("You have successfully withdrawned $" + amount);
        }
        checkBalance();
        System.out.println();
    }

    public static void exit() {
        System.out.println("Thank you for useing Barun's Bank Pvt Ltd! See you soon!");
        System.out.println();
    }

}
