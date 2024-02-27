package Ejercicio2_5;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Customer1Test {

    @Test
    void getId() {

        Customer1 miObjeto = new Customer1(11, "Marta", 'm');
        assertEquals(11, miObjeto.getId(), "Mal getID");
    }

    @Test
    void getName() {
        Customer1 miObjeto = new Customer1(11, "Marta", 'm');
        assertEquals("Marta", miObjeto.getName(), "Mal getName");
    }

    @Test
    void getGender() {
        Customer1 miObjeto = new Customer1(11, "Marta", 'm');
        assertEquals('m', miObjeto.getGender(), "Mal getGender");
    }

    @Test
    void testToString() {

        Customer1 miObjeto = new Customer1(11, "Marta", 'm');
        String salidaEsperada= "Customer[id=11, name='Marta, gender=m]";
        assertEquals(salidaEsperada, miObjeto.toString(),"No sale el mismo texto en toString");
    }
}