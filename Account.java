abstract class Account{
   private String username;
   private int accountNumber;
   private double balance;
    //constructor
    public Account(String username,int accountNumber,double balance ){
        this.username=username;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    //method
    public void deposit(double amount){
        balance += amount;
    }
    public abstract void withdraw(double amount);

    //getter
    public double getBalance(){
        return balance;
    }
    public int getAccountNumber(){
            return accountNumber;
        }
    public  String getUsername(){
        return username;
    }
}
class SavingsAccount extends Account{
    private double minimumBalance;
    public SavingsAccount(String username,
    int accountNumber,
    double balance,
    double minimumBalance){

 super(username,accountNumber,balance);
 this.minimumBalance=minimumBalance;
}
  @Override
public  void withdraw( double amount){
   if(getBalance()-amount<minimumBalance){
    System.out.println("cannot withdraw");
   }else{
    deposit(-amount);
   }
}
}
class CurrentAccount extends Account{
    private double overdraftLimit;
CurrentAccount(String username,
    int accountNumber,
    double balance,
    double overdraftLimit
){

super(username,accountNumber,balance);
this.overdraftLimit=overdraftLimit;
}

@Override
public void withdraw(double amount){
if(getBalance()-amount<-overdraftLimit){
  System.out.println("limit exceed");
}else{
    deposit(-amount);
}
}
}
