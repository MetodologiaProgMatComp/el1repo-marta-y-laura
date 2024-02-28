package Ejercicio1_5;

import Ejercicio1_3.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceItemTest {
    InvoiceItem i= new InvoiceItem("A101", "Pen Red", 888, 0.08);
    @Test
    void constructor(){
        assertNotNull(i);
    }

    @Test
    void getId() {
        InvoiceItem i= new InvoiceItem("A101", "Pen Red", 888, 0.08);
        String Id = i.getId();
        assertEquals("A101", Id, "El Id no es el esperado.");

    }

    @Test
    void getDesc() {
        String desc = i.getDesc();
        assertEquals("Pen Red", desc, "La descripción no es el esperado.");
    }

    @Test
    void getQty() {
        float qty = i.getQty();
        assertEquals(qty, 888);
        assertTrue((qty > 0), "Error, es menor o igual a 0");
    }

    @Test
    void getUnitPrice() {
        double price = i.getUnitPrice();
        assertEquals(price, 0.08);
        assertTrue((price > 0), "Error, es menor o igual a 0");
    }

    @Test
    void setQty() {
        i.setQty(222);
        assertEquals(i.getQty(), 222, "La cantidad no ha cambiado.");
    }

    @Test
    void setUnitPrice() {
        i.setUnitPrice(1);
        assertEquals(i.getUnitPrice(), 1, "El precio no ha cambiado.");
    }

    @Test
    void getTotal() {
        double unitprice = i.getUnitPrice();
        int qty =i.getQty();
        double total = qty*unitprice;
        assertEquals(total, i.getTotal(), "El total no es el esperado.");
    }

    @Test
    void testToString() {
        int qty = 222;
        double unitprice = 1;
        i.setQty(qty);
        i.setUnitPrice(unitprice);
        String salidaEsperada= "[id = A101, desc = Pen Red, qty = 222, unitPrice = 1.0]";
        assertEquals(salidaEsperada,i.toString(),"No sale el mismo texto en toString");
    }
}