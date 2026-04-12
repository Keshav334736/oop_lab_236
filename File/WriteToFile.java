import java.io.FileWriter;
import java.io.IOException;
public class WriteToFile {
    public static void main(String[] args) {
        try {
            FileWriter mywriter=new FileWriter("FileHandlingNewFilef1.txt");
            mywriter.write("Java is prominient programming language of milinieum");
            mywriter.close();
            System.out.println("Successfully wrote to the file");
            
        } catch (IOException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}