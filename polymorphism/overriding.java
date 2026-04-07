class Bike {
    void run(){
        System.out.println("Bike is running");
    }  
}
class Honda extends Bike {
    void run(){
        System.out.println("Honda bike is running safely");
    }
}
public class overriding {
    public static void main(String[] args) {
        Honda h=new Honda();
        h.run();
    }
}
