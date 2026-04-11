class Account {
    double balance;
    Account(double balance){
        this.balance=balance;
    }
    void deposit(double amount){
        balance+=amount;
        System.out.println("Amount deposited:"+amount);
    }
    void withdraw(double amount){
        if(amount>0&&amount<=balance){
            balance-=amount;
            System.out.println("Amount withdrawn:"+amount);
        }
        else{
            System.out.println("Invalid withdraw amount.");
        }
    }
}
class SavingAccount extends Account {
    SavingAccount(double balance){
        super(balance);
    }
    void withdraw(double amount){
        if(balance-amount>=500){
            balance-=amount;
            System.out.println("Amount withdarwn from saving account:"+amount);
        }
        else{
            System.out.println("Minimum 500 must be there in saving account");
        }
    }
}
class CurrentAccount extends Account {
    CurrentAccount(double balance){
        super(balance);
    }
    void withdraw(double amount){
        if(balance-amount>=-1000){
            balance-=amount;
            System.out.println("Amount withdarwn from current account:"+amount);
        }
        else{
            System.out.println("Overdraft Limit Exceeded");
        }

    }
}
public class BankDemo {
    public static void main(String[] args) {
        SavingAccount sa=new SavingAccount(90000);
        CurrentAccount ca=new CurrentAccount(50000);
        sa.deposit(10000);
        sa.withdraw(90000);
        ca.deposit(20000);
        ca.withdraw(60000);
    }
}