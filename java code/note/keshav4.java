import java.util.Scanner;
public class keshav4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the cash:");
        int cash=sc.nextInt();
        if (cash<10){
            System.out.println("Cannot buy anything");
            System.out.println("Bring more cash");
        }
        else if (cash<10 && cash>40) {
            System.out.println("can buy only one thing");
        }
        else{
            System.out.println("Can buy both thing");
        }
    }
}