interface Vehicle{
    void start();
    void stop();
}
class Car implements Vehicle{
    public void start(){
        System.out.println("Car is starting");
    }
    public void stop(){
        System.out.println("Car is stopping");
    }
}
class Bike implements Vehicle{
    public void start(){
        System.out.println("Bike is starting");
    }
    public void stop(){
        System.out.println("Bike is stopping");
    }
}
public class four {
    public static void main(String[] args) {
        Car c=new Car();
        c.start();
        c.stop();
        Bike b=new Bike();
        b.start();
        b.stop();
        
    }
}