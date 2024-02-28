package Ejercicio6_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BigDogTest {
    BigDog bd= new BigDog();
    Dog d= new Dog();
    BigDog bd1= new BigDog();

    @Test
    void greets() {
        String greets = bd.greets();
        assertEquals("Wooow", greets, "El radio no es el esperado.");
    }

    @Test
    void testGreets() {
        String gre = bd.greets(d);
        assertEquals("Woooooow", gre, "El radio no es el esperado.");
    }

    @Test
    void testGreets1() {
        String gre = bd.greets(bd1);
        assertEquals("Wooooooooooooooow", gre, "El radio no es el esperado.");
    }
}