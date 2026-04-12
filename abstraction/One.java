//partial abstraction
abstract class parent{
    abstract void work(); //abstract method
    void eat(){ //concrete method
        System.out.println("Eating Food");
    }
}
class son extends parent{
    void work(){
        System.out.println("Working as an engineer");
    }
}
public class One{
    public static void main(String[] args){
        parent p=new son();
        p.work();
        p.eat();
    }
}