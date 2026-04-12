import java.io.File;
import java.io.IOException;
public class CreateFile {
    public static void main(String[] args) {
        try {
            File myobj=new File("FileHandlingNewFilef1.txt");
            if(myobj.createNewFile()){
                System.out.println("File created: " + myobj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}