import java.util.Scanner;
class StudentMarks{
    private int[] marks=new int[5];

    void insertMarks(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the marks of 5 Students:");
        for(int i=0;i<marks.length;i++){
            marks[i]=input.nextInt();
        }
    }

    void displayMarks(){
        System.out.println("Marks of 5 Students are:");
        for(int i=0;i<marks.length;i++){
            System.out.println("Student"+(i+1)+"Marks:"+marks[i]);
        }
    }

    void CalculateMarks(){
        int sum=0;
        for(int i=0;i<marks.length;i++){
            sum+=marks[i];
        }
        double average=sum/marks.length;
        System.out.println("Average of the marks :"+average);
    }
}
public class g{
    public static void main(String[] args) {
        StudentMarks sm=new StudentMarks();
        sm.insertMarks();
        sm.displayMarks();
        sm.CalculateMarks();
    }
}