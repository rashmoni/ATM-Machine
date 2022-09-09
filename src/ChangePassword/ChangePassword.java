package ChangePassword;

import Customer.Customer;
import CustomerMenu.CustomerMenu;
import utils.*;

public class ChangePassword {
    public ChangePassword(Customer customer){
        UserInput input = new UserInput();
        String password = input.passwordReader("change");
        password = Encryptor.encryptPassword(password);
        customer.updatePassword(password);
        FileWriter.updateRecord(customer);
        input.oprationSaveSuccess ();
        new CustomerMenu(customer);
    }
}
