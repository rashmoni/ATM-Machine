package CustomerMenu;

import Customer.Customer;
import utils.MenuPrintHandler;

import java.util.List;

public class CustomerMenuView {

    public CustomerMenuView(List<String> customerMenuOptions, Customer newCustomer) {
        MenuPrintHandler.clearScreen();
        MenuPrintHandler.appTitle();
        System.out.println("Welcome: " + newCustomer.getFullName());
        System.out.println("Customer menu options:");
        MenuPrintHandler.printOptionList(customerMenuOptions);
        MenuPrintHandler.goBack();
        printUserPrompt();
    }
    public void printInvalidOption() {
        System.out.println("⚠️ Invalid option");
    }
    public void printUserPrompt() {
        System.out.print("Choose an option press enter: ");
    }
}
