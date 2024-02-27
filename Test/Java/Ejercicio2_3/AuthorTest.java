package Ejercicio2_3;

import Ejercicio1.Circle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {
    Author a= new Author("Marta", "marta@gmail.com");

    @Test
    void getName() {
        String name= a.getName();
        assertEquals("Marta", name, "El nombre no es el esperado.");

    }
    @Test
    void getEmail() {
        String email= a.getEmail();
        assertEquals("marta@gmail.com", email, "El email no es el esperado.");

    }

    @Test
    void setEmail() {
        a.setEmail("laura@gmail.com");
        assertEquals(a.getEmail(), "laura@gmail.com", "El email no ha cambiado.");
    }

    @Test
    void testToString() {
        Author myAuthor = new Author("Marta","marta@gmail.com");
        String salidaEsperada = "Author[name='Marta, email='marta@gmail.com]";
        assertEquals(salidaEsperada,myAuthor.toString(),"Los textos no son igulaes");
    }
}
