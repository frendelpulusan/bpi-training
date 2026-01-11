package ph.com.bpi.hello;

public class BankATMTxn {

    public static void main(String[] args) {

        System.out.println("=== DIGITAL BANKING TERMINAL ===\n");

        System.out.println("--- Case A: Savings Account Verification ---");
        viewAccountSummary("101456789", 8200.75);

        System.out.println("--- Case B: Checking Account Verification ---");
        viewAccountSummary("209876543", 46350.40);

        System.out.println("--- Case C: Non-Numeric Account Input ---");
        viewAccountSummary("ACCT9001", 12000.00);

        System.out.println("--- Case D: Blank Account Input ---");
        viewAccountSummary("", 5000.00);
    }

    /**
     * Shows account details for a given account code.
     *
     * @param acctCode the account code to validate
     * @param availableBalance the available balance
     */
    public static void viewAccountSummary(String acctCode, double availableBalance) {
        System.out.println("Starting account inquiry...");

        try {
            // Validate account code as numeric
            Integer.parseInt(acctCode);

            // Determine account classification
            char accountPrefix = acctCode.charAt(0);
            String accountCategory;

            if (accountPrefix == '1') {
                accountCategory = "Savings Account";
            } else if (accountPrefix == '2') {
                accountCategory = "Checking Account";
            } else {
                accountCategory = "Other Account Type";
            }

            // Display inquiry results
            System.out.println("Account Category : " + accountCategory);
            System.out.println("Account Code     : " + acctCode);
            System.out.printf("Account Balance  : ₱%.2f%n", availableBalance);
            System.out.println("Inquiry Result   : Successful");

        } catch (NumberFormatException e) {
            System.out.println("System Alert     : Account code must contain numbers only.");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("System Alert     : Account code cannot be empty.");
        } finally {
            // Transaction slip
            System.out.println("\n======= TRANSACTION SLIP =======");
            System.out.println("Transaction Date : January 11, 2026");
            System.out.println("Service Request  : Balance Inquiry");
            System.out.println("Terminal ID      : ATM-CLB-01");
            System.out.println("Branch           : Calamba City");
            System.out.println("Note             : Keep this slip for reference.");
            System.out.println("================================\n");
        }
    } // end of viewAccountSummary
}