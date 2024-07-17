import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

public class TextFileRead {
    public static void main(String[] args) throws FileAlreadyExistsException {
        try {
            readFile("text.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void readFile(String filename)throws FileAlreadyExistsException, FileNotFoundException {
        File file = new File(filename);
        Scanner sc = new Scanner(file);

        while(sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
        }
        sc.close();
    }
}
