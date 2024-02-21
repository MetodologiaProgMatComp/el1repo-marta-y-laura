package Ejercicio1_8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @Test
    void getHour() {
        ClaseTime miObjeto = new ClaseTime(2, 50, 30);
        assertEquals(2, miObjeto.getHour(), "Mal getHour");
    }

    @Test
    void getMinute() {
        ClaseTime miObjeto = new ClaseTime(2, 50, 30);
        assertEquals(50, miObjeto.getMinute(), "Mal getMinute");
    }

    @Test
    void getSecond() {
        ClaseTime miObjeto = new ClaseTime(2, 50, 30);
        assertEquals(30, miObjeto.getSecond(), "Mal getSecond");
    }

    @Test
    void setHour() {
        ClaseTime miObjeto = new ClaseTime(2, 50, 30);
        assertDoesNotThrow(() -> miObjeto.setHour(5));
        assertEquals(5, miObjeto.getHour(), "Mal setHour");
    }

    @Test
    void setMinute() {
        ClaseTime miObjeto = new ClaseTime(2, 50, 30);
        assertDoesNotThrow(() -> miObjeto.setMinute(53));
        assertEquals(53, miObjeto.getMinute(), "Mal setMinute");
    }

    @Test
    void setSecond() {
        ClaseTime miObjeto = new ClaseTime(2, 50, 30);
        assertDoesNotThrow(() -> miObjeto.setSecond(45));
        assertEquals(45, miObjeto.getSecond(), "Mal setSecond");
    }

    @Test
    void setClaseTime() {
        ClaseTime miObjeto = new ClaseTime(2, 50, 30);
        assertDoesNotThrow(() -> miObjeto.setClaseTime(3, 53, 5));
        assertEquals(3, miObjeto.getHour(), "Mal getHour");
        assertEquals(53, miObjeto.getMinute(), "Mal getMinute");
        assertEquals(5, miObjeto.getSecond(), "Mal getSeconnd");
    }

    @Test
    void testToString() {
        ClaseTime miObjeto = new ClaseTime(2, 50, 30);
        String salidaEsperada = "02:50:30";
        assertEquals(salidaEsperada, miObjeto.toString(), "Distinto en toString");
    }

    @Test
    void nextSecondTime() {
        ClaseTime miObjeto = new ClaseTime(2, 50, 30);
        assertDoesNotThrow(() -> miObjeto.nextSecondTime());
        assertEquals(31, miObjeto.getSecond(), "Mal nextSecondTime");
    }

    @Test
    void previusSecond() {
        ClaseTime miObjeto = new ClaseTime(2, 50, 30);
        assertDoesNotThrow(() -> miObjeto.previusSecond());
        assertEquals(29, miObjeto.getSecond(), "Mal previusSecond");
    }
}