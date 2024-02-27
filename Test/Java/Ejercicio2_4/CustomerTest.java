package Ejercicio2_4;

import Ejercicio1.Circle;
import Ejercicio1_4.Employee;
import Ejercicio2_3.Author;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void getId() {
        Customer miObjeto = new Customer(11, "Marta", 30);
        assertEquals(11, miObjeto.getId(), "Mal getID");
    }

    @Test
    void getName() {
        Customer miObjeto = new Customer(11, "Marta", 30);
        assertEquals("Marta", miObjeto.getName(), "Mal getName");
    }

    @Test
    void getDiscount() {
        Customer miObjeto = new Customer(11, "Marta", 30);
        assertEquals(30, miObjeto.getDiscount(), "Mal getDiscount");
    }

    @Test
    void setDiscount() {
        Customer miObjeto = new Customer(11, "Marta", 30);
        assertDoesNotThrow(() -> miObjeto.setDiscount(50));
        assertEquals(50, miObjeto.getDiscount(), "Mal setDiscount");
    }

    @Test
    void testToString() {
        Customer d=new Customer(11,"Marta",50);
        String salidaEsperada="Customer[id=11, name='Marta, discount=50%]";
        assertEquals(salidaEsperada,d.toString(),"No sale el mismo texto en toString");
    }
}