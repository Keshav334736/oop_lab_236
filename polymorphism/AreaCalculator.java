import java.util.Scanner;
public class AreaCalculator {

    // Circle
    void calculateArea(double r) {
        if (r < 0) {
            System.out.println("Invalid radius");
            return;
        }
        double area = 3.14 * r * r;
        System.out.println("Area of Circle: " + area);
    }

    // Rectangle
    void calculateArea(double l, double b) {
        if (l < 0 || b < 0) {
            System.out.println("Invalid dimensions");
            return;
        }
        double area = l * b;
        System.out.println("Area of Rectangle: " + area);
    }

    // Triangle (different signature using 3 parameters)
    void calculateArea(double b, double h, int dummy) {
        if (b < 0 || h < 0) {
            System.out.println("Invalid dimensions");
            return;
        }
        double area = 0.5 * b * h;
        System.out.println("Area of Triangle: " + area);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AreaCalculator ac = new AreaCalculator();

        System.out.println("1. Circle\n2. Rectangle\n3. Triangle");
        int choice = input.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter radius: ");
                double r = input.nextDouble();
                ac.calculateArea(r);
                break;

            case 2:
                System.out.print("Enter length: ");
                double l = input.nextDouble();
                System.out.print("Enter breadth: ");
                double b = input.nextDouble();
                ac.calculateArea(l, b);
                break;

            case 3:
                System.out.print("Enter base: ");
                double base = input.nextDouble();
                System.out.print("Enter height: ");
                double h = input.nextDouble();
                ac.calculateArea(base, h, 1); // dummy param
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}
