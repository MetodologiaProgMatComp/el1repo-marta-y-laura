package Ejercicio3_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {
    Point p = new Point(3, 5);

    void constructor() {
        Point p = new Point(3, 5);
        assertNotNull(p);
    }

    @Test
    void testToString() {
        constructor();
        assertEquals(p.toString(), "Point: (3,5)", "No se ha obtenido la salida esperada.");
    }

    @Test
    void getX() {
        assertEquals(p.getX(), 3, "No se ha obtenido la coordenada x esperada.");
    }

    @Test
    void getY() {
        assertEquals(p.getY(), 5, "No se ha obtenido la coordenada y esperada.");
    }

    @Test
    void setX() {
        p.setX(5);
        assertEquals(p.getX(), 5, "No se ha obtenido la coordenada x esperada.");
    }

    @Test
    void setY() {
        p.setY(7);
        assertEquals(p.getY(), 7, "No se ha obtenido la coordenada y esperada.");

    }

    @Test
    void setXY() {
        p.setXY(4, 8);
        assertEquals(p.getY(), 8, "No se ha obtenido la coordenada y esperada.");
        assertEquals(p.getX(), 4, "No se ha obtenido la coordenada x esperada.");
    }

    @Test
    void getXY() {
        p.setX(4);
        p.setY(2);
        assertEquals(p.getXY()[0], 4);
        assertEquals(p.getXY()[1], 2);
    }

    @Test
    void testDistance() {
        p.setXY(4, 5);
        Point s = new Point(8, 8);
        assertEquals(p.distance(s), 5, "La distancia no está bien calculada.");
    }
}