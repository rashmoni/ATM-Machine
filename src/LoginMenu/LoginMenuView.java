package LoginMenu;

import utils.PrintHandler;


public class LoginMenuView {
    public LoginMenuView() {
        PrintHandler.clearScreen();
        PrintHandler.appTitle();
    }

    public void printUserNamePrompt() {
        System.out.print("Please Enter Username: ");
    }

    public void printInvalidCred() {
        System.out.println("⚠️ Invalid username/password, please try again: ");
    }
}
