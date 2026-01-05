import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args) {
        int n;
        int digit;
        int rev=0;
        int temp;

        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number:");
        n=input.nextInt();
        temp=n;
        while(n!=0){
            digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        if(temp==rev){
            System.out.println("The number is palindrome");
        }
        else{
            System.out.println("The number is not palindrome");
        }
    }
}
