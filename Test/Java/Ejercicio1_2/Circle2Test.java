package Ejercicio1_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Circle2Test {
    @Test
    void getRadio() {
        Circle2 miObjeto=new Circle2(3d);
        assertEquals(3d,miObjeto.getRadius(),"No ha devuelto el radio adecuado");
    }

    @Test
    void setRadio() {
        Circle2 miObjeto=new Circle2(3d);
        miObjeto.setRadius(5d);
        assertDoesNotThrow(()->miObjeto.setRadius(5d));
        assertEquals(5d,miObjeto.getRadius(),"No ha devuelto el radio adecuado");

    }

    @Test
    void getArea() {
        Circle2 miObjeto=new Circle2(4d);
        double area= 4*4*Math.PI;
        assertEquals(area,miObjeto.getArea());
    }

    @Test
    void getCircumference() {
        Circle2 miObjeto=new Circle2(4d);
        double circunferencia= 2*4*Math.PI;
        assertEquals(circunferencia,miObjeto.getCircumference());

    }

    @Test
    void testToString() {
        double radius=4.3d;
        Circle2 s=new Circle2();
        s.setRadius(radius);
        String salidaEsperada= "Circle[radius is 4.3]";
        assertEquals(salidaEsperada,s.toString(),"No sale el mismo texto en toString");
    }
}



