public class Customer{
    private String name;
    private String customerId;
    private String mobileNumber;
    private HashMap<String,Account> accounts;

Customer(String name,
         String customerId,
         String mobileNumber
){
    this.name=name;
    this.customerId=customerId;
    this.mobileNumber=mobileNumber;
    accounts=new HashMap<>();
}
public void addAccount(Account account){
    accounts.put(account.getAccountNumber(),account);
}
public Account getAccount( String accountNumber){
    return accounts.get(accountNumber);
}
public void removeAccount(String accountNumber){
    accounts.remove(accountNumber);
}
public String getName(){
    return name;
}
public String getcustomerID(){
    return customerId;
}
public String getmobileNumber(){
    return mobileNumber;
}
}
