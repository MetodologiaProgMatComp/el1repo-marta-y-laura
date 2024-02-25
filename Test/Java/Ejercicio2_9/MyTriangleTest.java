package Ejercicio2_9;

import Ejercicio2_6.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyTriangleTest {
    MyTriangle tri = new MyTriangle(1,1,2,3,5,6);
    MyPoint v1 = new MyPoint(1,1);
    MyPoint v2 = new MyPoint(2,3);
    MyPoint v3 = new MyPoint(5,6);
    @Test
    void testToString() {
        int x1 = v1.getX();
        int x2 = v2.getX();
        int y2 = v2.getY();
        int x3 = v3.getX();
        int y3 = v3.getY();
        String salidaEsperada= "MyTriangle[v1=("+x1+",3), v2=("+x2+","+y2+"), v3=("+x3+","+y3+")]";
        assertEquals(tri.toString(),salidaEsperada,"No sale el mismo texto en toString");
    }

    @Test
    void getPerimeter() {
        assertTrue(tri.getPerimeter()>0, "El perimetro esta dando negativo");
        assertEquals(tri.getPerimeter(),v1.distance(v2)+v1.distance(v3)+v2.distance(v3),"No sale el mismo texto en toString");
    }

    @Test
    void getType() {
        MyPoint v1 = new MyPoint(1,1);
        MyPoint v2 = new MyPoint(2,3);
        MyPoint v3 = new MyPoint(5,6);
        MyTriangle tri = new MyTriangle(v1,v2,v3);
        assertEquals(tri.getType(),"Scalene","No es la respuesta esperada.");
        MyPoint v11 = new MyPoint(1,1);
        MyPoint v22 = new MyPoint(2,3);
        MyPoint v33 = new MyPoint(3,2);
        MyTriangle tri2 = new MyTriangle(v11,v22,v33);
        assertEquals(tri2.getType(),"Isosceles","No es la respuesta esperada.");
        MyPoint v111 = new MyPoint(0,0);
        MyPoint v222 = new MyPoint(0,0);
        MyPoint v333 = new MyPoint(0,0);
        MyTriangle tri3 = new MyTriangle(v111,v222,v333);
        assertEquals("Equilateral",tri3.getType(),"No es la respuesta esperada.");
    }
}