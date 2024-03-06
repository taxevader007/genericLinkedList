package model;

import java.util.Date;

public class Paciente {
    public int codigo;
    public Date fechaNacimiento;
    public String name;
    public Paciente siguiente;

    public Paciente(int codigo, Date fechaNacimiento, String name) {

        this.codigo = codigo;
        this.fechaNacimiento = fechaNacimiento;
        this.name = name;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
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
