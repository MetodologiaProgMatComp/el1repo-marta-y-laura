package Ejercicio1_3;

import Ejercicio1.Circle;
import Ejercicio1_2.Circle2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Rectangle r= new Rectangle(4,2);
    @Test
    void probarConstructoresRectangle() {
        Rectangle r= new Rectangle(4,2);
        assertNotNull(r);
    }

    @Test
    void getLength() {
        float len = r.getLength();
        assertEquals(len, 4);
        assertTrue((len > 0), "Error, es menor o igual a 0");
    }

    @Test
    void setLength() {
        r.setLength(3);
        assertEquals(r.getLength(), 3, "El largo no ha cambiado.");
    }

    @Test
    void getWidth() {
        float wid = r.getWidth();
        assertEquals(wid, 2);
        assertTrue((wid > 0), "Error, es menor o igual a 0");
    }

    @Test
    void setWidth() {
        r.setWidth(1);
        assertEquals(r.getWidth(), 1, "El ancho no ha cambiado.");

    }

    @Test
    void getArea() {
        float l = r.getLength();
        float w = r.getWidth();
        double area = l * w;
        assertEquals(area,r.getArea(), "El area no es la esperada.");
    }

    @Test
    void getPerimeter() {
        float l = r.getLength();
        float w = r.getWidth();
        double perimeter = 2*l + 2*w;
        assertEquals(perimeter,r.getPerimeter());
    }

    @Test
    void testToString() {
        float leng = 3;
        float wid =2;
        r.setLength(leng);
        r.setWidth(wid);
        String salidaEsperada= "[length = 3.0, width = 2.0]";
        assertEquals(salidaEsperada,r.toString(),"No sale el mismo texto en toString");
    }
}