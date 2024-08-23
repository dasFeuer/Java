import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData {
    public static void dataWrite() throws IOException{
        FileWriter fW = new FileWriter("C:\\Users\\Acer\\IdeaProjects\\MyCode1.txt");
        BufferedWriter bW = new BufferedWriter(fW);

        bW.write("1. Java programming.\n");
        bW.write("2. I am a programmer.");

        System.out.println("Data in file has been written.");
        bW.close();
    }
    public static void main(String[] args) throws IOException {
        dataWrite();
    }
}
