package Ejercicio6_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {
    Dog d= new Dog();
    Dog d2= new Dog();

    @Test
    void greets() {
        String greets = d.greets();
        assertEquals("Woof", greets, "El radio no es el esperado.");

    }

    @Test
    void testGreets() {
        String gre = d.greets(d2);
        assertEquals("Woooooof", gre, "El radio no es el esperado.");
    }
}