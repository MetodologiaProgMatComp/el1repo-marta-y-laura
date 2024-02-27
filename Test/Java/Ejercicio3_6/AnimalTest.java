package Ejercicio3_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    @Test
    void constructor(){
        Animal a = new Animal("Girafa");
        assertNotNull(a);
    }

    @Test
    void testToString() {
        Animal a = new Animal("Girafa");
        assertEquals(a.toString(),"Animal[name=Girafa]" ,"No sale el mismo texto en toString");
    }
}