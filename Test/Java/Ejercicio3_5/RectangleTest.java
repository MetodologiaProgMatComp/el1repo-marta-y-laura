package Ejercicio3_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Rectangle r= new Rectangle(4,2, "blue", true);
    Rectangle r2 = new Rectangle();
    Rectangle r3 = new Rectangle(2,3);
    @Test
    void constructors(){
        assertNotNull(r);
        assertNotNull(r2);
        assertNotNull(r3);
    }
    @Test
    void getLength() {
        double len = r.getLength();
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
        double wid = r.getWidth();
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
        double l = r.getLength();
        double w = r.getWidth();
        double area = l * w;
        assertEquals(area,r.getArea(), "El area no es la esperada.");
    }

    @Test
    void getPerimeter() {
        double l = r.getLength();
        double w = r.getWidth();
        double perimeter = 2*l + 2*w;
        assertEquals(perimeter,r.getPerimeter());
    }

    @Test
    void testToString() {
        double leng = 3;
        double wid =2;
        String color = r.getColor();
        r.setLength(leng);
        r.setWidth(wid);
        String salidaEsperada=  "Rectangle[Shape[color="+color+", width="+wid+", length="+leng+"]";
        assertEquals(salidaEsperada,r.toString(),"No sale el mismo texto en toString");
    }

}