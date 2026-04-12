abstract class Vehicle {
    abstract void start();
    abstract void fueltype();
}
class Car extends Vehicle{
    void start(){
        System.out.println("Car is starting");
    }
    void fueltype(){
        System.out.println("Car uses petrol");
    }
}
class ElectricBike extends Vehicle{
    void start(){
        System.out.println("Electric Bike is starting");
    }
    void fueltype(){
        System.out.println("Electric Bike uses electricity");
    }
}
public class f{
    public static void main(String[] args) {
        Car c=new Car();
        c.start();
        c.fueltype();
        ElectricBike eb=new ElectricBike();
        eb.start();
        eb.fueltype();
    }
}