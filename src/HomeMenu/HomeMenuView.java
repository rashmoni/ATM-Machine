package HomeMenu;

import java.util.List;
import utils.*;

public class HomeMenuView {
    public HomeMenuView(List<String> HomeMenuOptions) {
        MenuPrintHandler.clearScreen();
        MenuPrintHandler.appTitle();
        System.out.println("Home menu options:");
        MenuPrintHandler.printOptionList(HomeMenuOptions);
        printUserPrompt();
    }

    public void printInvalidOption() {
        System.out.println("⚠️ Invalid user");
    }

    public void printUserPrompt() {
        System.out.print("Choose an option press enter: ");
    }
}
