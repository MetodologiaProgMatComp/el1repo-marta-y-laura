package Ejercicio1_4;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import Ejercicio1_4.NewEmployee;

public class NewEmployeeTest {
    @Test
    void getId() {
        NewEmployee miObjeto=new NewEmployee(2,"Marta","Valiente",455);
        assertEquals(2,miObjeto.getId(),"Mal getID");
    }

    @Test
    void getFirstName() {
        NewEmployee miObjeto=new NewEmployee(2,"Marta","Valiente",455);
        assertEquals("Marta",miObjeto.getFirstName(),"Mal getFirstName");

    }

    @Test
    void getLastName() {
        NewEmployee miObjeto=new NewEmployee(2,"Marta","Valiente",455);
        assertEquals("Valiente",miObjeto.getLastName(),"Mal lastName");
    }

    @Test
    void getName() {
        NewEmployee miObjeto=new NewEmployee(2,"Marta","Valiente",455);
        assertEquals("Marta Valiente",miObjeto.getName(),"Mal getName");
    }

    @Test
    void getSalary() {
        NewEmployee miObjeto=new NewEmployee(2,"Marta","Valiente",455);
        assertEquals(455,miObjeto.getSalary(),"Mal getSalary");
    }
    @Test
    void setSalary() {
        NewEmployee miObjeto=new NewEmployee(2,"Marta","Valiente",455);
        assertDoesNotThrow(()->miObjeto.setSalary(500) );
        assertEquals(500,miObjeto.getSalary(),"Mal setSalary");
    }

    @Test
    void getAnnualSalary() {
        NewEmployee miObjeto=new NewEmployee(2,"Marta","Valiente",455);
        int x = miObjeto.getSalary();
        int salarioesperado= 12*x;
        assertEquals(salarioesperado,miObjeto.getAnnualSalary(),"Mal getAnnualSalary");
    }

    @Test
    void raiseSalary() {
        NewEmployee miObjeto=new NewEmployee(2,"Marta","Valiente",455);
        int x= miObjeto.getSalary();
        int subida= 10;
        int nuevoSalario=((x*subida)/100)+x;
        assertEquals(nuevoSalario,miObjeto.raiseSalary(10),"Mal getSalary");
    }

    @Test
    void testToString() {
        NewEmployee miObjeto=new NewEmployee(2,"Marta","Valiente",455);
        String salidaEsperada="Employee[id=2,name=Marta Valiente,salary=455]";
        assertEquals(salidaEsperada,miObjeto.toString(),"No sale el mismo texto en toString");
    }
}
