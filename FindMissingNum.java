
public class FindMissingNum {

    public static void findMissingNum(int[] a) {
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println("Sum of elements in array: " + sum);
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            sum1 += i;
        }
        System.out.println("Sum of range of elements in array: " + sum1);
        System.out.println();
        System.out.println("Missing number is " + (sum1 - sum));
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 5};
        findMissingNum(a);
    }
}
