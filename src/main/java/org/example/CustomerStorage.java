package org.example;

public class CustomerStorage {
    private int lastCustomerIndex = 0;
    Customer[] customers = new Customer[100];

    public CustomerStorage() {

    }

    public int getLastCustomerIndex() {
        return lastCustomerIndex;
    }

    public void setLastCustomerIndex(int lastCustomerIndex) {
        this.lastCustomerIndex = lastCustomerIndex;
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public Customer getCustomer(int id) {
        Customer customer = customers[id];
        if (customer == null) {
            return null;
        } else {
            return customer;
        }
    }

    public void setCustomers(Customer customer) {
        this.lastCustomerIndex++;
        if (lastCustomerIndex > 100) {
            System.out.println("База переаолнено");
        }
        this.customers[lastCustomerIndex] = customer;
    }
}
