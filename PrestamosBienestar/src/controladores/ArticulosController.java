/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import CRUDS.CRUDArticulos;  
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javax.swing.JOptionPane;
import modelo.Articulo;
import modelo.CategoriaArticulo;

/**
 * FXML Controller class
 *
 * @author carlos
 */
public class ArticulosController implements Initializable {

    /**
     * Initializes the controller class.
     */
     private CRUDArticulos cruds;
     @FXML private TextField tfArtBuscar;
     @FXML private ComboBox cmbCategorias;
     @FXML private TextField tfNombreArticulo;
     @FXML private TextField tfMarca;
     @FXML private TextArea txaDescripcion;
     @FXML private RadioButton radbtnPrestable;
     @FXML private RadioButton radbtnNoPrestable;
     
     private ToggleGroup acceso = new ToggleGroup();
     private ArrayList<CategoriaArticulo> categorias;
    
     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       iniciarCategorias();
       iniciarAcceso();
    }    
     
    
    @FXML public void consultarArticulos(ActionEvent e){
            
        cruds = new CRUDArticulos();
        Articulo a ;
        ArrayList<Articulo> articulos = new ArrayList<Articulo>();
        
        try{
        articulos = cruds.consultar(tfArtBuscar.getText());
        
        for(int i =0; i < articulos.size(); i++){
             System.out.println(articulos.get(i).getNombre());
          
             System.out.println(articulos.get(i).getNombre());
        }
        
       
        //tfNombreArticulo.setText(a.getNombre());
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Error");
        }
       
    }
    
    @FXML public void registrarArticulo(ActionEvent e){
        Articulo art = new Articulo();
        cruds = new CRUDArticulos();
        boolean registrado;
        int indiceCategoria = cmbCategorias.getSelectionModel().getSelectedIndex() + 1;
        art.setNombre(tfNombreArticulo.getText());
        art.setMarca(tfMarca.getText());
        art.setDescripcion_estado(txaDescripcion.getText());
        art.setEstado(true);
        
        RadioButton chk = (RadioButton)acceso.getSelectedToggle();
        if(chk.getText().equals("Prestable"))art.setAcceso(true);
        else art.setAcceso(false);
        
        
        art.setIdcategoria(indiceCategoria);
        registrado = cruds.registrarArticulo(art);
        System.out.println(art.getIdcategoria()+ "" + art.isAcceso());
        
        if(registrado)JOptionPane.showMessageDialog(null, "algo salio mal menor");
        else JOptionPane.showMessageDialog(null, "se ha registrado con exito menor");
        
       
    }
    
    
    public void iniciarCategorias(){
        cruds = new CRUDArticulos();
        categorias = cruds.traerCategorias();
        for(int i=0;i<categorias.size();i++){
            cmbCategorias.getItems().add(categorias.get(i).getNombre());
        } 
    }
    
    public void iniciarAcceso(){
     radbtnPrestable.setToggleGroup(acceso);
     radbtnNoPrestable.setToggleGroup(acceso);
    }
    
    
    public void nuevo(ActionEvent e){
        tfMarca.setText("");
        tfNombreArticulo.setText("");
        txaDescripcion.setText("");
        
    }
    
    
}
