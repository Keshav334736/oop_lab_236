import java.util.Scanner;
public class keshav5{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks:");
        int marks=sc.nextInt();
        if(marks>=90){
            System.out.println("Your grade is A+");
        }
        else if(marks>=80 && marks<=90){
            System.out.println("Your grade is A");
        }
        else if(marks>=70 && marks<=80){
            System.out.println("Your grade is B+");
        }
        else if(marks>=60 && marks<=70){
            System.out.println("Your grade is B");
        }
        else{
            System.out.println("Your grade is F");
        }
        
    }
}