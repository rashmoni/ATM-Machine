package Transfer;

import Customer.Customer;

public class TransferMenu {
    public TransferMenu(Customer customer){
        TransferMenuModel model = new TransferMenuModel(customer);
        TransferMenuView view = new TransferMenuView(model.gettransferCustomerOptions());
        TransferMenuController controller = new TransferMenuController(model, view);

        controller.requestUserInput();

    }
}



