package ViewBalance;

import Customer.Customer;
import CustomerMenu.CustomerMenu;
import utils.UserInput;

public class ViewBalance {
    UserInput input = new UserInput();
    public ViewBalance(Customer customer){
        System.out.println("Your account number is: "+customer.getAccNumber());
        System.out.println("Your current balance is: "+customer.getBalance());
        input.pressEnterContinue();
        new CustomerMenu(customer);
    }

}
