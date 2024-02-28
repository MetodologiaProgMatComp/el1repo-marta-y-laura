package Ejercicio6_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Shape r3 = new Rectangle();
    Shape r2 = new Rectangle(3,4);
    Shape r = new Rectangle(2,6, "blue", true);
    Rectangle r4 = new Rectangle(2,6, "blue", true);
    @Test
    void constructor(){
        assertNotNull(r);
        assertNotNull(r2);
        assertNotNull(r3);
        assertNotNull(r4);
    }
    @Test
    void getColor(){
        assertEquals(r.getColor(), "blue", "El color obtenido no es el esperado.");
    }
    @Test
    void setColor(){
        r.setColor("red");
        assertEquals(r.getColor(), "red", "El color no ha cambiado.");
    }
    @Test
    void isFilled() {
        assertTrue(r.isFilled(), "No se ha obtenido el dato esperado.");
    }

    @Test
    void setFilled() {
        r.setFilled(false);
        assertFalse(r.isFilled(), "No se ha obtenido el dato esperado.");
        r.setFilled(true);
        assertTrue(r.isFilled(), "No se ha obtenido el dato esperado.");

    }

    @Test
    void getLength() {
        double len = r4.getLength();
        assertEquals(len, 2);
        assertTrue((len > 0), "Error, es menor o igual a 0");

    }

    @Test
    void setLength() {
        r4.setLength(5);
        assertEquals(5, r4.getLength(), "El largo no ha cambiado.");
    }

    @Test
    void getWidth() {
        double wid = r4.getWidth();
        assertEquals(wid,6);
        assertTrue((wid > 0), "Error, es menor o igual a 0");
    }

    @Test
    void setWidth() {
        r4.setWidth(7);
        assertEquals(7, r4.getWidth(), "El ancho no ha cambiado.");
    }

    @Test
    void getArea() {
        Rectangle r4 = new Rectangle(2,6, "blue", true);
        double area = r4.getArea();
        assertEquals(area,12);
        assertTrue((area > 0), "Error, es menor o igual a 0");
    }

    @Test
    void getPerimeter() {
        double l = r4.getLength();
        double w = r4.getWidth();
        double perimeter = 2*l + 2*w;
        assertEquals(perimeter,r.getPerimeter(), "El ");
    }

    @Test
    void testToString() {
        double leng = 3;
        double wid =2;
        String color = r.getColor();
        r4.setLength(leng);
        r4.setWidth(wid);
        String salidaEsperada=  "Rectangle[Shape[color="+color+", width="+wid+", length="+leng+"]";
        assertEquals(salidaEsperada,r4.toString(),"No sale el mismo texto en toString");
    }
}