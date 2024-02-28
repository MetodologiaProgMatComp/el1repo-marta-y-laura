package Ejercicio6_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    Shape s2 = new Square(5, "blue", true);
    Square s = new Square(4, "red", true);
    @Test
    void constructors(){
        Square s3 = new Square();
        Square s4 = new Square(3);
        assertNotNull(s);
        assertNotNull(s2);
        assertNotNull(s3);
        assertNotNull(s4);
    }
    @Test
    void getColor(){
        assertEquals(s2.getColor(), "blue", "El color obtenido no es el esperado.");
    }
    @Test
    void setColor(){
        s2.setColor("red");
        assertEquals(s2.getColor(), "red", "El color no ha cambiado.");
    }
    @Test
    void isFilled() {
        assertTrue(s2.isFilled(), "No se ha obtenido el dato esperado.");
    }

    @Test
    void setFilled() {
        s2.setFilled(false);
        assertFalse(s2.isFilled(), "No se ha obtenido el dato esperado.");
        s2.setFilled(true);
        assertTrue(s2.isFilled(), "No se ha obtenido el dato esperado.");

    }
    @Test
    void getSide() {
        double side = s.getSide();
        assertEquals(side, 4);
        assertTrue((side > 0), "Error, es menor o igual a 0");
    }

    @Test
    void setSide() {
        s.setSide(3);
        assertEquals(s.getSide(), 3, "El largo no ha cambiado.");
    }

    @Test
    void setWidth() {
        s.setWidth(1);
        assertEquals(s.getWidth(), 1, "El ancho no ha cambiado.");
    }

    @Test
    void setLength() {
        s.setLength(1);
        assertEquals(s.getLength(), 1, "El ancho no ha cambiado.");
    }

    @Test
    void testToString() {
        s.setSide(3);
        String salidaEsperada= "Square[Rectangle[Shape[color="+s.getColor()+", width="+s.getWidth()+", length="+s.getLength()+"]]";
        assertEquals(salidaEsperada,s.toString(),"No sale el mismo texto en toString");
    }
}