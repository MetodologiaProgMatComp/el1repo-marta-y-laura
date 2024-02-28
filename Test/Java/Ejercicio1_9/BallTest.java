package Ejercicio1_9;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BallTest {
    Ball b= new Ball(4,2, 5, 1,1);
    @Test
    void probarConstructoresBall() {
        Ball b= new Ball(4,2, 5, 1,1);
        assertNotNull(b);
    }

    @Test
    void getX() {
        float x = b.getX();
        assertEquals(x, 4);
        assertTrue((x > 0), "Error, es menor o igual a 0");
    }

    @Test
    void getY() {
        float y = b.getY();
        assertEquals(y, 2);
        assertTrue((y > 0), "Error, es menor o igual a 0");
    }

    @Test
    void getRadius() {
        int rad = b.getRadius();
        assertEquals(rad, 5);
        assertTrue((rad > 0), "Error, es menor o igual a 0");
    }

    @Test
    void getXDelta() {
        float xDel = b.getXDelta();
        assertEquals(xDel, 1);
    }

    @Test
    void getYDelta() {
        float yDel = b.getYDelta();
        assertEquals(yDel, 1);
    }

    @Test
    void setX() {
        b.setX(8);
        assertEquals(b.getX(), 8, "La coordenada x no ha cambiado.");
    }

    @Test
    void setY() {
        b.setY(4);
        assertEquals(b.getY(), 4, "La coordenada y no ha cambiado.");
    }

    @Test
    void setRadius() {
        b.setRadius(10);
        assertEquals(b.getRadius(), 10, "El radio no ha cambiado.");
    }

    @Test
    void setXDelta() {
        b.setXDelta(2);
        assertEquals(b.getXDelta(), 2, "El delta x no ha cambiado.");
    }

    @Test
    void setYDelta() {
        b.setYDelta(2);
        assertEquals(b.getYDelta(), 2, "El delta y no ha cambiado.");
    }

    @Test
    void move() {
        b.setX(4);
        b.setY(2);
        b.setXDelta(1);
        b.setYDelta(1);
        b.move();
        assertEquals(b.getX(), 5, "La coordenada x no se ha movido");
        assertEquals(b.getY(), 3, "La coordenada y no se ha movido");
    }

    @Test
    void reflectHorizontal() {
        float xD = b.getXDelta();
        b.reflectHorizontal();
        assertEquals(b.getXDelta() , -xD, "Delta x no se ha modificado");

    }

    @Test
    void reflectVertical() {
        float yD = b.getYDelta();
        b.reflectVertical();
        assertEquals(b.getYDelta() , -yD, "Delta y no se ha modificado");
    }

    @Test
    void testToString() {
        b.setX(4);
        b.setY(2);
        b.setXDelta(1);
        b.setYDelta(1);
        String salidaEsperada= "Ball[(4.0,2.0), speed=(1.0,1.0)]";
        assertEquals(salidaEsperada,b.toString(),"No sale el mismo texto en toString");
    }
}