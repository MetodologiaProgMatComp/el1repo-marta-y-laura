package Ejercicio3_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaffTest {
    Staff s= new Staff("Marta", "c", "UAH", 100);

    @Test
    void getSchool() {
        String school = s.getSchool();
        assertEquals("UAH", school, "school no es el esperado.");
    }

    @Test
    void setSchool() {
        s.setSchool("PL");
        assertEquals(s.getSchool(),"PL","school no ha cambiado.");
    }

    @Test
    void getPay() {
        double pay = s.getPay();
        assertEquals(100, pay, "pay no es el esperado.");
    }

    @Test
    void setPay() {
        s.setPay(200);
        assertEquals(s.getPay(),200,"La direccion no ha cambiado.");
    }

    @Test
    void testToString() {
        String school = "UAH";
        double pay = 100;
        s.setSchool(school);
        s.setPay(pay);
        String salidaEsperada= "Staff{school='UAH, pay=100.0}";
        assertEquals(salidaEsperada,s.toString(),"No sale el mismo texto en toString");
    }
}