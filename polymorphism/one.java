import java.util.Scanner;

class Ride {
    void calculateFare(int distance) {
        System.out.println("Calculating fare...");
    }
}

class MiniRide extends Ride {
    void calculateFare(int distance) {
        double fare = distance * 10;
        System.out.println("Mini Ride Fare: " + fare);
    }
}

class PrimeRide extends Ride {
    void calculateFare(int distance) {
        double surge = 50; // fixed surge
        double fare = distance * 15 + surge;
        System.out.println("Prime Ride Fare: " + fare);
    }
}

class LuxuryRide extends Ride {
    void calculateFare(int distance) {
        double luxuryTax = 100; // fixed tax
        double fare = distance * 25 + luxuryTax;
        System.out.println("Luxury Ride Fare: " + fare);
    }
}

public class one {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Ride r ;

        System.out.println("Choose Ride:");
        System.out.println("1. Mini\n2. Prime\n3. Luxury");

        int choice = input.nextInt();


        switch (choice) {
            case 1:
                r = new MiniRide();
                break;
            case 2:
                r = new PrimeRide();
                break;
            case 3:
                r = new LuxuryRide();
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        // Runtime Polymorphism
        System.out.println("Enter distance: ");
        int distance = input.nextInt();
        r.calculateFare(distance);
    }
}
