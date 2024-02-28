package Ejercicio3_1;
import Ejercicio2_4.Customer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Circle c= new Circle (2, "azul");
    @Test
    void probarConstructoresCircle() {

        Ejercicio1.Circle c1 = new Ejercicio1.Circle();
        Ejercicio1.Circle c2 = new Ejercicio1.Circle(1);
        Ejercicio1.Circle c3 = new Ejercicio1.Circle(1, "azul");

        assertNotNull(c1);
        assertNotNull(c2);
        assertNotNull(c3);
    }

    @Test
    void getRadius() {
        double radius = c.getRadius();
        assertEquals(2, radius, "El radio no es el esperado.");
    }

    @Test
    void setRadius() {
        c.setRadius(23);
        assertEquals(c.getRadius(), 23, "Radio no ha cambiado.");

    }

    @Test
    void getColor() {
        String color = c.getColor();
        assertEquals("azul", color, "El radio no es el esperado.");
    }

    @Test
    void setColor() {
        c.setColor("rojo");
        assertEquals(c.getColor(),"rojo","La cantidad no ha cambiado.");
    }

    @Test
    void getArea() {
        double area = c.getArea();
        assertEquals(12.566370614359172, area, "El area no es el esperado.");
    }

    @Test
    void testToString() {
        double radio = 2;
        String color = "azul";
        c.setRadius(radio);
        c.setColor(color);
        String salidaEsperada= "Circle{radius=2.0, color='azul}";
        assertEquals(salidaEsperada,c.toString(),"No sale el mismo texto en toString");
    }
}