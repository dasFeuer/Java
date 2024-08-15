
import java.util.Random;

public class GenerateNum {
    public static void main(String[] args) {
        //Approach - Random
        Random rand = new Random();
        int randNum = rand.nextInt(10);
        System.out.println("1. " + randNum);

        double randNum1 = rand.nextDouble(1, 3);
        System.out.println("2. " + randNum1);

        //Approch 2 - Math
        System.out.println("3. " + Math.random());        
    }
}
