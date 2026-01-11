package ph.com.bpi.hello;

public class ATMSystemApp {

    // Demo account balances
    public static double[] accountBalances = {10000, 15000, 20000};

    public static void main(String[] args) {

        System.out.println("=== ATM Withdrawal Application ===\n");

        System.out.println("--- Test Case 1 : Successful Withdrawal ---\n");
        performWithdrawal("1", "5000");

        System.out.println("--- Test Case 2 : Invalid Account Input ---\n");
        performWithdrawal("abc", "5000");

        System.out.println("--- Test Case 3 : Account Does Not Exist ---\n");
        performWithdrawal("10", "5000");

        System.out.println("--- Test Case 4 : Not Enough Balance ---\n");
        performWithdrawal("1", "20000");

        System.out.println("=== All test cases executed ===\n");
    }

    /**
     * Handles withdrawal logic with exception handling
     */
    public static void performWithdrawal(String accountKey, String withdrawalInput) {

        try {
            int accountNumber = Integer.parseInt(accountKey);
            double availableBalance = accountBalances[accountNumber];
            double withdrawalAmount = Double.parseDouble(withdrawalInput);

            System.out.printf("Account Number : %d%n", accountNumber);
            System.out.printf("Requested Amt  : ₱%.2f%n", withdrawalAmount);
            System.out.printf("Balance        : ₱%.2f%n", availableBalance);

            if (withdrawalAmount > availableBalance) {
                System.out.printf("Error: Insufficient funds for ₱%.2f%n%n", withdrawalAmount);
            } else {
                double remainingBalance = availableBalance - withdrawalAmount;
                System.out.printf("Withdrawn      : ₱%.2f%n", withdrawalAmount);
                System.out.printf("New Balance    : ₱%.2f%n", remainingBalance);
                System.out.println("Transaction successful!\n");
            }

        } catch (NumberFormatException e) {
            System.out.println("Account = " + accountKey + ", Amount = ₱" + withdrawalInput);
            System.out.println("Input Error: Invalid numeric values.");
            System.out.println("Please enter valid numbers only.\n");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Account = " + accountKey + ", Amount = ₱" + withdrawalInput);
            System.out.println("Account Error: Account number does not exist.");
            System.out.println("Please select a valid account.\n");

        } catch (Exception e) {
            System.out.println("Transaction failed due to an unexpected error.\n");
        }
    }
}