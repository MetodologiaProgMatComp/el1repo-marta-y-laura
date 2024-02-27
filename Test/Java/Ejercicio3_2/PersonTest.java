package Ejercicio3_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person p= new Person("Marta", "C");

    @Test
    void getName() {
        String name = p.getName();
        assertEquals("Marta", name, "El nombre no es el esperado.");
    }

    @Test
    void getAddress() {
        String address = p.getAddress();
        assertEquals("C",address, "direccion no esperada.");
    }

    @Test
    void setAddress() {
        p.setAddress("B");
        assertEquals(p.getAddress(),"B","La direccion no ha cambiado.");
    }

    @Test
    void testToString() {
        String name = "Marta";
        String address= "C";
        p.setAddress(address);
        String salidaEsperada= "Person{name='Marta, address='C}";
        assertEquals(salidaEsperada,p.toString(),"No sale el mismo texto en toString");
    }
}