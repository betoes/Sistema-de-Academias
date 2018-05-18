package mx.fei.datasource;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataBase {

    public static Connection connection;
    public static DataBase database;

    public DataBase(){

    }

    static Properties prop = new Properties();

    private static void establecerConexion(){
        try {
            prop.load(new FileReader("configuracion.properties"));
        } catch (IOException e) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, e);
        }
        String url = "jdbc:mysql//" + prop.getProperty("servidor") + "/";
        String usuario = prop.getProperty("usuario");
        String contraseña = prop.getProperty("contraseña");
        String bd = prop.getProperty("bd");
        try {
            connection = DriverManager.getConnection(url+bd, usuario, contraseña);
        } catch (SQLException e) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, e);
        } finally{
            cerrarConexion();
        }
    }

    public static DataBase obtenerConexion(){
        if(database == null){
            database = new DataBase();
        }
        establecerConexion();
        return database;
    }

    public static void cerrarConexion(){
        if(connection != null){
            try{
                if(!connection.isClosed()){
                    connection.close();
                }
            }catch(SQLException ex){
                java.util.logging.Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static ResultSet executeQuery(PreparedStatement statement) throws SQLException {
        return statement.executeQuery();
    }

    public static Boolean executeUpdate(PreparedStatement statement) throws SQLException {
        return statement.executeUpdate() == 0;
    }
}
