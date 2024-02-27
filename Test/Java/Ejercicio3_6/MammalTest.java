package Ejercicio3_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MammalTest {
    @Test
    void constructor(){
        Mammal m = new Mammal("Ciervo");
        assertNotNull(m);
    }
    @Test
    void testToString() {
        Mammal m = new Mammal("Ciervo");
        constructor();
        assertEquals(m.toString(), "Mammal[Animal[name=Ciervo]]","No sale el mismo texto en toString");
    }
}