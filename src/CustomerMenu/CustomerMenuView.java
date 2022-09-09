package CustomerMenu;

import Customer.Customer;
import utils.MenuPrintHandler;

import java.util.List;

public class CustomerMenuView {

    public CustomerMenuView(List<String> customerMenuOptions, Customer customer) {
        MenuPrintHandler.clearScreen();
        MenuPrintHandler.appTitle();
        System.out.println("Welcome: " + customer.getFullName());
        System.out.println("Your Account number is : " + customer.getAccNumber());
        System.out.println("Balance : " + customer.getBalance());
        System.out.println("Customer menu options:");
        MenuPrintHandler.printOptionList(customerMenuOptions);
        MenuPrintHandler.logOut();
        printUserPrompt();
    }
    public void printInvalidOption() {
        System.out.println("⚠️ Invalid option");
    }
    public void printUserPrompt() {
        System.out.print("Choose an option press enter: ");
    }
}
