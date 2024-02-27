package Ejercicio3_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student s= new Student("Marta", "C", "A", 2024, 12);

    @Test
    void getProgram() {
        String program = s.getProgram();
        assertEquals("A", program, "program no es el esperado.");
    }

    @Test
    void setProgram() {
        s.setProgram("B");
        assertEquals(s.getProgram(),"B","program no ha cambiado.");
    }

    @Test
    void getYear() {
        int year = s.getYear();
        assertEquals(2024, year, "year no es el esperado.");
    }

    @Test
    void setYear() {
        s.setYear(2025);
        assertEquals(s.getYear(),2025,"year no ha cambiado.");
    }

    @Test
    void getFee() {
        double fee = s.getFee();
        assertEquals(12, fee, "fee no es el esperado.");
    }

    @Test
    void setFee() {
        s.setFee(13);
        assertEquals(s.getFee(),13,"fee no ha cambiado.");
    }

    @Test
    void testToString() {
        String program = "A";
        int year = 2024;
        double fee= 12;
        s.setProgram(program);
        s.setYear(year);
        s.setFee(fee);
        String salidaEsperada= "Student{program='A, year=2024, fee=12.0}";
        assertEquals(salidaEsperada,s.toString(),"No sale el mismo texto en toString");
    }
}