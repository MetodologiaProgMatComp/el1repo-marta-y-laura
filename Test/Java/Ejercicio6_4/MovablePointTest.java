package Ejercicio6_4;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovablePointTest {
   MovablePoint mp= new MovablePoint(2, 5,3,8);
    @Test
    void testToString() {
        String salidaEsperada= "(2,5) speed=(3,8)";
        assertEquals(salidaEsperada,mp.toString(),"No sale el mismo texto en toString");
    }
    @Test
    void getX() {
        assertEquals(2, mp.getX(), "No se ha obtenido el valor esperado.");
    }

    @Test
    void getY() {
        assertEquals(5, mp.getY(), "No se ha obtenido el valor esperado.");
    }
    @Test
    void moveUp() {
        mp.moveUp();
        assertEquals(-3, mp.getY(), "No se ha movido");
    }

    @Test
    void moveDown() {
        mp.moveDown();
        assertEquals(13, mp.getY(), "No se ha movido");
    }

    @Test
    void moveLeft() {
        mp.moveLeft();
        assertEquals(-1, mp.getX(), "No se ha movido");
    }

    @Test
    void moveRight() {
        mp.moveRight();
        assertEquals(5, mp.getX(), "No se ha movido");
    }
}
