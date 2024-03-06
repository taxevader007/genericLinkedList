package model;
import collections.*;

public class CentralPacientes {
    public LinkList<Paciente> collections = new LinkList<Paciente>();

    
    public CentralPacientes() {
        
    }

    public boolean addPaciente(Paciente paciente){
        collections.add(paciente);
    

        return false;
    }

    public Paciente searchPaciente(Paciente paciente){
        collections.contains(paciente);
        return null;
    }

    public boolean deletePaciente(Paciente paciente){
        collections.delete(paciente);
        return false;
    }


   
}
