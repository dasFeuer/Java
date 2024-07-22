public class ArrayReverse {
    public static void main(String[] args) {
        // Practice Problem 5
        int [] arr = {1,2,3,4,5,6,7,8};
        int length = arr.length;
        int num = Math.floorDiv(length, 2);
        int temp;

        for (int i = 0; i < num; i++) {
            temp = arr[i];
            arr[i] = arr[length-i-1];
            arr[length-i-1] = temp;
        }
        for (Object element : arr) {
            System.out.print(element + " ");
        }
    }
}
