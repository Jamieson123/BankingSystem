import account.Account;
import account.AccountManager;
import java.util.Scanner;
import security.Security;
import transaction.Transaction;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AccountManager accountManager = new AccountManager();
        Security security = new Security();

        // Register a user
        security.registerUser("user1", "password123");

        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (security.authenticate(username, password)) {
            System.out.println("Login successful.");

            accountManager.createAccount("001", "Alice", 1000.0);
            accountManager.createAccount("002", "Bob", 500.0);

            Account aliceAccount = accountManager.getAccount("001");
            Account bobAccount = accountManager.getAccount("002");

            // Deposit and withdraw
            aliceAccount.deposit(200.0);
            aliceAccount.withdraw(100.0);

            // Display account details
            accountManager.displayAccountDetails("001");
            accountManager.displayAccountDetails("002");

            // Transfer funds
            Transaction.transferFunds(aliceAccount, bobAccount, 150.0);
        } else {
            System.out.println("Authentication failed.");
        }

        scanner.close();
    }
}
