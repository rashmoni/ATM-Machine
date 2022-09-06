package LoginMenu;

import utils.MenuPrintHandler;


public class LoginMenuView {
    public LoginMenuView() {
        MenuPrintHandler.clearScreen();
        MenuPrintHandler.appTitle();
    }

    public void printUserNamePrompt() {
        System.out.print("Please Enter Username: ");
    }

    public void printInvalidCred() {
        System.out.println("⚠️ Invalid username/password, please try again: ");
    }
}
