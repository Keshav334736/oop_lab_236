package bankingApp;
import  banking.Account;
public class TestAccount extends Account {
    public static void main(String[] args) {
        TestAccount obj=new TestAccount();
        obj.accessPrivateMethod();
        obj.ProtectedMethod();
        obj.PublicMethod();
        
    }
    
}
