package Ejercicio3_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {
    Dog d = new Dog("Bone");
    void constructor(){
        Dog d = new Dog("Bone");
        assertNotNull(d);
    }

    @Test
    void greets() {
        constructor();
        d.greets();
    }

    @Test
    void testGreets() {
        Dog d2 = new Dog("Blanco");
        d.greets(d2);
    }

    @Test
    void testToString() {
        assertEquals(d.toString(), "Dog[Mammal[Animal[name=Bone]]]","No sale el mismo texto en toString");
    }
}