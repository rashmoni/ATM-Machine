package SignupMenu;

import Customer.Customer;
import utils.Encryptor;
import utils.GenerateAccNum;
import utils.UpdateRecord;
import utils.UserInput;

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
        System.out.print("Please enter Full Name: ");
        String fullName = input.readText();
        System.out.print("Please enter userid: ");
        String userID = input.readText();
        System.out.print("Please enter password: ");
        String password = input.readText();
        String encryptPassword = Encryptor.encryptPassword(password);
        String newAccountnumber = GenerateAccNum.generateAccNum();
        BigDecimal initialDeposit = BigDecimal.valueOf(0);

        Customer newCustomer = new Customer(newAccountnumber, userID,encryptPassword, fullName,initialDeposit);

        UpdateRecord.addNewRecord(newCustomer);


    }
}
