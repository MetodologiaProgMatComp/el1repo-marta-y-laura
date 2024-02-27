package Ejercicio4_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LineTest {
    Point b= new Point(1,1);
    Point e= new Point(7,8);
    Line li= new Line(b,e);
    Line li2= new Line(1,1,7,8);
    @Test
    void constructors(){
        assertNotNull(b);
        assertNotNull(e);
        assertNotNull(li);
        assertNotNull(li2);
    }
    @Test
    void getBegin() {
        Point be = li.getBegin();
        assertEquals(be, b, "No se ha obtenido el dato esperado");
    }

    @Test
    void setBegin() {
        Point t= new Point(3,2);
        li.setBegin(t);
        assertEquals(li.getBegin(), t, "El punto de inicio no ha cambiado.");
    }

    @Test
    void getEnd() {
        Point b= new Point(1,1);
        Point e= new Point(7,8);
        Line li= new Line(b,e);
        Point end = li.getEnd();
        assertEquals(end, e, "No se ha obtenido el dato esperado");
    }

    @Test
    void setEnd() {
        Point i= new Point(9,12);
        li.setEnd(i);
        assertEquals(li.getEnd(), i, "El punto final no ha cambiado.");
    }

    @Test
    void getBeginX() {
        Point b= new Point(1,1);
        Point e= new Point(7,8);
        Line li= new Line(b,e);
        int x = li.getBeginX();
        assertEquals(x, 1, "No se ha obtenido el dato esperado");
    }

    @Test
    void setBeginX() {
        li.setBeginX(3);
        assertEquals(li.getBeginX(), 3, "La coordenada x no ha cambiado.");
    }

    @Test
    void getBeginY() {
        Point b= new Point(1,1);
        Point e= new Point(7,8);
        Line li= new Line(b,e);
        int y = li.getBeginY();
        assertEquals(y, 1, "No se ha obtenido el dato esperado");
    }

    @Test
    void setBeginY() {
        li.setBeginY(2);
        assertEquals(li.getBeginY(), 2, "La coordenada x no ha cambiado.");
    }

    @Test
    void getEndX() {
        Point b= new Point(1,1);
        Point e= new Point(7,8);
        Line li= new Line(b,e);
        int x = li.getEndX();
        assertEquals(x, 7, "No se ha obtenido el dato esperado");
    }

    @Test
    void setEndX() {
        li.setEndX(9);
        assertEquals(li.getEndX(), 9, "La coordenada x no ha cambiado.");
    }

    @Test
    void getEndY() {
        Point b= new Point(1,1);
        Point e= new Point(7,8);
        Line li= new Line(b,e);
        int y = li.getEndY();
        assertEquals(y, 8, "No se ha obtenido el dato esperado");
    }

    @Test
    void setEndY() {
        li.setEndY(11);
        assertEquals(li.getEndY(), 11, "La coordenada x no ha cambiado.");
    }

    @Test
    void getBeginXY() {
        Point b= new Point(1,1);
        Point e= new Point(7,8);
        Line li= new Line(b,e);
        assertEquals(li.getBeginXY()[0], 1);
        assertEquals(li.getBeginXY()[1], 1);
    }

    @Test
    void setBeginXY() {
        li.setBeginXY(2,4);
        assertEquals(li.getBeginY(), 4, "La coordenada y del punto de inicio no ha cambiado.");
        assertEquals(li.getBeginX(), 2, "La coordenada x del punto de inicio no ha cambiado.");
    }

    @Test
    void getEndXY() {
        Point b= new Point(1,1);
        Point e= new Point(7,8);
        Line li= new Line(b,e);
        assertEquals(li.getEndXY()[0], 7);
        assertEquals(li.getEndXY()[1], 8);
    }

    @Test
    void setEndXY() {
        li.setEndXY(8,9);
        assertEquals(li.getEndY(),  9, "La coordenada y del punto final no ha cambiado.");
        assertEquals(li.getEndX(), 8, "La coordenada x del punto final no ha cambiado.");
    }

    @Test
    void getLength() {
        Point b= new Point(1,5);
        Point e= new Point(5,8);
        Line li= new Line(b,e);
        assertEquals(li.getLength(),  5, "La distancia no es la esperada.");
    }

    @Test
    void getGradient() {
        Point b= new Point(1,5);
        Point e= new Point(91,20);
        Line li= new Line(b,e);
        assertEquals(li.getGradient(),  0.16514867741462683, "La distancia no es la esperada.");
    }

    @Test
    void testToString() {
        li.setBeginXY(4,2);
        li.setEndXY(7,8);
        String salidaEsperada= "Line[begin = (4,2), end = (7,8)]";
        assertEquals(li.toString(),salidaEsperada,"No sale el mismo texto en toString");
    }
}