import java.util.Scanner;
public class keshav3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side of a square:");
        int side=sc.nextInt();
        int area=side*side;
        System.out.println("The area of square is:"+area);
    }
}