package Ejercicio3_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point3DTest {
    Point3D p3= new Point3D(2, 1, 3);

    @Test
    void getZ() {
        float z = p3.getZ();
        assertEquals(3, z, "z no es el esperado.");
    }

    @Test
    void setZ() {
        p3.setZ(6);
        assertEquals(6,p3.getZ(),"z no ha cambiado.");
    }

    @Test
    void setXYZ() {
        p3.setXYZ(4,8,6);
        assertEquals(p3.getX(), 4, "no cambia");
        assertEquals(p3.getY(), 8, "no cambia");
        assertEquals(p3.getZ(), 6, "no cambia");
    }

    @Test
    void getXYZ() {
        p3.setX(4);
        p3.setY(8);
        p3.setZ(6);
        assertEquals(p3.getXYZ()[0], 4);
        assertEquals(p3.getXYZ()[1], 8);
        assertEquals(p3.getXYZ()[2], 6);
    }

    @Test
    void testToString() {
        float x = 2;
        float y = 1;
        float z = 3;
        p3.setX(x);
        p3.setY(y);
        p3.setY(z);
        String salidaEsperada= "Point3D{x=2.0y=3.0z=3.0}";
        assertEquals(salidaEsperada,p3.toString(),"No sale el mismo texto en toString");
    }
}