package mx.fei.domain;

import java.util.Date;

public class Academico {
    private String matricula;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private String calleDireccion;
    private String colDireccion;
    private String numDireccion;
    private String correoFacultativo;
    private String administrador;

    public Academico(){
        administrador = "falso";
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCalleDireccion() {
        return calleDireccion;
    }

    public void setCalleDireccion(String calleDireccion) {
        this.calleDireccion = calleDireccion;
    }

    public String getColDireccion() {
        return colDireccion;
    }

    public void setColDireccion(String colDireccion) {
        this.colDireccion = colDireccion;
    }

    public String getNumDireccion() {
        return numDireccion;
    }

    public void setNumDireccion(String numDireccion) {
        this.numDireccion = numDireccion;
    }

    public String getCorreoFacultativo() {
        return correoFacultativo;
    }

    public void setCorreoFacultativo(String correoFacultativo) {
        this.correoFacultativo = correoFacultativo;
    }

    public String getAdministrador() {
        return administrador;
    }

    public void setAdministrador(String administrador) {
        this.administrador = administrador;
    }
}
