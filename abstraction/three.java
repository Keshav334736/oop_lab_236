abstract class vehicle {  //partial abstraction
    abstract void start();  // abstract method
    void stop(){            // concrete method
        System.out.println("Vehicle is stopping");
    } 
}
class bike extends vehicle {
    void start(){               // concrete method
        System.out.println("Bike is starting");
    }
}
public class three {
    public static void main(String[] args) {
        bike b=new bike();
        b.start();
        b.stop();
    }
}
