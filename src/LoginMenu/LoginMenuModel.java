package LoginMenu;
import Customer.Customer;
import CustomerMenu.*;

public class LoginMenuModel {
        public void handleOption(Customer customer) {
            new CustomerMenu(customer);
        }

    }

