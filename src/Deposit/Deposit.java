package Deposit;

import Customer.Customer;
import utils.UserInput;
import java.math.BigDecimal;

import static utils.UpdateRecord.editRecord;
import static utils.VerifyCreateCustomer.newCustomer;

public class Deposit {

    public  Deposit(Customer newCustomer){
        Customer customer = newCustomer;
        UserInput input = new UserInput();
        BigDecimal depoAmount;
        depoAmount = BigDecimal.valueOf(input.readInteger("Please Enter amount you want to Deposit: ","Invalid Entry:",1, 1000000));
        customer.depositeAmount(depoAmount);
        System.out.println(customer.getBalance());
        editRecord(newCustomer);
    }


}
