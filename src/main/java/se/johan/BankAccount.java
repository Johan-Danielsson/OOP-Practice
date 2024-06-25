package se.johan;

public class BankAccount {

    // ## Fields ##

    private String accountNumber;
    private String customerBalance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;


    // ## Constructors ##
    public BankAccount(String accountNumber, String customerBalance, String customerName, String customerEmail, String customerPhoneNumber) {
        this.accountNumber = accountNumber;
        this.customerBalance = customerBalance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    // ## GETTERS ##
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerBalance() {
        return customerBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    // ## SETTERS ##

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    //## METHODS ##
    public String getAccountInfo() {
        String result = "Account number: " + accountNumber + " Current Balance: " + customerBalance + " Customer Name: " + customerName + " Email: " + customerEmail + " Phone Number: " + customerPhoneNumber;
        return result;
    }
}



