package model;
import collections.*;

import java.util.Date;

public class CentralPacientes {
    public LinkList<Paciente> collections = new LinkList<Paciente>();

    public int numPacientes;
    public Paciente primero;

    public Paciente ultimo;

    public CentralPacientes() {
        this.numPacientes = 0;
    }




    public boolean addPaciente(Paciente paciente){
        collections.add(paciente);
    

        return false;
    }


    public Paciente searchPaciente(){
        collections.contains(primero);
        return null;
    }

    public boolean deletePaciente(int codigo){
        collections.delete(primero);
        return false;
    }


   
}
