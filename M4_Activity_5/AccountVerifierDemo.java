package ph.com.bpi.hello;

public class AccountVerifierDemo {

    public static void main(String[] args) {

        System.out.println("=== Account Verification Run ===\n");

        checkCase("A : Complete numeric (9876543210)", "9876543210");
        checkCase("B : Below required length (555)", "555");
        checkCase("C : Mixed characters (1122AA3344)", "1122AA3344");
        checkCase("D : With whitespace (9999 888800)", "9999 888800");
        checkCase("E : Missing input", null);
    }

    public static void checkCase(String scenario, String acct) {
        System.out.println("Scenario " + scenario);

        try {
            checkAcctNo(acct);
        } catch (AcctLengthException e) {
            System.out.println("FAIL : " + e.getMessage());
        } catch (AcctFormatException e) {
            System.out.println("NOTICE : " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("NOTICE : " + e.getMessage());
        }
    }

    public static void checkAcctNo(String acct) throws AcctLengthException {
        if (acct == null) {
            throw new NullPointerException("Account input is required\n");
        }

        for (char ch : acct.toCharArray()) {
            if (!Character.isDigit(ch)) {
                throw new AcctFormatException(
                        "Account value contains invalid characters\n");
            }
        }

        if (acct.length() != 10) {
            throw new AcctLengthException(
                    "Account value must be 10 digits in length\n");
        }

        System.out.println("SUCCESS : Verified account -> " + acct + "\n");
    }
}