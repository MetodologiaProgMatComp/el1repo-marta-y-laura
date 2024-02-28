package Ejercicio6_6;

import Ejercicio6_5.ResizableCircle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {
    Cat c= new Cat();

    @Test
    void greets() {
        String greets = c.greets();
        assertEquals("Meow", greets, "El radio no es el esperado.");
    }
}