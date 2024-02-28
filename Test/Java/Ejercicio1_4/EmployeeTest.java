package Ejercicio1_4;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {
    @Test
    void getId() {
        Employee miObjeto=new Employee(2,"Marta","Valiente",455);
        assertEquals(2,miObjeto.getId(),"Mal getID");
    }

    @Test
    void getFirstName() {
        Employee miObjeto=new Employee(2,"Marta","Valiente",455);
        assertEquals("Marta",miObjeto.getFirstName(),"Mal getFirstName");

    }

    @Test
    void getLastName() {
        Employee miObjeto=new Employee(2,"Marta","Valiente",455);
        assertEquals("Valiente",miObjeto.getLastName(),"Mal lastName");
    }

    @Test
    void getName() {
        Employee miObjeto=new Employee(2,"Marta","Valiente",455);
        assertEquals("Marta Valiente",miObjeto.getName(),"Mal getName");
    }

    @Test
    void getSalary() {
        Employee miObjeto=new Employee(2,"Marta","Valiente",455);
        assertEquals(455,miObjeto.getSalary(),"Mal getSalary");
    }
    @Test
    void setSalary() {
        Employee miObjeto=new Employee(2,"Marta","Valiente",455);
        assertDoesNotThrow(()->miObjeto.setSalary(500) );
        assertEquals(500,miObjeto.getSalary(),"Mal setSalary");
    }

    @Test
    void getAnnualSalary() {
        Employee miObjeto=new Employee(2,"Marta","Valiente",455);
        int x = miObjeto.getSalary();
        int salarioesperado= 12*x;
        assertEquals(salarioesperado,miObjeto.getAnnualSalary(),"Mal getAnnualSalary");
    }

    @Test
    void raiseSalary() {
        Employee miObjeto=new Employee(2,"Marta","Valiente",455);
        int x= miObjeto.getSalary();
        int subida= 10;
        int nuevoSalario=((x*subida)/100);
        assertEquals(nuevoSalario,miObjeto.raiseSalary(10),"Mal getSalary");
    }

    @Test
    void testToString() {
        Employee miObjeto=new Employee(2,"Marta","Valiente",455);
        String salidaEsperada="Employee[id = 2, name = Marta Valiente, salary = 455]";
        assertEquals(salidaEsperada,miObjeto.toString(),"No sale el mismo texto en toString");
    }
}
