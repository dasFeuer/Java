
public class SearchElement {

    public static void findElement(int[] arr) {
        int searchElement = 2;
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            // System.out.print(arr[i] + " ");
            if (searchElement == arr[i]) {
                System.out.println("Element found at " + i);
                flag = true;
                break;
            }
        }
        if(flag == false){
            System.out.println("Element not found");
        }

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        findElement(arr);
    }
}
