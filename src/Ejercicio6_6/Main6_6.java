package Ejercicio6_6;

public class Main6_6 {
    public static void main(String[]args){
        Cat c= new Cat();
        Dog d= new Dog();
        Dog d2= new Dog();
        BigDog bd= new BigDog();
        BigDog bd2= new BigDog();
        c.greets();
        d.greets();
        d.greets(d2);
        bd.greets();
        bd.greets(d);
        bd.greets(bd2);
    }
}
