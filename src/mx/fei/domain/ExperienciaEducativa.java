/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.fei.domain;

/**
 *
 * @author jethr
 */
public class ExperienciaEducativa {
    int idEE;
    String nombreEE;
    int creditosEE;
    
    public ExperienciaEducativa () {
        
    }
    
    public int getIdEE() {
        return idEE;
    }

    public void setIdEE(int idEE) {
        this.idEE = idEE;
    }

    public String getNombreEE() {
        return nombreEE;
    }

    public void setNombreEE(String nombreEE) {
        this.nombreEE = nombreEE;
    }

    public int getCreditosEE() {
        return creditosEE;
    }

    public void setCreditosEE(int creditosEE) {
        this.creditosEE = creditosEE;
    }
       
}
