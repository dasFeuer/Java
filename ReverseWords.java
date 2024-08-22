
public class ReverseWords {

    public static void strReverse(String str) {
        //Logik 1
        String[] words = str.split(" ");
        String reverseStr = "";

        for (String w : words) {
            String reverseWord = "";
            for (int i = w.length() - 1; i >= 0; i--) {
                reverseWord += w.charAt(i);
            }
            reverseStr += reverseWord + " ";
        }
        System.out.println("1. Reversed string: " + reverseStr);
    }

    public static void strReverse2(String str) {
        //Logik 2
        String[] words = str.split("\\s");

        String reverseWord = "";

        for (String w : words) {
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();

            reverseWord += sb.toString() + " ";
        }
        System.out.println("2. Reversed string: " + reverseWord);
    }

    public static void main(String[] args) {
        String str = "Java programming";
        strReverse(str);
        System.out.println();
        strReverse2(str);
    }

}
