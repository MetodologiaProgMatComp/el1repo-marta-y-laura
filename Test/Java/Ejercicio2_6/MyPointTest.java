package Ejercicio2_6;


import static org.junit.jupiter.api.Assertions.*;

class MyPointTest {
    MyPoint p= new MyPoint(4,2);
    @org.junit.jupiter.api.Test
    void getX() {
        int x = p.getX();
        assertEquals(x, 4);
        assertTrue((x > 0), "Error, es menor o igual a 0");
    }

    @org.junit.jupiter.api.Test
    void setX() {
        p.setX(8);
        assertEquals(p.getX(), 8, "La coordenada x no ha cambiado.");
    }

    @org.junit.jupiter.api.Test
    void getY() {
        int y = p.getY();
        assertEquals(y, 2);
        assertTrue((y > 0), "Error, es menor o igual a 0");
    }

    @org.junit.jupiter.api.Test
    void setY() {
        p.setY(4);
        assertEquals(p.getY(), 4, "La coordenada y no ha cambiado.");
    }

    @org.junit.jupiter.api.Test
    void getXY() {
        p.setX(4);
        p.setY(2);
        assertEquals(p.getXY()[0], 4);
        assertEquals(p.getXY()[1], 2);
        assertTrue((p.getX() > 0), "Error, es menor o igual a 0");
        assertTrue((p.getY() > 0), "Error, es menor o igual a 0");
    }

    @org.junit.jupiter.api.Test
    void setXY() {
        p.setXY(8,4);
        assertEquals(p.getY(), 4, "La coordenada y no ha cambiado.");
        assertEquals(p.getX(), 8, "La coordenada x no ha cambiado.");
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        p.setXY(4,2);
        String salidaEsperada= "(4,2)";
        assertEquals(p.toString(),salidaEsperada,"No sale el mismo texto en toString");
    }

    @org.junit.jupiter.api.Test
    void distance() {
        p.setXY(4,5);
        assertEquals(p.distance(8,8), 5, "La distancia no está bien calculada.");
    }

    @org.junit.jupiter.api.Test
    void testDistance() {
        p.setXY(4,5);
        MyPoint s= new MyPoint(8,8);
        assertEquals(p.distance(s), 5, "La distancia no está bien calculada.");
    }

    @org.junit.jupiter.api.Test
    void testDistance1() {
        p.setXY(4,3);
        assertEquals(p.distance(), 5, "La distancia con (0,0) no está bien calculada.");
    }
}