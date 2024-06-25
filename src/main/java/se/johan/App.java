package se.johan;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;



public class App
{
    static Scanner input = new Scanner(System.in);
    public static void main( String[] args ) {
        BankAccount account1 = new BankAccount("12344", 100, "Johan Danielsson", "johan@danielsson.com", "70123455");
        System.out.println(account1.getAccountInfo());
        System.out.println("-----------------------");
        //Making deposit
        System.out.println("Depositing 100 to account..");
        account1.deposit(100);
        System.out.println("New balance after depositing 100: " +account1.getBalance());
        //Making Withdrawal
        System.out.println("Withdrawing 50 from account..");
        account1.withdraw(50);
        System.out.println("New balance after withdrawing 50: "+account1.getBalance());
        //Making a too large withdrawal
        System.out.println("Withdrawing 200 from account..");
        account1.withdraw(200);
        System.out.println("Balance on the account is still "+account1.getBalance());
    }
}
