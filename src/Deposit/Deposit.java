package Deposit;

import Customer.Customer;
import CustomerMenu.CustomerMenu;
import utils.FileWriter;
import utils.UserInput;
import java.math.BigDecimal;

public class Deposit {
    public Deposit(Customer customer) {
        UserInput input = new UserInput();
        BigDecimal depoAmount;
        depoAmount = BigDecimal.valueOf(input.readInteger("Please Enter amount you want to Deposit: ", "Invalid Entry:", 1, 1000000));
        customer.depositeAmount(depoAmount);
        FileWriter.updateRecord(customer);
        System.out.println("Amount " + depoAmount + " successfully deposited.");
        System.out.println("Your updated balance is " + customer.getBalance());
        input.pressEnterContinue();
        new CustomerMenu(customer);
    }
}



