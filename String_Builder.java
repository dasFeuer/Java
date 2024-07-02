public class String_Builder {

    public static void reverseString(StringBuilder sb) {
        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - i - 1;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println("9. " + sb);
    }

    public static void main(String[] args) {
        //Declaration
        StringBuilder sb = new StringBuilder("Barun Panthi");
        System.out.println("1. " + sb);
        System.out.println();

        //Get a character from Index
        System.out.println("2. " + sb.charAt(0));
        System.out.println();

        //Print Length of String
        System.out.println("3. " + sb.length());
        System.out.println();

        //Set a character at Index
        sb.setCharAt(0, 'A');
        System.out.println("4. " + sb);
        System.out.println();

        //Insert a character at some Index
        sb.insert(0, 'S');
        System.out.println("5. " + sb);
        System.out.println();

        //Delete char at some index
        sb.delete(0, 1);
        System.out.println("6. " + sb);
        System.out.println();

        //Append a char
        //Append means to add something at the end
        sb.append(" Sharma");
        sb.setCharAt(0, 'B');
        System.out.println("7. " + sb);
        System.out.println();

        //Print Length of String
        System.out.println("8. " + sb.length());
        System.out.println();

        // Reverse String --> Reverse a String (Using StringBuilder class)
        reverseString(sb);

    }

}
