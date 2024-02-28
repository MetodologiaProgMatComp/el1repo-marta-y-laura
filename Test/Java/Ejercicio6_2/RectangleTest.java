package Ejercicio6_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Rectangle r = new Rectangle(2,5);
    @Test
    void constructors(){
        assertNotNull(r);
    }

    @Test
    void getArea() {
        assertTrue(r.getArea()>0);
        assertEquals(10, r.getArea());
    }

    @Test
    void getPerimeter() {
        assertTrue(r.getPerimeter()>0);
        assertEquals(14, r.getPerimeter());
    }

    @Test
    void testToString() {
        String salidaEsperada=  "Rectangle[width="+5+", length="+2+"]";
        assertEquals(salidaEsperada,r.toString(),"No sale el mismo texto en toString");
    }
}