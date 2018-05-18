/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.fei.dao;

import java.util.List;
import mx.fei.domain.Academia;

/**
 *
 * @author jethr
 */
public interface IAcademiaDAO {
    List<Academia> obtenerTodasLasAcademias();
    List<Academia> buscarAcademiaPorNombre(String nombre);
    Academia obtenerAcademiaPorId(int idAcademia);
    boolean agregarAcademia(Academia academia);
    boolean eliminarAcademia(int idAcademia);
    
}
