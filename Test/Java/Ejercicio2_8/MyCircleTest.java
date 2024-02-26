package Ejercicio2_8;
import Ejercicio2_6.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCircleTest {
    MyPoint ce= new MyPoint(2,2);
    MyCircle ci= new MyCircle(ce,4);
    @Test
    void getRadius() {
        int x = ci.getRadius();
        assertEquals(x, 4);
        assertTrue((x > 0), "Error, es menor o igual a 0");
    }

    @Test
    void setRadius() {
        ci.setRadius(2);
        assertEquals(ci.getRadius(), 2, "El radio no ha cambiado.");
    }

    @Test
    void getCenter() {
        MyPoint center = ci.getCenter();
        assertEquals(center, ce, "No se ha obtenido el dato esperado");
    }

    @Test
    void setCenter() {
        MyPoint cent= new MyPoint(3,2);
        ci.setCenter(cent);
        assertEquals(ci.getCenter(), cent, "El centro no ha cambiado.");
    }

    @Test
    void getCenterX() {
        MyPoint ce= new MyPoint(2,2);
        MyCircle ci= new MyCircle(ce,4);
        int x = ci.getCenterX();
        assertEquals(x, 2, "No se ha obtenido el dato esperado");
    }

    @Test
    void setCenterX() {
        ci.setCenterX(3);
        assertEquals(ci.getCenterX(), 3, "La coordenada x no ha cambiado.");
    }

    @Test
    void getCenterY() {
        MyPoint ce= new MyPoint(2,2);
        MyCircle ci= new MyCircle(ce,4);
        int y = ci.getCenterY();
        assertEquals(y, 2, "No se ha obtenido el dato esperado");
    }

    @Test
    void setCenterY() {
        ci.setCenterY(4);
        assertEquals(ci.getCenterY(), 4, "La coordenada y no ha cambiado.");
    }

    @Test
    void getCenterXY() {
        MyPoint ce= new MyPoint(2,2);
        MyCircle ci= new MyCircle(ce,4);
        assertEquals(ci.getCenterXY()[0], 2);
        assertEquals(ci.getCenterXY()[1], 2);
    }

    @Test
    void setCenterXY() {
        ci.setCenterXY(3,4);
        assertEquals(ci.getCenterY(), 4, "La coordenada y del centro no ha cambiado.");
        assertEquals(ci.getCenterX(), 3, "La coordenada x del centro no ha cambiado.");
    }

    @Test
    void testToString() {
        MyPoint ce= new MyPoint(2,2);
        MyCircle ci= new MyCircle(ce,4);
        String salidaEsperada= "MyCircle[radius = 4, center = (2,2)]";
        assertEquals(ci.toString(),salidaEsperada,"No sale el mismo texto en toString");
    }

    @Test
    void getArea() {
        MyPoint ce= new MyPoint(2,2);
        MyCircle ci= new MyCircle(ce,4);
        assertEquals(ci.getArea(),  16*Math.PI, "El area no es el esperado.");
    }

    @Test
    void getCircumference() {
        MyPoint ce= new MyPoint(2,2);
        MyCircle ci= new MyCircle(ce,4);
        assertEquals(ci.getCircumference(),  8*Math.PI, "La circunferencia no es la esperada.");
    }

    @Test
    void distance() {
        MyPoint ce= new MyPoint(2,2);
        MyCircle ci= new MyCircle(ce,4);
        MyCircle ci2= new MyCircle(ce,4);
        assertEquals(ci.distance(ci2),  Math.sqrt(45), "La circunferencia no es la esperada.");
    }
}