package Ejercicio3_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Circle c = new Circle();
    Circle c2 = new Circle(3);
    Circle c3 = new Circle(2,"blue", true);
    @Test
    void constructors(){
        assertNotNull(c);
        assertNotNull(c2);
        assertNotNull(c3);
    }

    @Test
    void getRadius() {
        Circle miObjeto=new Circle(3);
        assertTrue(miObjeto.getRadius()>0);
        assertEquals(3,miObjeto.getRadius(),"No ha devuelto el radio adecuado");
    }

    @Test
    void setRadius() {
        Circle miObjeto=new Circle(3);
        miObjeto.setRadius(5);
        assertDoesNotThrow(()->miObjeto.setRadius(5));
        assertEquals(5,miObjeto.getRadius(),"No ha devuelto el radio adecuado");
    }

    @Test
    void getArea() {
        Circle miObjeto=new Circle(4);
        double area= 4*4*Math.PI;
        assertTrue(miObjeto.getArea()>0);
        assertEquals(area,miObjeto.getArea(), "No se ha obtenido el área esperada.");
    }

    @Test
    void getPerimeter() {
        Circle miObjeto=new Circle(4);
        double circunferencia= 2*4*Math.PI;
        assertTrue(miObjeto.getPerimeter()>0);
        assertEquals(circunferencia,miObjeto.getPerimeter(),"No se ha obtenido el perímetro esperado.");
    }

    @Test
    void testToString() {
        double radius=4.3;
        Circle s=new Circle();
        s.setColor("blue");
        s.setFilled(true);
        s.setRadius(radius);
        String salidaEsperada= "Circle[Shape[color=blue, filled=true, radius=4.3]";
        assertEquals(salidaEsperada,s.toString(),"No sale el mismo texto en toString");
    }
}