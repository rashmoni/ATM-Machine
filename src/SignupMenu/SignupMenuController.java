package SignupMenu;

import java.util.Scanner;

public class SignupMenuController {

    private final SignupMenuView view;
    private final SignupMenuModel model;
    private final Scanner scanner;

    public SignupMenuController(SignupMenuModel model, SignupMenuView view) {
        this.model = model;
        this.view = view;
        this.scanner = new Scanner(System.in);
    }

    public void requestUserInput() {
        String input = scanner.nextLine();

        System.out.println("You have Entered " + input);
    }
}
