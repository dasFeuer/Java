public class SumofArray {
    public static void arrSum(int []a){
        int sum = 0;
        for (int i = 0; i <= a.length-1; i++) {
            sum = sum + a[i];
        }
        System.out.println("Sum of array is " + sum);
    }

    //Enhanced for loop
    public static void arrSum1(int []a){
        int sum = 0;
        for(int value : a) {
            sum = sum + value;
        }
        System.out.println("Sum of array is " + sum);
    }
    public static void main(String[] args) {
        int []a = {2,1,3,6,3};
        System.out.println();

        arrSum(a);
        System.out.println("---------------");
        arrSum1(a);
    }
}
