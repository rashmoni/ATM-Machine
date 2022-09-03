package CustomerMenu;


import Customer.Customer;

import java.io.IOException;

public class CustomerMenu {
    public CustomerMenu(Customer newCustomer) {
        CustomerMenuModel model = new CustomerMenuModel(newCustomer);
        CustomerMenuView view = new CustomerMenuView(model.getcustomerMenuOptions(), newCustomer);
        CustomerMenuController controller = new CustomerMenuController(model, view);

        controller.requestUserInput();
    }
}
