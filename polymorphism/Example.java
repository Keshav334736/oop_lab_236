class parent {
    void view(){
        System.out.println("This is a parent class method");
    } 
}
class child extends parent {
    void view(){           // overriding
        super.view();     // calling parent class method 
        System.out.println("This is a child class method");
    }
}
public class Example {
    public static void main(String[] args) {
        parent p=new child();
        p.view();
    }
}