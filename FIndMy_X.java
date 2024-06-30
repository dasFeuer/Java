import java.util.*;

public class FIndMy_X {
    public static void printX(int[][] findX, int row, int col, int x) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(findX[i][j] == x) {
                System.out.println("The value of x found at (" + i + ", " + j + ") ");
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input row: ");
        int row = sc.nextInt();
        System.out.print("Input column: ");
        int col = sc.nextInt();

        int[][] findX = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                findX[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter x value: ");
        int x = sc.nextInt();

        printX(findX, row, col, x);
    }
}
