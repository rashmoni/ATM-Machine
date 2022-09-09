package Withdraw;

import Customer.Customer;
import CustomerMenu.CustomerMenu;
import utils.FileWriter;
import utils.UserInput;
import java.math.BigDecimal;

public class Withdraw {

    public Withdraw(Customer customer){
        UserInput input = new UserInput();
        BigDecimal withdrawAmount;
        BigDecimal remainingBalance;
        withdrawAmount = BigDecimal.valueOf(input.readInteger("Please Enter amount you want to withdraw: ","Invalid Entry:",1, 1000000));
        remainingBalance = customer.getBalance().subtract(withdrawAmount);

        while(remainingBalance.compareTo(BigDecimal.ZERO) < 0){
            System.out.println("Insufficient funds, please try another amount.");
            withdrawAmount = BigDecimal.valueOf(input.readInteger("Please Enter amount you want to withdraw: ","Invalid Entry:",1, 1000000));
            remainingBalance = customer.getBalance().subtract(withdrawAmount);
        }
        customer.withdrawAmount(withdrawAmount);
        System.out.println("Your withdraw amount is: "+ withdrawAmount);
        System.out.println("Your current balance is: "+customer.getBalance());
        FileWriter.updateRecord(customer);
        input.pressEnterContinue();
        new CustomerMenu(customer);
    }
}
