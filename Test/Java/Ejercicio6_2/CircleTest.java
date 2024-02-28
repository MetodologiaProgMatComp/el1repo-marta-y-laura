package Ejercicio6_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Circle c = new Circle(4);
    @Test
    void constructors(){
        assertNotNull(c);
    }
    @Test
    void testToString() {
        String salidaEsperada= "[radius=4.0]";
        assertEquals(salidaEsperada,c.toString(),"No sale el mismo texto en toString");
    }

    @Test
    void getArea() {
        assertTrue(c.getArea()>0);
        assertEquals(16*Math.PI, c.getArea());
    }

    @Test
    void getPerimeter() {
        assertTrue(c.getPerimeter()>0);
        assertEquals(8*Math.PI, c.getPerimeter());
    }
}