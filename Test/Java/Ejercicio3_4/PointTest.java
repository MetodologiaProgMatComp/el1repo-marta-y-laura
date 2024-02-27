package Ejercicio3_4;

import Ejercicio3_3.Point2D;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {
    Point p= new Point(2, 1);

    @Test
    void getX() {
        float x = p.getX();
        assertEquals(2, x, "x no es el esperado.");
    }

    @Test
    void setX() {
        p.setX(4);
        assertEquals(4,p.getX(),"x no ha cambiado.");
    }

    @Test
    void getY() {
        float y = p.getY();
        assertEquals(1, y, "y no es el esperado.");
    }

    @Test
    void setY() {
        p.setY(8);
        assertEquals(8,p.getY(),"y no ha cambiado.");
    }

    @Test
    void setXY() {
        p.setXY(4,8);
        assertEquals(p.getX(), 4, "no cambia");
        assertEquals(p.getY(), 8, "no cambia");
    }

    @Test
    void getXY() {
        p.setX(4);
        p.setY(8);
        assertEquals(p.getXY()[0], 4);
        assertEquals(p.getXY()[1], 8);
    }

    @Test
    void testToString() {
        float x = 2;
        float y = 1;
        p.setX(x);
        p.setY(y);
        String salidaEsperada= "Point{x=2.0, y=1.0}";
        assertEquals(salidaEsperada,p.toString(),"No sale el mismo texto en toString");
    }
}