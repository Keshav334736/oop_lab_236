import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        int n, i;
        boolean isPrime = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        n = sc.nextInt();

        if (n<2) {
            System.out.println("The number is neither prime nor composite");
        } else {
            for (i = 2; i <= n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println("The number is prime");
            } else {
                System.out.println("The number is composite");
            }
        }
    }
}
