public class Allinoneprogram{
    public static void main(String[] args){
        // Factorial //
        int n=5;
        int fact=1;
        int i=1;
        while(i<=n){
            fact=fact*i;
            i++;
        }
        System.out.println("Factorial of a number" +n+ "is:" +fact);
        //fibonacci//
        int terms=7;
        int a=0;
        int b=1;
        int count=1;
        System.out.println("Fibonacci Series:");
        do { 
            System.out.println(a+ " ");
            int c=a+b;
            a=b;
            b=c;
            count++;
        } while (count<=terms);
        System.out.println();
        // Prime Number//
        int num=7;
        int j=2;
        boolean isprime=true;
        while(j<=num/2){
            if(num%j==0){
                isprime=false;
                break;
            }
            j++;
        }
        if(isprime){
            System.out.println(num+ "is a prime number");
        }
        else{
            System.out.println(num+ "is not a prime number");
        }
    }
}