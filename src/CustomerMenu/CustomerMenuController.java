package CustomerMenu;

import HomeMenu.HomeMenuModel;
import HomeMenu.HomeMenuView;

import java.io.IOException;
import java.util.Scanner;

public class CustomerMenuController {
    private final CustomerMenuView view;
    private final CustomerMenuModel model;
    private final Scanner scanner;

    public CustomerMenuController(CustomerMenuModel model, CustomerMenuView view) {
        this.model = model;
        this.view = view;
        this.scanner = new Scanner(System.in);
    }

    public void requestUserInput() {
        String input = scanner.nextLine();



        try {
            int selectedOption = Integer.parseInt(input);

            model.handleOption(selectedOption);
        }
        catch (NumberFormatException | IndexOutOfBoundsException exception) {
            view.printInvalidOption();
            view.printUserPrompt();
            requestUserInput();
        }
    }
}
