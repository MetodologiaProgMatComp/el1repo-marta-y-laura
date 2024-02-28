package Ejercicio6_6;

public class Dog extends Animal {
    private String name;
    public String greets(){
        return "Woof";
    }
    public String greets(Dog another){
        return "Woooooof";
    }

}
