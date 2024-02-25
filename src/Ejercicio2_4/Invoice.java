package Ejercicio2_4;

public class Invoice {
    private int id;
    private Customer customer;
    private double amount;

    public Invoice(int id, Customer name, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public int getCustomerId() {
        return this.customer.getId();
    }
    public String getCustomerName() {
        return this.customer.getName();
    }
    public int getCustomerDiscount() {
        return this.customer.getDiscount();
    }
    public double getAmountAfterDiscount(){
        int descuento=getCustomerDiscount();
        double porcent= amount*(descuento/100);
        double amountafter=amount-porcent;
        return amountafter;
    }
    @Override
    public String toString() {
        return "Invoice[" + "id=" + id + ", customer=" + customer + ", amount=" + amount + "%" + ']';
    }
}