package Ejercicio6_3;

public class Main6_3 {
    public static void main(String[] args) {
        Movable p = (Movable) new MovablePoint(2, 5, 3, 8);
        System.out.println(p);
        p.moveUp();
        System.out.println(p);
        p.moveDown();
        System.out.println(p);
        p.moveLeft();
        System.out.println(p);
        p.moveRight();
        System.out.println(p);
    }
}
