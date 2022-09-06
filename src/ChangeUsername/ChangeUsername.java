package ChangeUsername;

import Customer.Customer;
import utils.UserInput;
import CustomerMenu.*;

import static utils.FileWriter.editRecord;

public class ChangeUsername {
    public ChangeUsername(Customer newCustomer){
        Customer customer = newCustomer;
        System.out.println("Your current username is: " + newCustomer.getUsername());
        UserInput input = new UserInput();
        System.out.print("Please enter new username: ");
        String userName = input.readText();
        newCustomer.updateUsername(userName);
        editRecord(newCustomer);
        input.oprationSaveSuccess ();
        new CustomerMenu(newCustomer);

    }

}
