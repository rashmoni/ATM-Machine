package CustomerMenu;


import Customer.Customer;


public class CustomerMenu {
    public CustomerMenu(Customer customer) {
        CustomerMenuModel model = new CustomerMenuModel(customer);
        CustomerMenuView view = new CustomerMenuView(model.getcustomerMenuOptions(), customer);
        CustomerMenuController controller = new CustomerMenuController(model, view);

        controller.requestUserInput();
    }
}
