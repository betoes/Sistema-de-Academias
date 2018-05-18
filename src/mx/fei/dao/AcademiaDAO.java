/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.fei.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.fei.DS.DataBase;
import mx.fei.domain.Academia;
/**
 *
 * @author jethr
 */
public class AcademiaDAO implements IAcademiaDAO {
    private ArrayList<Academia> listaAcademias;
    private Academia academia;
    private String query;
    private Connection connection;
    
    public AcademiaDAO(){
    }

    @Override
    public List<Academia> obtenerTodasLasAcademias() {
        listaAcademias = new ArrayList<>();
        query = "Select * from academia";
        connection = (Connection) DataBase.getDataBaseConnection();
        
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet result = statement.executeQuery();
            
            while(result.next()) {
                academia = new Academia();
                academia.setIdAcademia(result.getInt("idAcademia"));
                academia.setNombre(result.getString("nombre"));
                
                listaAcademias.add(academia);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AcademiaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DataBase.closeConnection();
        }
        
        return listaAcademias;
    }

    @Override
    public List<Academia> buscarAcademiaPorNombre(String nombre) {
        listaAcademias = new ArrayList<>();
        query = "select ¨* from academia where nombre like ?";
        connection=(Connection) DataBase.getDataBaseConnection();
        
        try {
            PreparedStatement statement=connection.prepareStatement(query);
            statement.setString(1,"%"+nombre+"%");
            ResultSet result = statement.executeQuery();
            
            while(result.next()) {
                academia = new Academia();
                academia.setNombre(result.getString("nombre"));
                listaAcademias.add(academia);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AcademiaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DataBase.closeConnection();
        }
        
        return listaAcademias;
    }

    @Override
    public Academia obtenerAcademiaPorId(int idAcademia) {
        academia = new Academia();
        query = "Select * from academia.idAcademia = idAcademia";
        connection = (Connection) DataBase.getDataBaseConnection();
        
        try { 
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet result = statement.executeQuery();
            while(result.next()) {
                academia.setIdAcademia(result.getInt("idAcademia"));
                academia.setNombre(result.getString("nombre"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AcademiaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DataBase.closeConnection();
        }
        
        return academia;
    }

    @Override
    public boolean agregarAcademia(Academia academia) {
       boolean agregado = false;
       query = "insert into academia value (?,?)";
       connection = (Connection) DataBase.getDataBaseConnection();
       
       try {
           PreparedStatement statement = connection.prepareStatement(query);
           statement.setInt(1, academia.getIdAcademia());
           statement.setString(2, academia.getNombre());
          
           statement.execute();
           agregado = true;
           
       } catch (SQLException ex) {
            Logger.getLogger(AcademiaDAO.class.getName()).log(Level.SEVERE, null, ex);
       } finally {
         DataBase.closeConnection();
       }
       return agregado;
    }

    @Override
    public boolean eliminarAcademia(int idAcademia) {
        boolean eliminado= false; 
        query = "Delete from academia where idAcademia = ?";
        connection = (Connection) DataBase.getDataBaseConnection();
        
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, idAcademia);
            statement.execute();
            eliminado = true;
        } catch (SQLException ex) {
            Logger.getLogger(AcademiaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DataBase.closeConnection();
        }
        
        return eliminado;
    }
   
 
}

