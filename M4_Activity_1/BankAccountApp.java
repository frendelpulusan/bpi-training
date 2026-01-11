package ph.com.bpi.hello;

public class BankAccountApp {

    public static void main(String[] args) {

        System.out.println("=== Bank Account Name Display ===\n");

        runAccountTest("ACC-101");
        runAccountTest("ACC-555");

        System.out.println("=== Program completed successfully! ===");
    }

    public static void runAccountTest(String accNumber) {
        System.out.println("Looking up account : " + accNumber);

        String accountHolder = fetchAccountHolder(accNumber);

        if (accountHolder != null) {
            System.out.println("Account holder : " + accountHolder.toUpperCase() + "\n");
        } else {
            System.out.println("Error : Account not found!\n");
        }
    }

    public static String fetchAccountHolder(String accNumber) {

        if ("ACC-101".equals(accNumber)) {
            return "Pedro Reyes";
        } else if ("ACC-202".equals(accNumber)) {
            return "Ana Lopez";
        } else {
            return null;
        }
    }
}