package utils;

import Customer.Customer;

import java.math.BigDecimal;
import java.util.List;

public class CustomerReader {
    public Customer getCustomer(String userName, String password) {
        Customer customer = null;
        List<String> allCustomers = FileReader.readTextFile();
        for (int index = 0; index < allCustomers.size(); index++) {
            String customerString = allCustomers.get(index);
            List<String> customerDataList = FileReader.breakLineBySeparatorCharacter(customerString, ",");
            if (userName.equals(customerDataList.get(1)) && password.equals(customerDataList.get(2))) {
                customer = new Customer(customerDataList.get(0), customerDataList.get(1), customerDataList.get(2), customerDataList.get(3), new BigDecimal((customerDataList.get(4))));
            }
        }
        return customer;
    }

    public Customer getTransferCustomer(String userName) {
        Customer transferCustomer = null;
        List<String> allCustomers = FileReader.readTextFile();
        for (int index = 0; index < allCustomers.size(); index++) {
            String customerString = allCustomers.get(index);
            List<String> customerDataList = FileReader.breakLineBySeparatorCharacter(customerString, ",");
            if (userName.equals(customerDataList.get(1))) {
                transferCustomer = new Customer(customerDataList.get(0), customerDataList.get(1), customerDataList.get(2), customerDataList.get(3), new BigDecimal((customerDataList.get(4))));
            }
        }
        return transferCustomer;
    }
}