package transaction;

import account.Account;

public class Transaction {
    public static void transferFunds(Account fromAccount, Account toAccount, double amount) {
        if (fromAccount != null && toAccount != null && amount > 0) {
            if (fromAccount.getBalance() >= amount) {
                fromAccount.withdraw(amount);
                toAccount.deposit(amount);
                System.out.println("Transferred " + amount + " from " + fromAccount.getAccountNumber() + " to " + toAccount.getAccountNumber());
            } else {
                System.out.println("Insufficient balance for transfer.");
            }
        } else {
            System.out.println("Invalid transaction parameters.");
        }
    }
}
