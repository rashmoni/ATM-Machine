package Transfer;


import Customer.Customer;
import CustomerMenu.CustomerMenu;
import utils.CustomerReader;
import utils.FileWriter;
import utils.UserInput;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;


public class TransferMenuModel {
    List<String> transferCustomerOptions;
    private Customer customer;

    public TransferMenuModel(Customer customer) {
        this.customer = customer;
        transferCustomerOptions = CustomerReader.getAllUserNames(customer.getUsername());
    }

    public List<String> gettransferCustomerOptions() {
        return transferCustomerOptions;
    }

    public void handleOption(int selectedOption) throws IndexOutOfBoundsException, IOException {
        {
            if (selectedOption == 0) {
                new CustomerMenu(customer);
            } else if (selectedOption <= transferCustomerOptions.size()) {
                transferBalance(selectedOption);
            } else
                throw new IndexOutOfBoundsException();
        }
    }

    private void transferBalance(int selectedOption) {
        CustomerReader reader = new CustomerReader();
        Customer transferCustomer = reader.getTransferCustomer(transferCustomerOptions.get(selectedOption-1));
        UserInput input = new UserInput();

        BigDecimal transferAmount;
        BigDecimal remainingBalance;
        transferAmount = BigDecimal.valueOf(input.readInteger("Please Enter amount you want to transfer: ","Invalid Entry:",1, 1000000));
        remainingBalance = customer.getBalance().subtract(transferAmount);

        while(remainingBalance.compareTo(BigDecimal.ZERO) < 0){
            System.out.println("Cannot transfer more amount than available, please enter another amount: ");
            transferAmount = BigDecimal.valueOf(input.readInteger("Please Enter amount you want to transfer: ","Invalid Entry:",1, 1000000));
            remainingBalance = customer.getBalance().subtract(transferAmount);
        }
        customer.withdrawAmount(transferAmount);
        transferCustomer.depositeAmount(transferAmount);
        FileWriter.updateRecord(customer);
        FileWriter.updateRecord(transferCustomer);
        System.out.println("Amonut "+ transferAmount+" is successfully transferred to "+transferCustomer.getUsername());
        input.pressEnterContinue();
        new CustomerMenu(customer);
    }
}
