import java.io.*;
import java.util.Scanner;
public class Contents {
    public static void main(String[] args) {
        try {
            // Create a new File
            File myobj=new File("content.txt");
            myobj.createNewFile();
            // Write to the file
            FileWriter mywriter=new FileWriter("content.txt");
            mywriter.write("This is the content of the file.");
            mywriter.close();
            // Read from the file
            File myobj1=new File("content.txt");
            Scanner myreader=new Scanner(myobj1);
            System.out.println("Reading from the file:");
            while(myreader.hasNextLine()){
                String data=myreader.nextLine();
                System.out.println(data);
            }
            myreader.close();

            
        } catch (Exception e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}