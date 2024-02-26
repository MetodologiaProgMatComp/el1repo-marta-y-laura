package Ejercicio3_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LineSubTest {
    LineSub li = new LineSub(1,1,5,7);
    Point b= new Point(1,1);
    Point e= new Point(5,7);
    LineSub li2 = new LineSub(b,e);
    void constructors(){
        assertNotNull(b);
        assertNotNull(e);
        assertNotNull(li);
        assertNotNull(li2);
    }
    @Test
    void getBegin() {
        constructors();
        Point be =li.getBegin();
        assertEquals(be.getX(), b.getX(), "No se ha obtenido el dato esperado");
        assertEquals(be.getY(), b.getY(), "No se ha obtenido el dato esperado");
    }

    @Test
    void setBegin() {
        Point t= new Point(3,2);
        li.setBegin(t);
        assertEquals(li.getBegin().getX(), t.getX(), "El punto de inicio no ha cambiado.");
        assertEquals(li.getBegin().getY(), t.getY(), "El punto de inicio no ha cambiado.");
    }

    @Test
    void getEnd() {
        Point end = li.getEnd();
        assertEquals(end.getX(), e.getX());
        assertEquals(end.getY(), e.getY());
    }

    @Test
    void setEnd() {
        Point i = new Point(9, 12);
        li.setEnd(i);
        assertEquals(li.getEnd().getX(), i.getX());
        assertEquals(li.getEnd().getY(), i.getY());
    }

    @Test
    void getBeginX() {
        int x = li.getBeginX();
        assertEquals(x, 1);
    }

    @Test
    void setBeginX() {
        li.setBeginX(3);
        assertEquals(li.getBeginX(), 3);
    }

    @Test
    void getBeginY() {
        int y = li.getBeginY();
        assertEquals(y, 1);
    }

    @Test
    void setBeginY() {
        li.setBeginY(2);
        assertEquals(li.getBeginY(), 2);
    }

    @Test
    void getEndX() {
        int x = li.getEndX();
        assertEquals(x, 5);
    }

    @Test
    void setEndX() {
        li.setEndX(9);
        assertEquals(li.getEndX(), 9);
    }

    @Test
    void getEndY() {
        int y = li.getEndY();
        assertEquals(y, 7);
    }

    @Test
    void setEndY() {
        li.setEndY(11);
        assertEquals(li.getEndY(), 11);
    }


    @Test
    void setBeginXY() {
        li.setBeginXY(2, 4);
        assertEquals(li.getBeginY(), 4);
        assertEquals(li.getBeginX(), 2);
    }

    @Test
    void setEndXY() {
        li.setEndXY(8, 7);
        assertEquals(li.getEndY(), 7);
        assertEquals(li.getEndX(), 8);
    }

    @Test
    void getLength() {
        assertEquals(li.getLength(), 7); // Distancia entre (1,1) y (5,7) es 7
    }

    @Test
    void getGradient() {
        double gradient = li.getGradient();
        assertEquals(gradient, 0.982793723247329); // Tangente de 45 grados
    }

    @Test
    void testToString() {
        li.setBeginXY(4, 2);
        li.setEndXY(7, 8);
        String expectedOutput = "LineSub[begin=Point: (4,2), end=Point: (7,8)]";
        assertEquals(li.toString(), expectedOutput);
    }
}