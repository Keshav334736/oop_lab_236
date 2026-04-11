class Employee {
    String name;
    String designation;
    double salary;
    Employee(String name,String designation,double salary){
        this.name=name;
        this.designation=designation;
        this.salary=salary;
    }
    void display(){
        System.out.println("Name:"+name);
        System.out.println("Designation:"+designation);
        System.out.println("Salary:"+salary);
    }
}
class Developer extends Employee{
    String programminglanguage;
    Developer(String name,String designation,double salary,String programminglanguage){
        super(name,designation,salary);
        this.programminglanguage=programminglanguage;
    }
    void display(){
        super.display();
        System.out.println("Programming Language:"+programminglanguage);
    }
}
class Manager extends Employee{
    int teamSize;
    Manager(String name,String designation,double salary,int teamSize){
        super(name,designation,salary);
        this.teamSize=teamSize;
    }
    void display(){
        super.display();
        System.out.println("Team Size:"+teamSize);
    }
}
public class o {
    public static void main(String[] args) {
        Developer d=new Developer("Keshav","Software Developer",90000,"Java");
        Manager m=new Manager("Rahul","Project Manager",120000,10);
        d.display();
        m.display();
    }
}