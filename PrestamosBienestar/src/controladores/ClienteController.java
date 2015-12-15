/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import CRUDS.CRUDClientes;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.TipoCliente;
import org.controlsfx.control.Notifications;


/**
 * FXML Controller class
 *
 * @author carlos
 */
public class ClienteController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML private TextField tfPrimerNombre;
    @FXML private TextField tfSegundoNombre;
    @FXML private TextField tfPrimerApellido;
    @FXML private TextField tfSegundoApellido; 
    @FXML private TextField tfCorreo;
    @FXML private TextField tfPlan;
    @FXML private TextField tfCodigo;
    @FXML private TextField tfCodigoBuscar;
    @FXML private ComboBox cmbTipoCliente;
    private CRUDClientes cruds;
    private ArrayList<TipoCliente>tipoClientes;
    public Alert alert = new Alert(Alert.AlertType.ERROR);
    
    Cliente cliente;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        cargarTipos();
    }    
    

    
    
    @FXML public void registrarCliente(ActionEvent e){
        cliente = new Cliente();
        cruds = new  CRUDClientes();
        boolean exito;
        
        cliente.setPrimer_nombre(tfPrimerNombre.getText());
        cliente.setSegundo_nombre(tfSegundoNombre.getText());
        cliente.setPrimer_apellido(tfPrimerApellido.getText());
        cliente.setSegundo_apellido(tfSegundoApellido.getText());
        cliente.setCodigo(tfCodigo.getText());
        cliente.setCorreo(tfCorreo.getText());
        cliente.setEstado(true);
        cliente.setNombreTipo(cmbTipoCliente.getSelectionModel().getSelectedItem().toString() );
        cliente.setIdTipo(cmbTipoCliente.getSelectionModel().getSelectedIndex()+1);
        cliente.setPlan(tfPlan.getText());
        cliente.setTelefono("");
        
        exito = cruds.registrarArticulo(cliente);
        
        if(exito)CambiarVentana("algo salio mal en el registro");
        else notificacion("EL CLIENTE HA SIDO REGISTRADO");
    }
    
    
     @FXML public void nuevo(ActionEvent e){
        tfCodigo.setText("");
        tfPrimerApellido.setText("");
        tfCorreo.setText("");
        tfPrimerNombre.setText("");
        tfPlan.setText("");
        tfSegundoApellido.setText("");
        tfSegundoNombre.setText("");  
    }
     
    @FXML public void buscarCliente(ActionEvent e){
        
        
        
    }
     
     
    private void notificacion(String s) {       
        Notifications notificationBuilder = 
                Notifications.create()
                .title("REGISTRO EXITOSO")
                .text(s)
                .hideAfter(javafx.util.Duration.seconds(7))
                .position(Pos.TOP_RIGHT);
                notificationBuilder.showInformation();
    }
    
     
    
      
    public void CambiarVentana(String s){
        alert.setHeaderText(s);
        alert.showAndWait();
    }
    
 public void cargarTipos(){
     cruds =  new CRUDClientes();
     tipoClientes = cruds.traerTipos();
     for(int i=0;i<tipoClientes.size();i++){
         cmbTipoCliente.getItems().add(tipoClientes.get(i).getDescripcion());
     }    
 }   
    
    
    
 public void mensaje(){
     
 }   
    
}
