public class BankAccount {
    private long accountnumber;
    private double balance;
    public BankAccount(long accountnumber,double balance){
        this.accountnumber=accountnumber;
        if(balance>0){
            this.balance=balance;
        }
        else{
            this.balance=0;
        }
    }
        // check balance
        public double getBalance(){
            return balance;
        }
        // deposit method
        public void deposit(double amount){
            if(amount>0){
                balance+=amount;
                System.out.println("Amount deposited:$"+amount);
            }
            else{
                System.out.println("Deposit Amount must be positive");
            }
        }
        // withdraw method
        public void withdraw(double amount){
            if(amount>0 && amount<=balance){
                balance-=amount;
                System.out.println("Amount withdrawn:$"+amount);
            }
            else{
                System.out.println("Invalid withdraw amount");
            }
        }
public static void main(String[] args){
    BankAccount account = new BankAccount(123456789, 1000.0);
    account.deposit(500.0);
    account.withdraw(200.0);
    System.out.println("Final balance: $" + account.getBalance());
}
}