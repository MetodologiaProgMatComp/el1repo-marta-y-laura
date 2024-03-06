package Ejercicio2_5;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    Customer1 c = new Customer1(11, "Marta", 'm');
    Account a = new Account(11, c, 30);
    Account a2 = new Account(11, c);
    @Test
    void constructors(){
        assertNotNull(a);
        assertNotNull(a2);
    }
    @Test
    void getId() {
        int id = a.getId();
        assertEquals(11, id, "El id no es el esperado.");
    }

    @Test
    void getCustomer() {
        Customer1 customer = a.getCustomer();
        assertEquals(c, customer, "El customer no es el esperado.");
    }

    @Test
    void getBalance() {
        double balance = a.getBalance();
        assertEquals(30, balance, "El balance no es el esperado.");
    }

    @Test
    void setBalance() {
        assertDoesNotThrow(() -> a.setBalance(4.5));
        assertEquals(4.5, a.getBalance(), "getBalance");
    }

    @Test
    void testToString() {
        Account a = new Account(11, c, 30);
        String salidaEsperada = "Account{id=11, customer=Customer[id=11, name='Marta, gender=m], balance=30,0030.0}";
        assertEquals(salidaEsperada, a.toString(), "No sale el mismo texto en toString");
    }

    @Test
    void getCustomerName() {
        String customer = a.getCustomerName();
        assertEquals("Marta", customer, "El customer no es el esperado.");
    }

    @Test
    void deposit() {
        assertDoesNotThrow(() -> a.deposit(3.5));
        assertEquals(30 + 3.5, a.getBalance(), "gsg");
    }

    @Test
    void withdraw() {
        assertDoesNotThrow(() -> a.withdraw(3.5));
        assertEquals(30 - 3.5, a.getBalance(), "gsg");
        a.withdraw(2);
        assertEquals(24.5, a.getBalance(), "gsg");
    }
}