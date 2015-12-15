/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author carlos
 */
public class LoginController implements Initializable {

    private PrestamosMain principal;
    
    /**
     * Initializes the controller class.
     */
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void ingresar(ActionEvent e){
     
        principal.mostrarVentanaPrincipal();
        
        
    }
   

    public void setPrincipal(PrestamosMain principal) {
        this.principal = principal;
    }
}
