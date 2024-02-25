package Ejercicio3_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    Square s = new Square(4, "blue", true);
    void constructores(){
        Square s3 = new Square();
        Square s2 = new Square(3);
        Square s = new Square(4, "blue", true);
        assertNotNull(s);
        assertNotNull(s2);
        assertNotNull(s3);
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
        String salidaEsperada= "Square[Rectangle[Shape[color="+s.getColor()+", filled="+s.isFilled()+"], width="+s.getWidth()+", length="+s.getLength()+"]]";
        assertEquals(salidaEsperada,s.toString(),"No sale el mismo texto en toString");
    }

}