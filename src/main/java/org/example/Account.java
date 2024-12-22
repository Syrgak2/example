package org.example;

public class Account {
    private int id;
    private int balance;
    private int customerId;

    public Account(int id, int balance, int customerId) {
        this.id = id;
        this.balance = balance;
        this.customerId = customerId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}
