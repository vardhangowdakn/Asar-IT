import java.util.*;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class ExceptionHandling {
    private static int balance = 10000;

    public static void withdraw(int amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Transaction failed due to insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal of amount: ₹" + amount);
            System.out.println("Remaining balance is: ₹" + balance);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Enter amount to withdraw: ");
            int amount = scan.nextInt();

            withdraw(amount);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
        } finally {
            System.out.println("Thank you for using our ATM.");
            scan.close();
        }
    }
}

// output 1
// Enter amount to withdraw: 3000
// Withdrawal of amount: ?3000
// Remaining balance is: ?7000
// Thank you for using our ATM.

// output 2
// Enter amount to withdraw: 20000
// Transaction failed due to insufficient balance.
// Thank you for using our ATM.