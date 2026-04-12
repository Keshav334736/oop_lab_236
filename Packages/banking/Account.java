package banking;

public class Account {
    private void PrivateMethod(){
        System.out.println("This is a private method");
    }
    public void ProtectedMethod(){
        System.out.println("This is a protected method");
    }
    public void PublicMethod(){
        System.out.println("This is a public method");
    }

    public void accessPrivateMethod(){
        PrivateMethod();
    }

}
