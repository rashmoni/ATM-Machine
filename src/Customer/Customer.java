package Customer;

import java.math.BigDecimal;

public class Customer {

    private String username;
    private String password;
    private String accNumber;
    private String fullName;
    private BigDecimal balance;

    public Customer(String accNumber, String username, String password, String fullName, BigDecimal balance) {
        this.username = username;
        this.password = password;
        this.accNumber = accNumber;
        this.fullName = fullName;
        this.balance = balance;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getAccNumber() {
        return accNumber;
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
        return accNumber+","+username+","+password+","+fullName+","+balance;
    }
}
