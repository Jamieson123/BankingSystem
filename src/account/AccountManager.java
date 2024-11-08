package account;

import java.util.HashMap;
import java.util.Map;

public class AccountManager {
    private Map<String, Account> accounts = new HashMap<>();

    public void createAccount(String accountNumber, String accountHolder, double initialDeposit) {
        Account newAccount = new Account(accountNumber, accountHolder, initialDeposit);
        accounts.put(accountNumber, newAccount);
        System.out.println("Account created for " + accountHolder);
    }

    public Account getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }

    public void displayAccountDetails(String accountNumber) {
        Account account = getAccount(accountNumber);
        if (account != null) {
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Account Holder: " + account.getAccountHolder());
            System.out.println("Balance: " + account.getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }
}
