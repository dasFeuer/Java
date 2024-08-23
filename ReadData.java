import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadData {
    public static void dataRead() throws FileNotFoundException, IOException{
        //Logik 1
        FileReader fR = new FileReader("C:\\Users\\Acer\\IdeaProjects\\MyCode.txt");
        BufferedReader bR = new BufferedReader(fR);
        String str;
        while((str = bR.readLine())!=null){
            System.out.println("1. " + str);
        }
        bR.close();
    }
    public static void dataRead1() throws FileNotFoundException{
        //Logik 2
        File myFile = new File("C:\\Users\\Acer\\IdeaProjects\\MyCode.txt");
        Scanner sc = new Scanner(myFile);
        while(sc.hasNextLine()){
            System.out.println("2. " + sc.nextLine());
        }
    }
    public static void dataRead2() throws FileNotFoundException{
        //Logik 2
        File myFile = new File("C:\\Users\\Acer\\IdeaProjects\\MyCode.txt");
        Scanner sc = new Scanner(myFile);
        sc.useDelimiter("\\Z");
        System.out.println("3. " + sc.next());
    }
    public static void main(String[] args) throws IOException {
        dataRead();

        dataRead1();

        dataRead2();
    }
}
