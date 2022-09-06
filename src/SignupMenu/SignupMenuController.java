package SignupMenu;

import Customer.Customer;
import utils.Encryptor;
import utils.GenerateAccNum;
import utils.FileWriter;
import utils.UserInput;
import CustomerMenu.*;
import java.math.BigDecimal;
import java.util.Scanner;

public class SignupMenuController {
    private final SignupMenuView view;
    private final SignupMenuModel model;
    private final Scanner scanner;
    UserInput input = new UserInput();
    public SignupMenuController(SignupMenuModel model, SignupMenuView view) {
        this.model = model;
        this.view = view;
        this.scanner = new Scanner(System.in);
    }

    public void requestUserInput() {
        view.userNameprompt();
        String fullName = input.readText();
        view.userIDrompt();
        String userID = input.readText();
        String password = input.passwordReader("signup");
        String encryptPassword = Encryptor.encryptPassword(password);
        String newAccountnumber = GenerateAccNum.generateAccNum();
        BigDecimal initialDeposit = BigDecimal.valueOf(0);

        Customer newCustomer = new Customer(newAccountnumber,userID,encryptPassword,fullName,initialDeposit);

        FileWriter.addNewRecord(newCustomer);
        view.regSuccessful();
        input.pressEnterContinue();
        new CustomerMenu(newCustomer);
    }
}
