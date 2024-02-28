package Ejercicio3_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {
    Dog d = new Dog("Bone");
    Dog d1 = new Dog("Black");
    @Test
    void constructor(){
        Dog d = new Dog("Bone");
        assertNotNull(d);
    }

    @Test
    void greets() {
        assertEquals(d.greets(), "Woof","No sale el mismo texto en toString");
    }

    @Test
    void testGreets() {
        assertEquals(d.greets(d1), "Woooof","No sale el mismo texto en toString");
    }

    @Test
    void testToString() {
        assertEquals(d.toString(), "Dog[Mammal[Animal[name=Bone]]]","No sale el mismo texto en toString");
    }
}