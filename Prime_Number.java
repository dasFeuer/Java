import java.util.Scanner;

public class Prime_Number {

    public static void printPrime(int primeNumber) {
        boolean isPrime = true;

        for (int i = 2; i <= primeNumber / 2; i++) {
            if (primeNumber % i == 0) {
                isPrime = false;
                break;
            } 
        }

        if(isPrime){
            if (primeNumber == 1) {
                System.out.println("It is neither a prime not composite number");
            } else {
                System.out.println("It a prime number");
            }
        } else {
            System.out.println("It is not a prime number");
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Give the number input to know the know wheather number is prime or not: ");
        int primeNumber = sc.nextInt();
        printPrime(primeNumber);
    }
}
