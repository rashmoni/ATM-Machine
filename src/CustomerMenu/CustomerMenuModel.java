package CustomerMenu;

import Customer.Customer;
import HomeMenu.*;
import ViewBalance.*;
import Deposit.*;
import Withdraw.*;
import ChangeUsername.*;
import Transfer.*;
import java.util.List;
import ChangePassword.*;

public class CustomerMenuModel {
    private final List<String> customerMenuOptions = List.of("View Balance", "Deposit","Withdraw", "ChangeUsername","ChangePassword","Transfer");
    public List<String> getcustomerMenuOptions() {
        return customerMenuOptions;
    }

    private Customer newCustomer;
    public CustomerMenuModel(Customer newCustomer){
     this.newCustomer = newCustomer;
    }
    public void handleOption(int selectedOption) throws IndexOutOfBoundsException{
        switch (selectedOption) {
            case 0 -> new HomeMenu();
            case 1 -> new ViewBalance(newCustomer);
            case 2 -> new Deposit(newCustomer);
            case 3 -> new Withdraw(newCustomer);
            case 4 -> new ChangeUsername(newCustomer);
            case 5 -> new ChangePassword(newCustomer);
            case 6->  new Transfer();
            default -> throw new IndexOutOfBoundsException();
        }
    }
}
