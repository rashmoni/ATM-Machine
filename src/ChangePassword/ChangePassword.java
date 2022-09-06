package ChangePassword;

import Customer.Customer;
import CustomerMenu.CustomerMenu;
import utils.*;

public class ChangePassword {
    public ChangePassword(Customer newCustomer){
        Customer customer = newCustomer;
        UserInput input = new UserInput();
        String password = input.passwordReader("change");
        password = Encryptor.encryptPassword(password);
        newCustomer.updatePassword(password);
        FileWriter.editRecord(newCustomer);
        input.oprationSaveSuccess ();
        new CustomerMenu(newCustomer);
    }
}
