

public class ReverseString {
    public static void main(String[] args){
        // Using + (string concatenation) operator
        String str = "ABCD";
        String rev ="";

        // int len = str.length(); //4
        // str.charAt(0);

        // for (int i = len-1; i >= 0; i--) {// 3-2-1-0
        //     rev = rev + str.charAt(i);//D-C-B-A
        // }
        // System.out.println("1. Reversed string is: " + rev);

        // Using character array

        char a[] =str.toCharArray();
        int len1 = a.length;
         for (int i = len1-1; i >= 0; i--) {
            rev = rev+a[i];
         }
         System.out.println("2. Reversed string is: " + rev);

         // String Buffer class
         StringBuffer sb = new StringBuffer(str);
         StringBuffer result = sb.reverse();
         System.out.println("3. Reversed string is: " + result);
    }
}
