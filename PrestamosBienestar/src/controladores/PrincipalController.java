/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author carlos
 */
public class PrincipalController implements Initializable {

    private PrestamosMain principal;
    private Stage stagePrincipal; 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    
    
public void setPrincipal(PrestamosMain principal) {
        this.principal = principal;
    }

    public void setStagePrincipal(Stage stagePrincipal) {
        this.stagePrincipal = stagePrincipal;
    }
    
    
    
}
