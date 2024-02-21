package Ejercicio1_6;

public class Acount {
    private String id;
    private String name;
    private int balance;


    public Acount(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public Acount(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
    public int credit(int amount){
        this.balance=balance+amount;
        return balance;
    }
    public int transferTo (Acount another, int amount){
        if (amount<=balance) {
            another.balance = another.balance + amount;
            this.balance = balance - amount;
        }
        else{
            System.out.println("Amount excedeed balance");
        }
        return balance;
    }
    public String toString(){
        return "Account[id=" + id + ", name=" + name + ", balance="+ balance+"]";
    }

}
