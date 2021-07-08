
package bankingsystem;
class Account{
    int accountNo;
    String accountName;
    double accountBal;
    double interestAmount;
    double maxOverdrawnAmount = 100000;
    double withdrawAmount;
    
    void deposit(double depositAmount){
        accountBal+=depositAmount;
    }
    
    public void withdraw(double withdrawAmount){
        accountBal-=withdrawAmount;
    }
    
    int getAccountNo(){
        return accountNo;
    }

    public double getAccountBal(){ 
        return accountBal;
    }
       
    void Overdraw(double overdrawAmount){
        if(overdrawAmount>= 100000)
        {
            System.out.println("transaction unsuccessful");
        }else 
        {
            accountBal=(0-overdrawAmount);
            System.out.println( overdrawAmount);
        }
    }  
       
    void calculateInterest(double interestRate){
        interestAmount = accountBal *interestRate;
    }
     
    double getinterestAmount(){
        return interestAmount;
    }             
}

class SavingsAccount extends Account{
    
    public SavingsAccount(int accNo,String accName,double accBal){
        accountNo = accNo;
        accountName = accName;
        accountBal = accBal;
    }
    
}
    
class CurrentAccount extends Account{

    public CurrentAccount(int accNo,String accName,double accBal){
        accountNo = accNo;
        accountName=accName;
        accountBal=accBal;
    }
}

public class BankingSystem {

    public static void main(String[] args) {
        SavingsAccount a = new SavingsAccount(1029,"Kamal",0.0);
        a.deposit(100000);
        a.deposit(200000);
        System.out.println(a.getAccountBal());
        a.withdraw(100000);
        System.out.println(a.getAccountBal());
        a.calculateInterest(0.08);
        System.out.println(a.getinterestAmount());
        
        CurrentAccount b = new CurrentAccount(2229,"Sunil",0.0); 
        b.deposit(200000);
        b.deposit(200000);
        System.out.println(b.getAccountBal());
        b.withdraw(100000);
        System.out.println(b.getAccountBal());
        b.Overdraw(350000);
        b.Overdraw(50000);
        System.out.println(b.getAccountBal());
        b.calculateInterest(0.09);
        System.out.println(b.getinterestAmount());
        b.Overdraw(75000);
        

    }
}



 
        
    

