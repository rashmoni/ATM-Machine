package Withdraw;

import Customer.Customer;
import utils.UserInput;

import java.math.BigDecimal;

import static utils.UpdateRecord.editRecord;

public class Withdraw {
    public Withdraw(Customer newCustomer){
        Customer customer = newCustomer;
        UserInput input = new UserInput();
        BigDecimal withdrawAmount;
        withdrawAmount= BigDecimal.valueOf(input.readInteger("Please Enter amount you want to withdraw: ","Invalid Entry:",1, 1000000));
        customer.withdrawAmount(withdrawAmount);
        System.out.println(customer.getBalance());
        editRecord(newCustomer);
    }
}
