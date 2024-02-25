package Ejercicio2_9;
import Ejercicio2_6.*;

public class MainMyTriangle {
    public static void main(String[] args) {
        MyPoint v1 = new MyPoint(1,1);
        MyPoint v2 = new MyPoint(5,4);
        MyPoint v3 = new MyPoint(8,7);
        MyTriangle tri = new MyTriangle(v1,v2,v3);
        System.out.println(tri);
        System.out.println(tri.getPerimeter());
        System.out.println(tri.getType());
    }
}
