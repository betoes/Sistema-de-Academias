/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.fei.domain;

import java.sql.Date;

/**
 *
 * @author jethr
 */
public class AvanceProgramatico {
    
    private String claveNRC;
    private Date FechaCreación;
    private int Avance;
           
    public AvanceProgramatico() {
        
    }

    public String getClaveNRC() {
        return claveNRC;
    }

    public void setClaveNRC(String claveNRC) {
        this.claveNRC = claveNRC;
    }

    public Date getFechaCreación() {
        return FechaCreación;
    }

    public void setFechaCreación(Date FechaCreación) {
        this.FechaCreación = FechaCreación;
    }

    public int getAvance() {
        return Avance;
    }

    public void setAvance(int Avance) {
        this.Avance = Avance;
    }    
}
