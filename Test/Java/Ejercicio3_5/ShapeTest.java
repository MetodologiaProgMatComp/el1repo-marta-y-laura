package Ejercicio3_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {
    Shape s= new Shape("red", true);
    @Test
    void getColor() {
        assertEquals(s.getColor(), "red", "El color obtenido no es el esperado.");
    }

    @Test
    void setColor() {
        s.setColor("blue");
        assertEquals(s.getColor(), "blue", "El color no ha cambiado.");
    }

    @Test
    void isFilled() {
        assertTrue(s.isFilled(), "No se ha obtenido el dato esperado.");
    }

    @Test
    void setFilled() {
        s.setFilled(false);
        assertFalse(s.isFilled(), "No se ha obtenido el dato esperado.");
    }

    @Test
    void testToString() {
        Shape s= new Shape("red", true);
        String salidaEsperada= "Shape[color=red, filled=true]";
        assertEquals(s.toString(),salidaEsperada,"No sale el mismo texto en toString");
    }
}