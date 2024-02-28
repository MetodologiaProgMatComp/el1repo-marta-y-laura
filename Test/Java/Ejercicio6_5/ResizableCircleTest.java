package Ejercicio6_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResizableCircleTest {
    ResizableCircle rc= new ResizableCircle(2);

    @Test
    void testToString() {
        String salidaEsperada= "ResizableCircle{radius=2.0}";
        assertEquals(salidaEsperada,rc.toString(),"No sale el mismo texto en toString");
    }

    @Test
    void resize() {
        rc.resize(10);
        assertEquals("ResizableCircle{radius=0.2}", rc.toString(), "El radio no es el esperado.");
    }
}