package Ejercicio2_7;
import Ejercicio2_6.*;
public class MainMyLine {
    public static void main(String[] args) {
        MyLine li = new MyLine(1,1,8,9);
        MyPoint b = new MyPoint(3,4);
        MyPoint e = new MyPoint(7,8);
        System.out.println(li);
        li.setBegin(b); // Test setters
        li.setEnd(e);
        li.setBeginX(2);
        li.setBeginY(3);
        li.setEndX(7);
        li.setEndY(9);
        System.out.println("El punto de inicio es: " + li.getBegin()); // Test getters
        System.out.println("El punto donde acaba es: " + li.getEnd());
        System.out.println("x del punto de inicio es: " + li.getBeginX());
        System.out.println("y del punto de inicio es: " + li.getBeginY());
        System.out.println("x del punto donde acaba es: " + li.getEndX());
        System.out.println("y del punto donde acaba es: " + li.getEndY());
        li.setBeginXY(3, 0); // Test setXY()
        li.setEndXY(8, 9);
        System.out.println(li.getBeginXY()[0]); // Test getXY()
        System.out.println(li.getBeginXY()[1]);
        System.out.println(li.getEndXY()[0]); // Test getXY()
        System.out.println(li.getEndXY()[1]);
        System.out.println(li);
        //methods distance()
        System.out.println(li.getLength());
        System.out.println(li.getGradient());
    }
}
