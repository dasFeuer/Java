class DecimalToBinary {
    public void deciToBina(int n) {
        for (int i = 31; i >= 0; i--) {
            int k = n >> i;
            if((k & 1) > 0) {
                System.out.print("1");
            } else {
                System.out.print("0");
            }
        }
    }
}

public class DeciToBina {
    public static void main(String[] args) {
        DecimalToBinary d2b =  new DecimalToBinary();
        int n = 32;
        System.out.println("Decimal number - " + n);
        System.out.print("Binary Number - ");
        d2b.deciToBina(n);
    }
}
