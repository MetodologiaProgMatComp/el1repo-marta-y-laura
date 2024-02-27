package Ejercicio2_5;

public class Account {private int id;
    private Customer1 customer;
    private double balance = 0.0;

    public Account(int id, Customer1 customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer1 customer) {
        this.id = id;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public Customer1 getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", customer=" + customer + ", balance=" + String.format("%.2f",balance) + balance + '}';
    }

    public String getCustomerName() {
        return this.customer.getName();
    }

    public Account deposit(double amount) {
        this.balance = amount + balance;
        return this;
    }

    public Account withdraw(double amount) {
        if (balance >= amount) {
            this.balance = balance- amount;
        } else {
            System.out.println("amount withdrawn exceeds the current balance!");
        }
        return this;
    }
}
