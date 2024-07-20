public class Arrays3 {
    public static void main(String[] args) {
        //Practice Problem 1
        /* float [] marks = {90.9f, 80.2f, 70.53f};
        float sum = 0;
        for (float element : marks) {
            sum += element;
        }
        System.out.println("The value of sum is " + sum); 

        //Practice Problem 2
        float [] marks = {90.9f, 80.2f, 70.53f};
        float num = 90.9f;
        boolean isInArray = false;
        for (float element : marks) {
            if(num == element) {
                isInArray = true;
                break;
            }
        }
        if(isInArray) {
            System.out.println("The value present in the array");
        } else {
            System.out.println("The value not present in the array");
        }

        //Practice Problem 3
        float [] marks = {90.9f, 80.2f, 70.53f};
        float sum = 0;
        for (float element : marks) {
            sum += element;
        }
        System.out.println("The average value of marks is " + sum/marks.length); 

        //Practice Problem 4
        int [][] mat1 = { {1, 2 , 3}, 
                          {4, 5, 6} };
        int [][] mat2 = { {6, 2, 7}, 
                          {9, 3, 16} };
        int [][] result = { {0, 0, 0}, 
                            {0, 0, 0} };

        for (int i = 0; i < mat1.length; i++) { // row number of times
            for (int j = 0; j < mat1[i].length; j++) { // col number of times
                System.out.format("Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        System.out.println("--------------------------------");

        // Printing the elements of a 2-D Array
        for (int i = 0; i < mat1.length; i++) { // row number of times
            for (int j = 0; j < mat1[i].length; j++) { // col number of times
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println(""); // Print a new line 
        } */
    }
}
