import java.util.Scanner;

public class Asce_Desce {
    public static void printAscending(int [] nums) {
        boolean isAscending = true;

        for (int i = 0; i < nums.length-1; i++) {
            // NOTICE numbers.length - 1 as termination condition
            if(nums[i] > nums[i+1]) {
                // This is the condition for descending order
                isAscending = false;
            }
        }
        if(isAscending) {
            System.out.println("This is sorted in Ascending form");
        } else {
            System.out.println("This is not sorted in Ascending form");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of number: ");
        int numSize = sc.nextInt();

        int [] nums = new int[numSize];
        
        for (int i = 0; i < numSize; i++) {
            System.out.print("Enter the numbers: ");
            nums[i] = sc.nextInt();
        }
        printAscending(nums);
    }
}
