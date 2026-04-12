import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class cf{
    public static void main(String[] args) {
        try {
            File myobj=new File("data.txt");
            myobj.createNewFile();
            FileWriter mywriter=new FileWriter("data.txt");
            mywriter.write("10\n");
            mywriter.write("20\n");
            mywriter.write("30\n");
            mywriter.write("40\n");
            mywriter.write("50\n");
            mywriter.close();

        } catch (IOException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}