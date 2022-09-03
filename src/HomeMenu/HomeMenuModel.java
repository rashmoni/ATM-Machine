package HomeMenu;

import java.io.IOException;
import java.util.List;
import LoginMenu.*;
import SignupMenu.SignupMenu;

public class HomeMenuModel {
    private final List<String> homeMenuOptions = List.of("Login", "Signup");
    public List<String> getHomeMenuOptions() {
        return homeMenuOptions;
    }

    public void handleOption(int selectedOption) throws IndexOutOfBoundsException, IOException {
        switch (selectedOption) {
             case 1 -> new LoginMenu();
             case 2 -> new SignupMenu();
             default -> throw new IndexOutOfBoundsException();
        }
    }
}
