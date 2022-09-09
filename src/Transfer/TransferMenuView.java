package Transfer;

import utils.MenuPrintHandler;

import java.util.List;

public class TransferMenuView {
    public TransferMenuView(List<String> transferCustomers) {
        MenuPrintHandler.clearScreen();
        MenuPrintHandler.appTitle();
        System.out.println("Please select userid to which you want to transfer:");
        MenuPrintHandler.printOptionList(transferCustomers);
        MenuPrintHandler.goBack();
        printUserNamePrompt();
    }

    public void printUserNamePrompt() {
        System.out.print("Please select a value: ");
    }

    public void printInvalidOption() {
        System.out.println("⚠️ Invalid input");
    }
}

