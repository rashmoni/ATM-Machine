package ChangePassword;

import Customer.Customer;
import CustomerMenu.CustomerMenu;
import utils.Encryptor;
import utils.UserInput;


import static utils.UpdateRecord.editRecord;

public class Changepassword {
    public Changepassword(Customer newCustomer){
        Customer customer = newCustomer;
        UserInput input = new UserInput();
        String password = input.passwordReader("change");
        password = Encryptor.encryptPassword(password);
        newCustomer.updatePassword(password);
        editRecord(newCustomer);
        input.oprationSaveSuccess ();
        new CustomerMenu(newCustomer);
    }
}
