package Ejercicio3_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {
    Circle c= new Circle (2, "azul");
    Cylinder cyl= new Cylinder(20);
    Cylinder cy2 = new Cylinder();
    Cylinder cy3 = new Cylinder(2,5);
    @Test
    void constructor(){
        assertNotNull(c);
        assertNotNull(cyl);
        assertNotNull(cy2);
        assertNotNull(cy3);
    }

    @Test
    void getHeight() {
        double height = cyl.getHeight();
        assertEquals(20, height, "El peso no es el esperado.");

    }

    @Test
    void getVolume() {
        double radio= c.getRadius();
        double volume = cyl.getVolume(radio);
        assertEquals(0, volume , "El volumen no es el esperado.");
    }

    @Test
    void testToString() {
        String salidaEsperada= "Cylinder: subclass of Circle{radius=0.0, color='red} height=20.0";
        assertEquals(salidaEsperada,cyl.toString(),"No sale el mismo texto en toString");
    }
}