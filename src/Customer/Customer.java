package Customer;

import java.math.BigDecimal;

public class Customer {

    private String username;
    private String password;
    private String fullName;
    private BigDecimal balance;

    public Customer(String username, String password, String fullName, BigDecimal balance) {
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.balance = balance;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFullName() {
        return fullName;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void depositeAmount(BigDecimal depoAmount) {
        balance = balance.add(depoAmount);
    }

    public void withdrawAmount(BigDecimal Amount) {
        balance = balance.subtract(Amount);
    }

    @Override
    public String toString(){
        return username+","+password+","+fullName+","+balance;
    }
}
