package se.johan;

public class App 
{
    public static void main( String[] args )
    {
        BankAccount account1 = new BankAccount("12344", 100, "Johan Danielsson", "johan@danielsson.com", "70123455");
        System.out.println(account1.getAccountInfo());
    }
}
