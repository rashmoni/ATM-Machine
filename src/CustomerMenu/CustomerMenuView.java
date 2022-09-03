package CustomerMenu;

import Customer.Customer;
import utils.PrintHandler;

import java.util.List;

public class CustomerMenuView {

    public CustomerMenuView(List<String> customerMenuOptions, Customer newCustomer) {
        PrintHandler.clearScreen();
        PrintHandler.appTitle();
        System.out.println("Welcome: " + newCustomer.getFullName());
        System.out.println("Customer menu options:");
        PrintHandler.printOptionList(customerMenuOptions);
        PrintHandler.goBack();
        printUserPrompt();
    }
    public void printInvalidOption() {
        System.out.println("⚠️ Invalid option");
    }
    public void printUserPrompt() {
        System.out.print("Choose an option press enter: ");
    }
}
