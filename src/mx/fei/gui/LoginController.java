/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.fei.gui;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author adolf
 */
public class LoginController implements Initializable {

    @FXML
    private JFXButton botonRegresar;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    public void cerrarVentana(ActionEvent evento){
        Stage stage = (Stage) botonRegresar.getScene().getWindow();
        stage.close();
    }
    
}
