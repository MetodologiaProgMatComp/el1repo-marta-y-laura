package Ejercicio6_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovablePointTest {
    MovablePoint p = new MovablePoint(2, 5, 3, 8);
    @Test
    void constructor(){
        assertNotNull(p);
    }
    @Test
    void testToString() {
        String salidaEsperada= "(2,5) speed=(3,8)";
        assertEquals(salidaEsperada,p.toString(),"No sale el mismo texto en toString");
    }
    @Test
    void getX() {
        assertEquals(2, p.getX(), "No se ha obtenido el valor esperado.");
    }

    @Test
    void getY() {
        assertEquals(5, p.getY(), "No se ha obtenido el valor esperado.");
    }
    @Test
    void moveUp() {
        p.moveUp();
        assertEquals(-3, p.getY(), "No se ha movido");
    }

    @Test
    void moveDown() {
        p.moveDown();
        assertEquals(13, p.getY(), "No se ha movido");
    }

    @Test
    void moveLeft() {
        p.moveLeft();
        assertEquals(-1, p.getX(), "No se ha movido");
    }

    @Test
    void moveRight() {
        p.moveRight();
        assertEquals(5, p.getX(), "No se ha movido");
    }
}