package mx.fei.dao;

import mx.fei.domain.Academico;
import mx.fei.datasource.DataBase;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AcademicoDAO implements ICoordinadorAcademicoDAO, IAcademicoDAO{

    ArrayList<Academico> listaAcademicos;
    private String query;
    private DataBase database = new DataBase();


    public AcademicoDAO(){

    }

    @Override
    public ArrayList<Academico> buscaAcademicosPorNombre(String nombre){
        listaAcademicos = new ArrayList<Academico>();
        query = "select * from academico where nombre like ?";
        database = DataBase.obtenerConexion();
        Academico academico = new Academico();
        try{
            PreparedStatement statement = DataBase.connection.prepareStatement(query);
            statement.setString(1, "%" + nombre + "%");
            ResultSet result = DataBase.executeQuery(statement);
            while(result.next()){
                academico.setMatricula(result.getString("Matricula"));
                academico.setNombre(result.getString("Nombre"));
                academico.setApellido(result.getString("Apellido"));
                academico.setCalleDireccion(result.getString("CalleDireccion"));
                academico.setColDireccion(result.getString("ColDireccion"));
                academico.setNumDireccion(result.getString("NumDireccion"));
                academico.setCorreoFacultativo(result.getString("CorreoFacultativo"));

                listaAcademicos.add(academico);
                academico = new Academico();
            }
        }catch(SQLException ex){
            Logger.getLogger(AcademicoDAO.class.getName()).log(Level.SEVERE,null,ex);
        }finally{
            DataBase.cerrarConexion();
        }

        return listaAcademicos;
    }
    @Override
    public ArrayList<Academico> obtenAcademicoPorMatricula(String matricula){
        listaAcademicos = new ArrayList<Academico>();
        query = "select * from academico where Matricula = ?";
        database = DataBase.obtenerConexion();
        Academico academico = new Academico();
        try{
            PreparedStatement statement = DataBase.connection.prepareStatement(query);
            statement.setString(1, "%" + matricula + "%");
            ResultSet result = DataBase.executeQuery(statement);
            while(result.next()){
                academico.setMatricula(result.getString("Matricula"));
                academico.setNombre(result.getString("Nombre"));
                academico.setApellido(result.getString("Apellido"));
                academico.setCalleDireccion(result.getString("CalleDireccion"));
                academico.setColDireccion(result.getString("ColDireccion"));
                academico.setNumDireccion(result.getString("NumDireccion"));
                academico.setCorreoFacultativo(result.getString("CorreoFacultativo"));

                listaAcademicos.add(academico);
                academico = new Academico();
            }
        }catch(SQLException ex){
            Logger.getLogger(AcademicoDAO.class.getName()).log(Level.SEVERE,null,ex);
        }finally{
            DataBase.cerrarConexion();
        }

        return listaAcademicos;
    }
    @Override
    public ArrayList<Academico> obtenerTodosAcademicos(){
        listaAcademicos = new ArrayList<Academico>();
        query = "select * from academico";
        database = DataBase.obtenerConexion();
        Academico academico = new Academico();
        try{
            PreparedStatement statement = DataBase.connection.prepareStatement(query);
            ResultSet result = DataBase.executeQuery(statement);
            while(result.next()){
                academico.setMatricula(result.getString("Matricula"));
                academico.setNombre(result.getString("Nombre"));
                academico.setApellido(result.getString("Apellido"));
                academico.setCalleDireccion(result.getString("CalleDireccion"));
                academico.setColDireccion(result.getString("ColDireccion"));
                academico.setNumDireccion(result.getString("NumDireccion"));
                academico.setCorreoFacultativo(result.getString("CorreoFacultativo"));

                listaAcademicos.add(academico);
                academico = new Academico();
            }
        }catch(SQLException ex){
            Logger.getLogger(AcademicoDAO.class.getName()).log(Level.SEVERE,null,ex);
        }finally{
            DataBase.cerrarConexion();
        }

        return listaAcademicos;
    }
    @Override
    public boolean agregaAcademico(Academico academico){
        boolean academicoAgregado = false;
        database = DataBase.obtenerConexion();
        query = "insert into Academico (idAcademico, Nombre, CalleDireccion, ColDireccion, NumDireccion, CorreoFacultativo, FechaNacimiento, Administrador) " +
                "values (?, ?, ?, ?, ?, ?, ?, ?)";
        try{
            PreparedStatement statement = DataBase.connection.prepareStatement(query);
            statement.setString(1, academico.getMatricula());
            statement.setString(2, academico.getNombre());
            statement.setString(3, academico.getCalleDireccion());
            statement.setString(4, academico.getColDireccion());
            statement.setString(5, academico.getNumDireccion());
            statement.setString(6, academico.getCorreoFacultativo());
            Date fechaNacimiento = new Date(academico.getFechaNacimiento().getDate());
            statement.setDate(7, fechaNacimiento);
            statement.setString(8, academico.getAdministrador());

            academicoAgregado = DataBase.executeUpdate(statement);
        }catch(SQLException ex){
            Logger.getLogger(AcademicoDAO.class.getName()).log(Level.SEVERE,null,ex);
        }
        return academicoAgregado;
    }
    @Override
    public boolean eliminaAcademico(String matricula){
        boolean academicoEliminado = false;
        database = DataBase.obtenerConexion();
        query = "delete from Academico where Matricula = ?";

        try{
            PreparedStatement statement = DataBase.connection.prepareStatement(query);
            statement.setString(1, matricula);
            academicoEliminado = DataBase.executeUpdate(statement);
        }catch(SQLException ex){
            Logger.getLogger(AcademicoDAO.class.getName()).log(Level.SEVERE,null,ex);
        }
        return academicoEliminado;
    }
    @Override
    public ArrayList<Academico> buscaCoordinadorPorNombre(String nombre){

    }
    @Override
    public ArrayList<Academico> obtenCoordinadorPorMatricula(String matricula){

    }
    @Override
    public ArrayList<Academico> obtenerCoordinadores(){

    }
    @Override
    public boolean asignarCoordinador(String matricula, int idAcademia){

    }
    @Override
    public boolean cambiarCoordinador(String matricula, int idAcademia){

    }

}
