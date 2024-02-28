package Ejercicio3_6;

public class Dog extends Mammal{
    public Dog(String name) {
        super(name);
    }
    public String greets(){
        return "Woof";
    }
    public String greets(Dog another){
        return "Woooof" ;
    }
    public String toString() {
        return "Dog["+super.toString()+"]";
    }
}
