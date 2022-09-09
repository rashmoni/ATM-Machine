package ChangeUsername;

import Customer.Customer;
import utils.FileWriter;
import utils.UserInput;
import CustomerMenu.*;

public class ChangeUsername {
    public ChangeUsername(Customer customer){
        System.out.println("Your current username is: " + customer.getUsername());
        UserInput input = new UserInput();
        System.out.print("Please enter new username: ");
        String userName = input.readText();
        customer.updateUsername(userName);
        FileWriter.updateRecord(customer);
        input.oprationSaveSuccess ();
        new CustomerMenu(customer);

    }

}
