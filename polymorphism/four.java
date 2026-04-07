import java.util.Scanner;
class Employee {
    void calculateBonus(){
        System.out.println("Calculating Bonus...");
    } 
}
class Manager extends Employee{
    void calculateBonus(){
        int salary=40000;
        double bonus=20*40000/100;
        System.out.println("The total bonus of a manager is:"+bonus);
    }
}
class Developer extends Employee{
    void calculateBonus(){
        int salary=80000;
        double bonus=10*80000/100;
        System.out.println("The total Bonus of the Developre is:"+bonus);
    }
}
class Intern extends Employee{
    void calculateBonus(){
        final int bonus=5000;
        System.out.println("The total Bonus of a intern is:"+bonus);
    }
}
public class four{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Employee e;
        System.out.println("Choose the Employee for looking the bonus of that employee:");
        System.out.println("1.Manager\n2.Developer\n3.Intern");
        int choice=input.nextInt();
        switch(choice){
            case 1:
                e=new Manager();
                e.calculateBonus();
                break;
            case 2:
                e=new Developer();
                e.calculateBonus();
                break;
            case 3:
                e=new Intern();
                e.calculateBonus();
                break;
            default:
                System.out.println("Invalid option");
        }

    }
}
