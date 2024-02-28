package Ejercicio2_3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    Author a= new Author("Marta", "marta@gmail.com");
    Book b = new Book("1234", "Hola", a, 5, 13 );
    @Test
    void probarConstructorsBook() {

        Book b1 = new Book("1234", "Hola", new Author("Marta", "marta@gmail.com"), 5);

        assertNotNull(b1);
        Book b2 = new Book("1234", "Hola", new Author("Marta", "marta@gmail.com"), 5, 13 );

        assertNotNull(b2);
        assertNotNull(a);
    }

    @Test
    void getIsbn() {
        Book miObjeto = new Book("1234", "Hola", new Author("Marta", "marta@gmail.com"), 5, 13 );
        assertEquals("1234", miObjeto.getIsbn(), "Mal getIsbn");
    }

    @Test
    void getName() {
        Book miObjeto = new Book("1234", "Hola", new Author("Marta", "marta@gmail.com"), 5, 13 );
        assertEquals("Hola", miObjeto.getName(), "Mal getName");
    }

    @Test
    void getAuthor() {
    }

    @Test
    void getPrice() {
        Book miObjeto = new Book("1234", "Hola", new Author("Marta", "marta@gmail.com"), 5, 13 );
        assertEquals(5, miObjeto.getPrice(), "Mal getPrice");

    }

    @Test
    void getQty() {
        Book miObjeto = new Book("1234", "Hola", new Author("Marta", "marta@gmail.com"), 5, 13 );
        assertEquals(13, miObjeto.getQty(), "Mal getQty");
    }

    @Test
    void setPrice() {
        b.setPrice(7);
        assertEquals(b.getPrice(), 7, "El precio no ha cambiado.");
    }

    @Test
    void setQty() {
        b.setPrice(15);
        assertEquals(15, b.getPrice(), "La cantidad no ha cambiado.");
    }

    @Test
    void getAuthorName() {
        Book miObjeto = new Book("1234", "Hola", new Author("Marta", "marta@gmail.com"), 7, 15 );
        assertEquals("Marta", miObjeto.getAuthorName(), "Mal getAuthorName");
    }

    @Test
    void testToString() {
        assertEquals("Book[isbn='1234, name='Hola, author=Author[name='Marta, email='marta@gmail.com], price=5.0, qty=13]", b.toString());
    }
}