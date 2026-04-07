import java.util.Scanner;

public class Test {

    Scanner input = new Scanner(System.in);

    // Credit Card
    void pay(String cardNumber, int cvv, double amount) {
        double balance = 5000;

        if (String.valueOf(cvv).length() != 3) {
            System.out.println("Invalid CVV");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            System.out.println("Payment successful via Credit Card");
        }
    }

    // UPI
    void pay(String upiId, double amount) {
        double balance = 10000;

        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            System.out.println("Payment successful via UPI");
        }
    }

    // Wallet
    void pay(int walletId, double amount, String cashbackCode) {
        double balance = 8000;

        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            System.out.println("Payment successful via Wallet");

            if (!cashbackCode.isEmpty()) {
                System.out.println("Cashback applied!");
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Test t = new Test();

        System.out.println("Select Payment Method:");
        System.out.println("1. Credit Card\n2. UPI\n3. Wallet");

        int choice = input.nextInt();
        input.nextLine(); // clear buffer

        switch (choice) {

            case 1:
                System.out.print("Enter Card Number: ");
                String card = input.nextLine();

                System.out.print("Enter CVV: ");
                int cvv = input.nextInt();

                System.out.print("Enter Amount: ");
                double amt1 = input.nextDouble();

                t.pay(card, cvv, amt1);
                break;

            case 2:
                input.nextLine(); // fix buffer
                System.out.print("Enter UPI ID: ");
                String upi = input.nextLine();

                System.out.print("Enter Amount: ");
                double amt2 = input.nextDouble();

                t.pay(upi, amt2);
                break;

            case 3:
                System.out.print("Enter Wallet ID: ");
                int wid = input.nextInt();

                System.out.print("Enter Amount: ");
                double amt3 = input.nextDouble();
                input.nextLine();

                System.out.print("Enter Cashback Code: ");
                String code = input.nextLine();

                t.pay(wid, amt3, code);
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}