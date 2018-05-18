package mx.fei.domain;

import java.util.Date;

public class Actividad {
    private String tema;
    private String inicio;
    private String fin;
    private String liderDiscusion;
    private int numeroActividad;

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public String getLiderDiscusion() {
        return liderDiscusion;
    }

    public void setLiderDiscusion(String liderDiscusion) {
        this.liderDiscusion = liderDiscusion;
    }

    public int getNumeroActividad() {
        return numeroActividad;
    }

    public void setNumeroActividad(int numeroActividad) {
        this.numeroActividad = numeroActividad;
    }
}
