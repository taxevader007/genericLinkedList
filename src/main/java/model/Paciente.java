package model;

import java.util.Date;

public class Paciente {
    public int codigo;
    public String name;
    public Paciente siguiente;

    public Paciente(int codigo, Date fechaNacimiento, String name) {

        this.codigo = codigo;
        this.name = name;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Paciente getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Paciente siguiente) {
        this.siguiente = siguiente;
    }
}
