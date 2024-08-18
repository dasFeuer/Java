
public class MaxandMin {

    public static void main(String[] args) {
        int a[] = {50, 30, 60, 20, 70};
        int max = a[0];
        int min = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Maximum number in array is: " + max);
        System.out.println();

        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Minimum number in array is: " + min);
    }
}
