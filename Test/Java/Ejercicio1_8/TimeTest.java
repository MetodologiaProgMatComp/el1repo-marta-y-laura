package Ejercicio1_8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {
    @Test
    void constructor(){
        Time t = new Time(2,50,30);
        assertNotNull(t);
    }

    @Test
    void getHour() {
        Time miObjeto = new Time(2, 50, 30);
        assertEquals(2, miObjeto.getHour(), "Mal getHour");
    }

    @Test
    void getMinute() {
        Time miObjeto = new Time(2, 50, 30);
        assertEquals(50, miObjeto.getMinute(), "Mal getMinute");
    }

    @Test
    void getSecond() {
        Time miObjeto = new Time(2, 50, 30);
        assertEquals(30, miObjeto.getSecond(), "Mal getSecond");
    }

    @Test
    void setHour() {
        Time miObjeto = new Time(2, 50, 30);
        assertDoesNotThrow(() -> miObjeto.setHour(5));
        assertEquals(5, miObjeto.getHour(), "Mal setHour");
    }

    @Test
    void setMinute() {
        Time miObjeto = new Time(2, 50, 30);
        assertDoesNotThrow(() -> miObjeto.setMinute(53));
        assertEquals(53, miObjeto.getMinute(), "Mal setMinute");
    }

    @Test
    void setSecond() {
        Time miObjeto = new Time(2, 50, 30);
        assertDoesNotThrow(() -> miObjeto.setSecond(45));
        assertEquals(45, miObjeto.getSecond(), "Mal setSecond");
    }

    @Test
    void setTime() {
        Time miObjeto = new Time(2, 50, 30);
        assertDoesNotThrow(() -> miObjeto.setTime(3, 53, 5));
        assertEquals(3, miObjeto.getHour(), "Mal getHour");
        assertEquals(53, miObjeto.getMinute(), "Mal getMinute");
        assertEquals(5, miObjeto.getSecond(), "Mal getSeconnd");
    }

    @Test
    void testToString() {
        Time miObjeto = new Time(2, 50, 30);
        String salidaEsperada = "02:50:30";
        assertEquals(salidaEsperada, miObjeto.toString(), "Distinto en toString");
    }

    @Test
    void nextSecond() {
        Time miObjeto = new Time(2, 50, 30);
        assertDoesNotThrow(miObjeto::nextSecond);
        assertEquals(31, miObjeto.getSecond(), "Mal nextSecondTime");
    }

    @Test
    void previousSecond() {
        Time miObjeto = new Time(2, 50, 30);
        assertDoesNotThrow(miObjeto::previousSecond);
        assertEquals(29, miObjeto.getSecond(), "Mal previusSecond");
    }
}