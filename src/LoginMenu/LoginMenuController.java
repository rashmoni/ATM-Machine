package LoginMenu;

import Customer.Customer;
import utils.*;
import java.io.IOException;
import java.util.Scanner;

public class LoginMenuController {

        private final LoginMenuView view;
        private final LoginMenuModel model;
        private final Scanner scanner;

        UserInput input = new UserInput();

        VerifyLogin Login = new VerifyLogin();
        public LoginMenuController(LoginMenuModel model, LoginMenuView view) {
            this.model = model;
            this.view = view;
            this.scanner = new Scanner(System.in);
        }

        public void requestUserInput() throws IOException {
            view.printUserNamePrompt();
            String userName = input.readText();
            view.printUserPassPrompt();
            String password = input.readText();
            String encryptPassword = Encryptor.encryptPassword(password);
            boolean isValidLogin = Login.verifyLogin(userName,encryptPassword);
            if (isValidLogin) {
                Customer newCustomer = Login.returnCustomer();
                model.handleOption(newCustomer);
            }
            else {
                view.printInvalidCred();
                requestUserInput();
            }
        }
    }


