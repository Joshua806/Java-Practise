
public class Main {

    public static void main(String[] args) {

        Account bobsAccount = new Account("12345", 0.00, "Bob Brown", "myemail@gmail.com", "1233456");
        bobsAccount.setAccountNumber("12345");
        bobsAccount.setBalance(0.00);
        bobsAccount.setCustomerName("Bob Brown");
        bobsAccount.setCustomerEmailAddress("myemail@gmail.com");
        bobsAccount.setCustomerPhoneNumber("1234324565");

        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100.0);
    }
}
