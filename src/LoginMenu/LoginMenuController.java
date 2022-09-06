package LoginMenu;

import Customer.Customer;
import utils.*;

public class LoginMenuController {
        private final LoginMenuView view;
        private final LoginMenuModel model;
        UserInput input = new UserInput();
        CustomerReader reader = new CustomerReader();
        public LoginMenuController(LoginMenuModel model, LoginMenuView view) {
            this.model = model;
            this.view = view;
        }

        public void requestUserInput() {
            view.printUserNamePrompt();
            String userName = input.readText();
            String password = input.passwordReader("login");
            String encryptPassword = Encryptor.encryptPassword(password);
            Customer customer = reader.getCustomer(userName,encryptPassword);
            if(customer!=null){
                model.handleOption(customer);
            }
            else {
                view.printInvalidCred();
                requestUserInput();
            }
        }
    }


