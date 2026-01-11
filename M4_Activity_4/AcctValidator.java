package ph.com.bpi.sample;

public class AcctValidator {

    public static void main(String[] args) {

        try {
            verifyAcct("9876543210");
        } catch (Exception e) {
            System.out.println("Validation error: " + e.getMessage());
        }

        try {
            verifyAcct("4567");
        } catch (Exception e) {
            System.out.println("Validation error: " + e.getMessage());
        }

        try {
            verifyAcct(null);
        } catch (Exception e) {
            System.out.println("Validation error: " + e.getMessage());
        }
    }

    public static void verifyAcct(String acctNumber) throws Exception {

        if (acctNumber == null) {
            throw new NullPointerException("Account number cannot be null");
        }

        if (acctNumber.length() != 10) {
            throw new Exception("Account number must be exactly 10 digits");
        }

        System.out.println("Valid account number: " + acctNumber);
    }
}