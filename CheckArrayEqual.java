import java.util.Arrays;

public class CheckArrayEqual {
    //Logik 1
    public static void checkArr(int []a, int[]b){
        boolean isEqual = Arrays.equals(a, b);

        if(isEqual == true){
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    }
    //Logik 2
    public static void checkArr2(int []a, int []b){
        boolean isEqual = true;
        if(a.length == b.length){
            for(int i = 0; i < a.length; i++) {
                if(a[i] != b[i]){
                    isEqual = false;
                }
            }
        } else {
            isEqual = false;
        }

        if(isEqual == true){
          System.out.println("Arrays are equal");  
        } else {
            System.out.println("Arrays are not equal");
        }
    }
    public static void main(String[] args) {
        int []a = {1,2,3,4,5};
        int []b = {1,2,3,4,5};

        checkArr(a, b);
        System.out.println("-----------");
        checkArr2(a, b);
    }
}
