package Ejercicio2_4;
import Ejercicio2_4.Customer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {
    Customer d=new Customer(11,"Marta",50);
    Invoice i= new Invoice(11, d,  100);

    @Test
    void getId() {
        int id = i.getId();
        assertEquals(11, id, "El id no es el esperado.");
    }

    @Test
    void getCustomer() {
        Customer customer = i.getCustomer();
        assertEquals(d, customer, "El customer no es el esperado.");
    }


    @Test
    void setCustomer() {
        Customer c= new Customer(21,"Laura",53);
        i.setCustomer(c);
        assertEquals(c,i.getCustomer(), "El Customer no ha cambiado.");
    }

    @Test
    void getAmount() {
        double amount = i.getAmount();
        assertEquals(100, amount, "amount  no es el esperado.");
    }

    @Test
    void setAmount() {
        assertDoesNotThrow(()->i.setAmount(2.3));
        assertEquals(2.3, i.getAmount(),"get amount");
    }

    @Test
    void getCustomerId() {
        int customer = i.getCustomerId();
        assertEquals(11, customer, "El customer no es el esperado.");
    }


    @Test
    void getCustomerName() {
        String customer = i.getCustomerName();
        assertEquals("Marta", customer, "El customer no es el esperado.");
    }

    @Test
    void getCustomerDiscount() {
        int customer = i.getCustomerDiscount();
        assertEquals(50, customer, "El customer no es el esperado.");
    }

    @Test
    void getAmountAfterDiscount() {
        double amountAfterDiscount = i.getAmountAfterDiscount();
        assertEquals(50, amountAfterDiscount, "Amount no es el esperado.");
    }

    @Test
    void testToString() {
        Invoice i=new Invoice(11, d,  100);
        String salidaEsperada="Invoice[id=11, customer=Customer[id=11, name='Marta, discount=50%], amount=100.0%]";
        assertEquals(salidaEsperada,i.toString(),"No sale el mismo texto en toString");
    }
}