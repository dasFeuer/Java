public class Recursion_01 {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial (n - 1);
        }
    }

    public static void countDown(int n) {
        if(n > 0) {
            System.out.println(n);
            countDown(n-1);
        }
    }

    public static int sumNatural(int n) {
        if(n == 1) {
            return 1;
        } else {
            return n + sumNatural( n - 1);
        }
    }

    public static int addOdd (int n) {
        if (n <= 0) {
            return 0;
        } else if (n % 2 == 0) {
            return addOdd(n - 1);
        } else {
            return n + addOdd(n - 2);
        }
    }

    public static int addEven(int n) {
        if(n <= 0) {
            return 0;
        } else if (n % 2 != 0){
            return addEven(n - 1);
        }
        else {           
            return n + addEven(n - 2);
            }
        }
    
    public static void main(String[] args) {
        // int result = factorial(5);
        // System.out.println(result);

        // countDown(5);

        // int result = sumNatural(6);
        // System.out.println(result);

        // int result = addOdd(10);
        // System.out.println(result);

        int result = addEven(10);
        System.out.println(result);
    }
}
