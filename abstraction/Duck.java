// Fully abstraction
interface swimmable {
    void swim(); // abstract method
}
interface flyable {
    void fly();  // abstract method
}
class two implements swimmable,flyable {
    public void swim(){  // concrete method
        System.out.println("Duck is Swimming");
    }
    public void fly(){   // concrete method 
        System.out.println("Duck is Flying");
    }
}
public class Duck{
    public static void main(String[] args) {
        two d=new two();
        d.swim();
        d.fly();
        
    }
}