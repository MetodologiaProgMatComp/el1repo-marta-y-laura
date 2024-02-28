package Ejercicio3_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovablePointTest {
    MovablePoint mp= new MovablePoint(2,1,2, 1);
    MovablePoint mp2 = new MovablePoint(2, 1);
    @Test
    void constructor(){
        assertNotNull(mp);
        assertNotNull(mp2);
    }
    @Test
    void getxSpeed() {
        float xSpeed = mp.getxSpeed();
        assertEquals(2, xSpeed, "xSpeed no es el esperado.");
    }

    @Test
    void setxSpeed() {
        mp.setxSpeed(4);
        assertEquals(4,mp.getxSpeed(),"xSpped no ha cambiado.");
    }

    @Test
    void getySpeed() {
        float ySpeed = mp.getySpeed();
        assertEquals(1, ySpeed, "ySpeed no es el esperado.");
    }

    @Test
    void setySpeed() {
        mp.setySpeed(8);
        assertEquals(8,mp.getySpeed(),"ySpped no ha cambiado.");
    }

    @Test
    void setSpeed() {
        mp.setSpeed(4,8);
        assertEquals(mp.getxSpeed(), 4, "no cambia");
        assertEquals(mp.getySpeed(), 8, "no cambia");
    }

    @Test
    void getSpeed() {
        mp.setxSpeed(4);
        mp.setySpeed(8);
        assertEquals(mp.getSpeed()[0], 4);
        assertEquals(mp.getSpeed()[1], 8);
    }

    @Test
    void testToString() {
        float xSpeed = 2;
        float ySpeed = 1;
        mp.setX(xSpeed);
        mp.setY(ySpeed);
        String salidaEsperada= "MovablePoint{xSpeed=2.0, ySpeed=1.0}";
        assertEquals(salidaEsperada,mp.toString(),"No sale el mismo texto en toString");
    }

    @Test
    void move() {
        assertDoesNotThrow(()->mp.move());
        assertEquals(4, mp.getX());
        assertEquals(2,mp.getY());

    }
}