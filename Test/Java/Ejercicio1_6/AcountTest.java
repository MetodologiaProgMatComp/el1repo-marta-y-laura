package Ejercicio1_6;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class AcountTest {

    @Test
    void getId() {
        Account miObjeto= new Account("78","Marta",6);
        assertEquals("78", miObjeto.getID(),"Fallo getID");
    }

    @Test
    void getName() {
        Account miObjeto= new Account("78","Marta",6);
        assertEquals("Marta",miObjeto.getName(),"Fallo getName");

    }

    @Test
    void getBalance() {
        Account miObjeto= new Account("78","Marta",6);
    }

    @Test
    void credit() {
        Account miObjeto= new Account("78","Marta",6);
        assertDoesNotThrow(()->miObjeto.credit(25));
        assertEquals(6+25,miObjeto.getBalance(),"Mal el credito");

    }

    @Test
    void transferTo() {
        Account miObjeto= new Account("78","Marta",6);
        Account destino=new Account("56","Laura",32);
        assertDoesNotThrow(()->miObjeto.transferTo(destino,10));
        assertEquals(6,miObjeto.getBalance(),"kjgsak");
        assertEquals(32,destino.getBalance(),"hjjjh");
        assertDoesNotThrow(()->miObjeto.transferTo(destino,3));
        assertEquals(6-3,miObjeto.getBalance(),"kgkdasj");
        assertEquals(32+3,destino.getBalance(),"dfghx");
    }

    @Test
    void testToString() {
        Account miObjeto= new Account("78","Marta",6);
        String cadenaesperada="Account[id = 78, name = Marta, balance = 6]";
        assertEquals(cadenaesperada,miObjeto.toString(),"El mensaje no es el esperado.");
    }
}