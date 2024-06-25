package se.johan;

public class BankAccount {

    // ## Fields ##

    private String accountNumber;
    private static double customerBalance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;


    // ## Constructors ##
    public BankAccount(String accountNumber, double customerBalance, String customerName, String customerEmail, String customerPhoneNumber) {
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

    public static double getCustomerBalance() {
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

    public static void setCustomerBalance(double customerBalance) {
        BankAccount.customerBalance = customerBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    //## METHODS ##
    public String getAccountInfo() {
        String result = "Account number: " + accountNumber + " Current Balance: " + customerBalance + " Customer Name: " + customerName + " Email: " + customerEmail + " Phone Number: " + customerPhoneNumber;
        return result;
    }
    public void deposit(double amount){
        customerBalance += amount;
    }
    public void withdraw(double amount){
        if (customerBalance >= amount) {
            customerBalance -= amount;

        }else{
            System.out.println("Insufficient Balance, withdrawal aborted.");
        }
    }
    public double getBalance(){
        return customerBalance;
    }

    }




