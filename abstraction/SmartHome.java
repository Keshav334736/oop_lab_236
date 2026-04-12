interface device{
    void on();
    void off();
}
class Light implements device{
    public void on(){
        System.out.println("Light is on");
    }
    public void off(){
        System.out.println("Light is off");
    }
}
class Fan implements device{
    public void on(){
        System.out.println("Fan is on");
    }
    public void off(){
        System.out.println("Fan is off");
    }
}
public class SmartHome {
    public static void main(String[] args) {
        Light l=new Light();
        l.on();
        l.off();
        Fan f=new Fan();
        f.on();
        f.off();
    }
}