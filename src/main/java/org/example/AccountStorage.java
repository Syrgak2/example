package org.example;

public class AccountStorage {
    private int lastAccountIndex = 0;
    Account[] accounts = new Account[100];

    public int getLastAccountIndex() {
        return lastAccountIndex;
    }

    public void setLastAccountIndex(int lastAccountIndex) {
        this.lastAccountIndex = lastAccountIndex;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccount(Account accounts) {
        this.lastAccountIndex++;
        if (lastAccountIndex > 100) {
            System.out.println("База переаолнено");
        }
        this.accounts[lastAccountIndex] = accounts;
    }

    public Account getAccount(int customerId) {
        Account account = null;
        for (int i = 0; i < accounts.length; i++) {
            System.out.println(i);

            if (accounts[i] != null) {
                if (accounts[i].getCustomerId() == customerId) {
                    account =  accounts[i];
                    break;
                }
            }
        }

        return account;
    }

}
