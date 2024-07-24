import java.util.Scanner;

public class ArrayAddandMultiply {

    public static void addArray(int[][] firstMatrix, int[][] secondMatrix, int[][] twoD_Matrix, int row, int column) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                twoD_Matrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }

        for (int[] rowArray : twoD_Matrix) {
            for (int columnValue : rowArray) {
                System.out.print(columnValue + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] firstMatrix = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] secondMatrix = { { 7, 8, 9 }, { 6, 8, 4 } };
        int row = 2;
        int column = 3;

        int[][] twoD_Matrix = new int[row][column];

        addArray(firstMatrix, secondMatrix, twoD_Matrix, row, column);
    }
}
