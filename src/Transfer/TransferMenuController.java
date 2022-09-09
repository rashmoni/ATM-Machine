package Transfer;


import Customer.Customer;

import java.io.IOException;
import java.util.Scanner;

public class TransferMenuController {
    private final TransferMenuView view;
    private final TransferMenuModel model;
    private final Scanner scanner;


    public TransferMenuController(TransferMenuModel model, TransferMenuView view) {
        this.model = model;
        this.view = view;
        this.scanner = new Scanner(System.in);
    }

    public void requestUserInput() {
        String input = scanner.nextLine();

        try {
            int selectedOption = Integer.parseInt(input);

            model.handleOption(selectedOption);
        } catch (NumberFormatException | IndexOutOfBoundsException | IOException exception) {
            view.printInvalidOption();
            view.printUserNamePrompt();
            requestUserInput();
        }

    }
}
