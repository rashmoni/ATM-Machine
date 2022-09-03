package SignupMenu;

public class SignupMenu{

    public SignupMenu(){
    SignupMenuModel model = new SignupMenuModel();
    SignupMenuView view = new SignupMenuView();
    SignupMenuController controller = new SignupMenuController(model, view);

    controller.requestUserInput();
    }
}
