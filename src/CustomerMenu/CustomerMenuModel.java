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
    private Customer customer;
    public CustomerMenuModel(Customer customer){
     this.customer = customer;
    }
    public void handleOption(int selectedOption) throws IndexOutOfBoundsException{
        switch (selectedOption) {
            case 0 -> new HomeMenu();
            case 1 -> new ViewBalance(customer);
            case 2 -> new Deposit(customer);
            case 3 -> new Withdraw(customer);
            case 4 -> new ChangeUsername(customer);
            case 5 -> new ChangePassword(customer);
            case 6->  new TransferMenu(customer);
            default -> throw new IndexOutOfBoundsException();
        }
    }
}
