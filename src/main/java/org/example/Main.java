package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CustomerStorage customerStorage = new CustomerStorage();
        AccountStorage accountStorage = new AccountStorage();
        boolean run = true;
        while (run) {
            run = startApp(customerStorage, accountStorage);
        }
    }

    public static boolean startApp(CustomerStorage customerStorage, AccountStorage accountStorage) {
        boolean temp = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите действие:");
        System.out.println("1. Создать клиента");
        System.out.println("2. Удалить клиента");
        System.out.println("3. Создать аккаунт");
        System.out.println("4. Взять деньги");
        System.out.println("5. Положить деньги");
        System.out.println("0. Выход");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                int customerId = createCustomer(customerStorage);
                System.out.println("Ваш id клиента: " + customerId + " не потеряйте его!");
                break;
            case 2:
                System.out.println("Удалить клиента");
                break;
            case 3:
                int accountId = createAccount(customerStorage, accountStorage);
                if (accountId == -1) {
                    System.out.println("При созланиии возникла ошибка");
                } else {
                    System.out.println("Ваш id аккаунта: " + accountId + " не потеряйте его!");
                }
                break;
            case 4:
                System.out.println("Взять деньги");
                break;
            case 5:
                int count = setMany(accountStorage, customerStorage);
                if (count == -1) {
                    System.out.println("При созланиии возникла ошибка");
                }
                System.out.println("Ваш баланс: " + count);
                break;
            case 0:
                System.out.println("Выход");
                temp = false;
                break;
            default:
                System.out.println("Некорректный выбор");
        }
        return temp;
    }

    public static int createCustomer(CustomerStorage customerStorage) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя клиента:");
        String name = scanner.nextLine();
        System.out.println("Введите пороль :");
        String password = scanner.nextLine();

        int id = customerStorage.getLastCustomerIndex() + 1;

        Customer customer = new Customer(id, name, password);
        customerStorage.setCustomers(customer);

        return id;
    }


    public static int createAccount(CustomerStorage customerStorage, AccountStorage accountStorage) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пороль :");
        String password = scanner.nextLine();

        System.out.println("Введите id клиента:");
        int customerId = scanner.nextInt();

        if (comparePassword(password, customerStorage, customerId)) {
            System.out.println(accountStorage.getLastAccountIndex());
            int id = accountStorage.getLastAccountIndex() + 1;
            Account account = new Account(id,0, customerId);
            accountStorage.setAccount(account);
            return account.getId();
        } else {
            return -1;
        }
    }

    public static boolean comparePassword(String password, CustomerStorage customerStorage, int customerId) {
        Customer customer = customerStorage.getCustomer(customerId);

        if (customer == null) {
            return false;
        } else {
            return customer.getPassword().equals(password);
        }
    }

    public static int setMany(AccountStorage accountStorage, CustomerStorage customerStorage) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите id клиента:");
        int customerId = scanner.nextInt();

        System.out.println("Введите сумму:");
        int count = scanner.nextInt();


        Account account = accountStorage.getAccount(customerId);
        if (account == null) {
            return -1;
        }
        account.setBalance(account.getBalance() + count);
        return account.getBalance();
    }
}