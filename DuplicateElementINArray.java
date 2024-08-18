import java.util.HashSet;

public class DuplicateElementINArray {
    public static void FindElement(String []arr){
        HashSet <String>langs = new HashSet<>();
        boolean flag = false;
        for(String l:arr){
            if(langs.add(l) == false){
                System.out.println("Duplicate element found: " + l);
                flag = true;
            }
        }
        if(flag == false){
            System.out.println("Duplicate element not found!");
        }
    }
    public static void main(String[] args) {
        boolean flag = false;
        String []arr = {"Java", "C", "C++", "Java","Python"};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i].equals(arr[j])){
                    System.out.println("Duplicate element found: " + arr[i]);
                    flag = true;
                }
            }
        }
        if(flag == false){
            System.out.println("Duplicate element not found!");
        }
        System.out.println();
        FindElement(arr);
    }
}
