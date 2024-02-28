package Ejercicio6_5;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
   Circle c= new Circle(2);

    @Test
    void getPerimeter() {
        double perimeter=c.getPerimeter();
        assertEquals(12.566370614359172,perimeter, "No esperado" );
    }

    @Test
    void getArea() {
        double area = c.getArea();
        assertEquals(12.566370614359172, area, "El area no es el esperado.");
    }
}