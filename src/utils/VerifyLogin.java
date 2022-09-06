package utils;

import Customer.Customer;
import java.math.BigDecimal;
import java.util.List;


public class VerifyLogin {

    public static Customer newCustomer = null;
    public boolean verifyLogin(String userName, String password) {
        boolean isValidLogin = false;
        List<String> allCustomers = FileReader.readTextFile();
        for (int index = 0; index < allCustomers.size(); index++) {
            String customer = allCustomers.get(index);
            List<String> customerDataList = FileReader.breakLineBySeparatorCharacter(customer, ",");
            if (userName.equals(customerDataList.get(1)) && password.equals(customerDataList.get(2))) {
                newCustomer = new Customer(customerDataList.get(0), customerDataList.get(1), customerDataList.get(2), customerDataList.get(3),new BigDecimal((customerDataList.get(4))));
                isValidLogin = true;
            }
        }

        return isValidLogin;
    }

    public Customer returnCustomer() {
        return this.newCustomer;
    }
}