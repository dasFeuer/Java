
public class JavaMethod {

    public static void printMultiplication(int num, int size) {
        for (int i = 1; i <= size; i++) {
            System.out.format("%d X %d = %d\n", num, i, num * i);
        }
    }

    public static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static int sumNum(int num) {
        if (num == 1) {
            return 1;
        }
        return num + sumNum(num - 1);
    }

    public static int fib(int num) {
        /* if(num == 1) {
            return 0;
        } else if (num == 2) {
            return 1;
        } */
        if (num == 1 || num == 2) {
            return num - 1;
        } else {
            return fib(num - 1) + fib(num - 2);
        }
    }

    public static void pattern1_rec(int n) {

        if (n > 0) {
            pattern1_rec(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //Problem 1

        // Scanner sc =  new Scanner(System.in);
        // System.out.print("Enter the size of multiplication: ");
        // int size = sc.nextInt();
        // System.out.print("Enter number for multiplication: ");
        // int num = sc.nextInt();
        // printMultiplication(num, size);

        //Problem 2

        // int n = 10;
        // pattern1(n);

        //Problem 3

        // int sum = sumNum(4);
        // System.out.println(sum);

        //Problem 4

        // int result = fib(5);
        // System.out.println(result);

        //Problem 5

        pattern1_rec(4);

    }
}
