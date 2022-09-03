package ViewBalance;

import Customer.Customer;
import CustomerMenu.CustomerMenu;
import utils.UserInput;

public class ViewBalance {

    UserInput input = new UserInput();
    public ViewBalance(Customer newCustomer){
        Customer customer = newCustomer;
        System.out.println("Your current balance is: "+customer.getBalance());
        input.pressEnterContinue();
        new CustomerMenu(newCustomer);

    }

}
