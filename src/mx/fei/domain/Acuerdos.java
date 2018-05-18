package mx.fei.domain;

import java.util.Date;

public class Acuerdos {
    private int numeroAcuerdo;
    private String descripcion;
    private String nombreEncargado;
    private String apellidoEncargado;
    private Date fecha;

    public int getNumeroAcuerdo() {
        return numeroAcuerdo;
    }

    public void setNumeroAcuerdo(int numeroAcuerdo) {
        this.numeroAcuerdo = numeroAcuerdo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombreEncargado() {
        return nombreEncargado;
    }

    public void setNombreEncargado(String nombreEncargado) {
        this.nombreEncargado = nombreEncargado;
    }

    public String getApellidoEncargado() {
        return apellidoEncargado;
    }

    public void setApellidoEncargado(String apellidoEncargado) {
        this.apellidoEncargado = apellidoEncargado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
