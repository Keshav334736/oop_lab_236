import java.util.Scanner;
public class Armstrong{
    public static void main(String[] args) {
        int n;
        int digit;
        int sum=0;
        int temp;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number:");
        n=input.nextInt();
        temp=n;
        while(n>0){
            digit=n%10;
            sum=sum+(digit*digit*digit);
            n=n/10;
        }
        if(temp==sum){
            System.out.println("The number is armstrong");
        }
        else{
            System.out.println("The number is not armstrong");
        }
    }
}
