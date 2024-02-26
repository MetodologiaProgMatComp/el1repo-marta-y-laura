package Ejercicio3_6;

public class Main3_6 {
    public static void main(String[] args) {
        Animal a = new Animal("Girafa");
        Mammal m = new Mammal("Ciervo");
        Cat c = new Cat("Whiskers");
        Dog d = new Dog("Bone");
        Dog d2 = new Dog("Blanco");
        System.out.println(a);
        System.out.println(m);
        System.out.println(c);
        c.greets();
        System.out.println(d);
        d.greets();
        d.greets(d2);
    }
}
