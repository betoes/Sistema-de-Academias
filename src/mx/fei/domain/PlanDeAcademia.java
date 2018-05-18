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
public class PlanDeAcademia {
    private int idPlanDeAcademia;
    private String acuerdos;
    private Date fechaCreacion;
    private Date fechaAprobación;
            
    public PlanDeAcademia() {
        
    }        

    public int getIdPlanDeAcademia() {
        return idPlanDeAcademia;
    }

    public void setIdPlanDeAcademia(int idPlanDeAcademia) {
        this.idPlanDeAcademia = idPlanDeAcademia;
    }

    public String getAcuerdos() {
        return acuerdos;
    }

    public void setAcuerdos(String acuerdos) {
        this.acuerdos = acuerdos;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaAprobación() {
        return fechaAprobación;
    }

    public void setFechaAprobación(Date fechaAprobación) {
        this.fechaAprobación = fechaAprobación;
    }
    
    
    
}
