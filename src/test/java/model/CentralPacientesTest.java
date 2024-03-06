package model;

import org.junit.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

public class CentralPacientesTest {

    CentralPacientes pacientes;

    public void setUp1(){
        pacientes = new CentralPacientes();
    }

    public void setUp2(){
        pacientes = new CentralPacientes();
        pacientes.agregarPaciente(1111, new Date(),"Heiner",0);
        pacientes.agregarPaciente(1313,new Date(),"Johann",1111);
    }

    @Test
    public void testAgregarPaciente1() {
        setUp1();
        boolean agregado = pacientes.agregarPaciente(1349,new Date(),"Juan José",1254);
        assertTrue(agregado);
    }
    @Test
    public void testAgregarPaciente2() {
        setUp2();
        boolean agregado = pacientes.agregarPaciente(1349,new Date(),"Juan José",1313);
        assertTrue(agregado);
    }
}