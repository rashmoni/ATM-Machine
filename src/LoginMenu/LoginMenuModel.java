package LoginMenu;
import Customer.Customer;
import CustomerMenu.*;


public class LoginMenuModel {
     Customer newCustomer;
        public void handleOption(Customer newCustomer) {
            this.newCustomer = newCustomer;
            new CustomerMenu(newCustomer);
        }

    }

