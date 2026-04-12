import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class student {
    public static void main(String[] args) {
        try {
            //Creating a file
            File myobj=new File("student.txt");
            myobj.createNewFile();
            // Writing to a file
            FileWriter mywriter=new FileWriter("student.txt");
            mywriter.write("Name:Keshav Rauniyar\n");
            mywriter.write("Roll No:CH.SC.U4CSE25236\n");
            mywriter.write("Course:CSE\n");
            mywriter.close();
            //Reading from file
            File myobj1=new File("student.txt");
            Scanner myreader=new Scanner(myobj1);
            System.out.println("Reading from a file:");
            while(myreader.hasNextLine()) {
                String data=myreader.nextLine();
                System.out.println(data);
            }
            myreader.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}