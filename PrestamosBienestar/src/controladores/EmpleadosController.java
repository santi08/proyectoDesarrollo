/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import CRUDS.CRUDEmpleados;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import modelo.Rol;


/**
 * FXML Controller class
 *
 * @author carlos
 */
public class EmpleadosController implements Initializable {
    private CRUDEmpleados cruds;
     ArrayList<Rol> roles ;
    @FXML ComboBox cmbRoles;
    @FXML TextField tfCedula;
    @FXML TextField tfPrimerNombre;
    @FXML TextField tfSegundoNombre;       
    @FXML TextField tfPrimerApellido;
    @FXML TextField tfSegundoApellido;
    @FXML TextField tfCargo;
    @FXML TextField tfCorreo;       
    @FXML TextField pssFContrasenia;
    @FXML Label lblContrasenia;
    
            
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       cargarRoles();
        //System.out.println(cmbRoles.getItems().get(0).toString());
        
        
        //activarContrasenia();
    }    
    public void cargarRoles(){
       cruds = new CRUDEmpleados();
       roles = cruds.cargarRoles();
       for(int i=0;i<roles.size();i++){
           cmbRoles.getItems().add(roles.get(i).getDescripcion());
       }   
    }
    
    public void activarContrasenia(){
           pssFContrasenia.setVisible(false);
           lblContrasenia.setVisible(false);
           if(cmbRoles.getSelectionModel().getSelectedItem().equals("administrador")){
           pssFContrasenia.setVisible(true);
           lblContrasenia.setVisible(true);  
           }
     }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
