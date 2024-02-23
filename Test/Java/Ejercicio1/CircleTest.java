package Ejercicio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Circle c = new Circle(1, "rojo");

    @Test
    void probarConstructoresCircle() {

        Circle c1 = new Circle();
        Circle c2 = new Circle(1);
        Circle c3 = new Circle(1, "rojo");

        assertNotNull(c1);
        assertNotNull(c2);
        assertNotNull(c3);
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
    void ToString() {
        double radius = c.getRadius();
        String color = c.getColor();
        assertEquals("[radius= "+radius+", color= "+color+"]", "[radius= 1, color= rojo ]");
    }

    @Test
    void getArea() {
        double area = c.getArea();
        double rdo = c.getRadius();
        assertNotEquals(area, 0L);
        assertEquals(area, rdo * rdo * Math.PI, "El area no es la que debería.");
    }
}