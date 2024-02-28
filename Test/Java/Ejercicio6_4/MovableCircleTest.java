package Ejercicio6_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovableCircleTest {

    MovableCircle mc= new MovableCircle(2, 1,2,1, 2);
    @Test
    void testToString() {
        String salidaEsperada= "(0,0) speed=(0,0) radius=(2)";
        assertEquals(salidaEsperada,mc.toString(),"No sale el mismo texto en toString");
    }

    @Test
    void getX() {

        int x = mc.getX();
        assertEquals(2, x, "x no es el esperado.");
    }

    @Test
    void getY() {
        int y = mc.getY();
        assertEquals(1, y, "y no es el esperado.");
    }

    @Test
    void moveUp() {
        mc.moveUp();
        assertEquals(0, mc.getY(), "No se ha movido");
    }

    @Test
    void moveDown() {
        mc.moveDown();
        assertEquals(0, mc.getY(), "No se ha movido");
    }

    @Test
    void moveLeft() {
        mc.moveLeft();
        assertEquals(0, mc.getX(), "No se ha movido");
    }

    @Test
    void moveRight() {
        mc.moveRight();
        assertEquals(0, mc.getX(), "No se ha movido");
    }
}