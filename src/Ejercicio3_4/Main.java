package Ejercicio3_4;

public class Main {
    public static void main(String[] args) {
        MovablePoint mv = new MovablePoint(2, 1, 2, 1);
        System.out.println(mv.getX());
        System.out.println(mv.getY());
        System.out.println(mv.getXY());
        System.out.println(mv.getSpeed());
        System.out.println(mv.getxSpeed());
        System.out.println(mv.getySpeed());
        mv.setSpeed(4, 5);
        mv.setxSpeed(4);
        mv.setySpeed(8);
        mv.setX(4);
        mv.setY(8);
        mv.setXY(4, 8);
        System.out.println(mv.getX());
        System.out.println(mv.getY());
        System.out.println(mv.getXY());
        System.out.println(mv.getSpeed());
        System.out.println(mv.getxSpeed());
        System.out.println(mv.getySpeed());
        Point p = new Point(4, 5);
        System.out.println(p.getX());
        System.out.println(p.getY());
        System.out.println(p.getXY());
        p.setX(4);
        p.setXY(4, 8);
        p.setY(8);
        System.out.println(p.getX());
        System.out.println(p.getY());
        System.out.println(p.getXY());

    }
}


