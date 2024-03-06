package model;
import collections.*;

import java.util.Date;

public class CentralPacientes {
    public int numPacientes;
    public Paciente primero;

    public Paciente ultimo;

    public CentralPacientes() {
        this.numPacientes = 0;
    }



    public boolean agregarPaciente(Paciente nuevoPaciente, int searchValue){

        if(primero == null){
            primero = nuevoPaciente;
            ultimo = nuevoPaciente;
            return true;
        }
        else{
            Paciente pacienteActual = primero;

            while(pacienteActual != null){
                if(pacienteActual.getCodigo() == searchValue){
                    Paciente nextNode = pacienteActual.getSiguiente();
                    pacienteActual.setSiguiente(nuevoPaciente);
                    nuevoPaciente.setSiguiente(nextNode);
                    if(nuevoPaciente.getSiguiente() == null){
                        ultimo = nuevoPaciente;
                    }
                    this.numPacientes++;
                    return true;
                }
                pacienteActual = pacienteActual.getSiguiente();
            }
            return false;
        }
    }

    public boolean agregarPaciente(int codigo, Date fechaNacimiento, String name, int searchValue){

        if(primero == null){
            primero = new Paciente(codigo, fechaNacimiento, name);
            ultimo = new Paciente(codigo, fechaNacimiento, name);
            return true;
        }
        else{
            Paciente currentNode = primero;

            while(currentNode != null){
                if(currentNode.getCodigo() == searchValue){
                    Paciente newNode = new Paciente(codigo, fechaNacimiento, name);
                    Paciente nextNode = currentNode.getSiguiente();
                    currentNode.setSiguiente(newNode);
                    newNode.setSiguiente(nextNode);
                    if(nextNode == null){
                        ultimo = nextNode;
                    }
                    this.numPacientes++;
                    return true;
                }
                currentNode = currentNode.getSiguiente();
            }
            return false;
        }
    }

    /**
     * @param nuevoPaciente Paciente a agregar
     * @return true si se agrega el paciente, false si no se agrega
     * Agrega un paciente a la lista de pacientes
     * Si la lista está vacía, el paciente se agrega como el primero y el último
     * Si la lista no está vacía, el paciente se agrega al final de la lista
     * El paciente se agrega al final de la lista
     */
    public boolean agregarPaciente(Paciente nuevoPaciente){
        ultimo.setSiguiente(nuevoPaciente);
        ultimo = nuevoPaciente;
        return true;
    }

    public Paciente buscarPaciente(int codigoBusqueda){
        Paciente pacienteActual = primero;

        while(pacienteActual != null) {
            if(pacienteActual.getCodigo() == codigoBusqueda){
                return pacienteActual;
            }
            pacienteActual = pacienteActual.getSiguiente();
        }
        return null;
    }

    public boolean eliminarPaciente(int codigoBusqueda){
        Paciente pacienteActual = primero;

        while(pacienteActual != null){

            if(pacienteActual.getSiguiente().getCodigo() == codigoBusqueda){

                Paciente siguiente = pacienteActual.getSiguiente().getSiguiente();

                pacienteActual.setSiguiente(siguiente);

                this.numPacientes--;
                
                return true;
            }
            pacienteActual = pacienteActual.getSiguiente();
        }
        return false;
    }
}
