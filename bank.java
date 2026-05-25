import java.util.HashMap;
public class Bank {
    private HashMap<String, Customer> customers;
    
    public Bank() {
        customers = new HashMap<>();
    }
 public void addCustomer(Customer customer){
    customers.put(customer.getCustomerId(),customer);
 }
 public Customer getCustomer(String customerId){
    return customers.get(customerId);

 }
 public void removeCustomer(String customerId ){
        customers.remove(customerId);
 }
}
