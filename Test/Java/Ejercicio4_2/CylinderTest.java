package Ejercicio4_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {
    Cylinder cy = new Cylinder();
    @Test
    void constructor(){
        assertNotNull(cy);
    }
    @Test
    void getHeight() {
        assertTrue(cy.getHeight()>0, "Es menor o igual a 0.");
        assertEquals(cy.getHeight(), 1.0, "No se ha obtenido el  valor esperado.");
    }

    @Test
    void getVolume() {
        assertTrue(cy.getVolume()>0, "Es menor o igual a 0.");
        assertEquals(cy.getVolume(), Math.PI, "No se ha obtenido el  valor esperado.");
    }

    @Test
    void testToString() {
        double height = cy.getHeight();
        assertEquals("Cylinder: subclass of circle, height=" + height, cy.toString());
    }
}