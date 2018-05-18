package mx.fei.domain;

import java.util.Date;

public class Minuta {
    private int idMinuta;
    private String proyecto;
    private String asunto;
    private String organizador;
    private String lugar;
    private Date fechaReunion;

    public int getIdMinuta() {
        return idMinuta;
    }

    public void setIdMinuta(int idMinuta) {
        this.idMinuta = idMinuta;
    }

    public String getProyecto() {
        return proyecto;
    }

    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getOrganizador() {
        return organizador;
    }

    public void setOrganizador(String organizador) {
        this.organizador = organizador;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Date getFechaReunion() {
        return fechaReunion;
    }

    public void setFechaReunion(Date fechaReunion) {
        this.fechaReunion = fechaReunion;
    }
}
