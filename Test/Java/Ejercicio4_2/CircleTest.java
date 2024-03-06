package Ejercicio4_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Circle c = new Circle(1, "rojo");
    @Test
    void probarConstructoreCircle() {
        Circle c = new Circle(1, "rojo");
        assertNotNull(c);
    }

    @Test
    void getRadius() {
        double rdo = c.getRadius();
        assertNotEquals(rdo, 0L);
        assertTrue((rdo > 0), "Error, es menor o igual a 0");

    }

    @Test
    void getColor() {
        String color = c.getColor();
        assertEquals("rojo", color, "El color no es el esperado.");
    }

    @Test
    void setRadius() {
        c.setRadius(6.9);
        assertEquals(c.getRadius(), 6.9, "El radio no ha cambiado.");
    }

    @Test
    void setColor() {
        c.setColor("azul");
        assertEquals(c.getColor(), "azul", "El color no ha cambiado.");
    }

    @Test
    void testToString() {
        assertEquals( "[radius=1.0, color=rojo]",c.toString());
    }

    @Test
    void getArea() {
        double area = c.getArea();
        double rdo = c.getRadius();
        assertNotEquals(area, 0L);
        assertEquals(area, rdo * rdo * Math.PI, "El area no es la que debería.");
    }
}