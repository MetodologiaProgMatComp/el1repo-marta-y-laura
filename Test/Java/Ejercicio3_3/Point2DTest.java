package Ejercicio3_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point2DTest {
    Point2D p2= new Point2D(2, 1);

    @Test
    void getX() {
        float x = p2.getX();
        assertEquals(2, x, "x no es el esperado.");
    }

    @Test
    void setX() {
        p2.setX(4);
        assertEquals(4,p2.getX(),"x no ha cambiado.");

    }

    @Test
    void getY() {
        float y = p2.getY();
        assertEquals(1, y, "y no es el esperado.");
    }

    @Test
    void setY() {
        p2.setY(8);
        assertEquals(8,p2.getY(),"y no ha cambiado.");
    }

    @Test
    void setXY() {
        p2.setXY(4,8);
        assertEquals(p2.getX(), 4, "no cambia");
        assertEquals(p2.getY(), 8, "no cambia");


    }

    @Test
    void getXY() {
        p2.setX(4);
        p2.setY(8);
        assertEquals(p2.getXY()[0], 4);
        assertEquals(p2.getXY()[1], 8);
    }

    @Test
    void testToString() {
        float x = 2;
        float y = 1;
        p2.setX(x);
        p2.setY(y);
        String salidaEsperada= "Point2D{x=2.0, y=1.0}";
        assertEquals(salidaEsperada,p2.toString(),"No sale el mismo texto en toString");
    }
}