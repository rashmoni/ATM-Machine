package LoginMenu;

import java.io.IOException;


public class LoginMenu {
        public LoginMenu() {
            LoginMenuModel model = new LoginMenuModel();
            LoginMenuView view = new LoginMenuView();
            LoginMenuController controller = new LoginMenuController(model, view);

            controller.requestUserInput();
        }
    }

