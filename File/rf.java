import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class rf {
    public static void main(String[] args) {
        try {
            File myobj=new File("data.txt");
            Scanner myreader=new Scanner(myobj);
            int sum=0;
            int count=0;
            while(myreader.hasNextInt()){
                int value=myreader.nextInt();
                sum+=value;
                count++;
            }
            myreader.close();
            double average=sum/count;
            System.out.println("Sum of numbers"+sum);
            System.out.println("Average of numbers"+average);
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
