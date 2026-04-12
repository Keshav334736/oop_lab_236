interface A{
    void meth1();
    void meth2();
}
class Myclass implements A{
    public void meth1(){
        System.out.println("Method 1 is implemented");
    }
    public void meth2(){
        System.out.println("Method 2 is implemented");
    }
}
public class thirty {
    public static void main(String[] args) {
        Myclass obj=new Myclass();
        obj.meth1();
        obj.meth2();
    }
}