import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FileInput {
    public static void main(String[] args) {
        try {
            File myobj=new File("NewFile.txt");
            myobj.createNewFile();  // a new file is created
            Scanner input=new Scanner(System.in);
            System.out.println("Enter some text to write to the file:");
            String text=input.nextLine();
            FileWriter mywriter=new FileWriter("NewFile.txt");
            mywriter.write(text);
            mywriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
    
}