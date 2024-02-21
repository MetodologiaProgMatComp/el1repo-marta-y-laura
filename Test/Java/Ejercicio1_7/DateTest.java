package Ejercicio1_7;

import Ejercicio1_3.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {
    Date d= new Date(12,2, 2005);
    void probarConstructoresDate() {
        Date d= new Date(12,2, 2005);
        assertNotNull(d);
    }

    @Test
    void getDay() {
        int day = d.getDay();
        assertNotEquals(day, 12);
        assertTrue((day > 0), "Error, es menor o igual a 0.");
        assertTrue((day <= 31), "Error, es mayor a 31.");
    }

    @Test
    void getMonth() {
        int month = d.getMonth();
        assertNotEquals(month, 2);
        assertTrue((month > 0), "Error, es menor o igual a 0.");
        assertTrue((month <= 12), "Error, es mayor a 12.");
    }

    @Test
    void getYear() {
        int year = d.getDay();
        assertNotEquals(year, 12);
        assertTrue((year >= 1900), "Error, es menor a 1999.");
        assertTrue((year <= 9999), "Error, es mayor a 9999.");
    }

    @Test
    void setDay() {
        d.setDay(22);
        assertEquals(d.getDay(), 22, "El dia no ha cambiado.");
    }

    @Test
    void setMonth() {
        d.setMonth(12);
        assertEquals(d.getMonth(), 12, "El mes no ha cambiado.");
    }

    @Test
    void setYear() {
        d.setYear(1972);
        assertEquals(d.getYear(), 1972, "El año no ha cambiado.");
    }

    @Test
    void setDate() {
        d.setDate(5,4,2004);
        assertEquals(d.getDay(), 5, "El día no ha cambiado.");
        assertEquals(d.getMonth(),4, "El mes no ha cambiado.");
        assertEquals(d.getYear(),2004, "El año no ha cambiado.");
    }

    @Test
    void testToString() {
        d.setDate(27, 11, 2005);
        String salidaEsperada= "27/11/2005";
        assertEquals(salidaEsperada,d.toString(),"No sale el mismo texto en toString");
    }
}