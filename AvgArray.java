import java.util.Scanner;

public class AvgArray {
    public static void returnAvg (int [] arrAvg, int numSize) {
        int sum = 0;
        for (int i = 0; i < arrAvg.length; i++) {
            sum =  sum + arrAvg[i];
        }
        double average;
        average = (double) sum /  arrAvg.length;
        System.out.println("The average number upto " + numSize + " is " + average);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number size to print out the sum: ");
        int numSize = sc.nextInt();
        int [] arrAvg = new int[numSize];
        
        System.out.println("Input the numbers upto " + numSize + "");
        for (int i = 0; i < numSize; i++) {
            arrAvg[i] = sc.nextInt();
        }
        returnAvg(arrAvg, numSize);
    }
}
