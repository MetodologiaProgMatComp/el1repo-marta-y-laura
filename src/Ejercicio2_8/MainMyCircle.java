package Ejercicio2_8;
import Ejercicio2_6.*;

public class MainMyCircle {
    public static void main(String[] args) {
        MyCircle ci = new MyCircle(3,4,1);
        MyPoint center = new MyPoint(3,4);
        MyCircle ci2 = new MyCircle(center, 3);
        System.out.println(ci);
        ci.setRadius(3); // Test setters
        ci.setCenter(center);
        ci.setCenterX(2);
        ci.setCenterY(3);
        System.out.println("El radio es es: " + ci.getRadius());
        System.out.println("El centro es es: " + ci.getCenter());
        System.out.println("x del centro es: " + ci.getCenterX());
        System.out.println("y del centro es: " + ci.getCenterY());
        System.out.println("El area es: " + ci.getArea());
        System.out.println("La circunferencia mide: " + ci.getCircumference());
        ci.setCenterXY(3, 0); // Test setXY()
        System.out.println(ci.getCenterXY()[0]); // Test getXY()
        System.out.println(ci.getCenterXY()[1]);
        System.out.println(ci);
        //methods distance()
        System.out.println(ci.distance(ci2));
    }
}
