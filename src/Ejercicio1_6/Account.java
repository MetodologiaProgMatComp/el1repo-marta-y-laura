package Ejercicio1_6;

public class Account {
    private String id;
    private String name;
    private int balance;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }


    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int credit(int amount){
        this.balance=balance+amount;
        return balance;
    }
    public int debit(int amount){
        if (amount<=balance) {
            this.balance = balance - amount;
        }
        else{
            System.out.println("Amount excedeed balance");
        }
        return balance;
    }

    public int transferTo (Account another, int amount){
        if (amount<=balance) {
            int aux = another.getBalance()+amount;
            another.setBalance(aux);
            this.balance-=amount;
        }
        else{
            System.out.println("Amount excedeed balance");
        }
        return balance;
    }

    public String toString(){
        return "Account[id = "+id+", name = "+name+", balance = "+balance+"]";
    }

}
