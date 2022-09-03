package HomeMenu;

import java.util.List;
import utils.*;

public class HomeMenuView {
    public HomeMenuView(List<String> HomeMenuOptions) {
        PrintHandler.clearScreen();
        PrintHandler.appTitle();
        System.out.println("Home menu options:");
        PrintHandler.printOptionList(HomeMenuOptions);
        printUserPrompt();
    }

    public void printInvalidOption() {
        System.out.println("⚠️ Invalid user");
    }

    public void printUserPrompt() {
        System.out.print("Choose an option press enter: ");
    }
}
