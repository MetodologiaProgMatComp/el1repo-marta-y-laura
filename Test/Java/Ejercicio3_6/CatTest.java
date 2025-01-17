package Ejercicio3_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {
    Cat c = new Cat("Whiskers");
    @Test
    void constructor(){
        Cat c = new Cat("Whiskers");
        assertNotNull(c);
    }
    @Test
     void greets() {
        assertEquals(c.greets(), "Meow","No sale el mismo texto en toString");
    }

    @Test
    void testToString() {
        assertEquals(c.toString(), "Cat[Mammal[Animal[name=Whiskers]]]","No sale el mismo texto en toString");
    }
}