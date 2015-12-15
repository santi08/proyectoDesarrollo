/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import controladores.LoginController;
import controladores.PrincipalController;

/**
 *
 * @author carlos
 */
public class PrestamosMain extends Application {

    private Stage stagePrincipal;
    private AnchorPane rootPane;

    @Override
    public void start(Stage stagePrincipal) throws Exception {
        this.stagePrincipal = stagePrincipal;
        //mostrarVentanaPrincipal();
        mostrarVentanaLogin();

        /*this.stagePrincipal = stagePrincipal;
        Parent root = FXMLLoader.load(getClass().getResource("Principal.fxml"));
        
        Scene scene = new Scene(root);
        
        stagePrincipal.setScene(scene);
        stagePrincipal.show();
         */
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    public void mostrarVentanaLogin() {
        try {
            FXMLLoader loader = new FXMLLoader(PrestamosMain.class.getResource("/Vista/Login.fxml"));
            rootPane = (AnchorPane) loader.load();
            Scene scene = new Scene(rootPane);
            stagePrincipal.setTitle("Ventana Principal");
            stagePrincipal.setResizable(false);
            stagePrincipal.setScene(scene);
            LoginController controllerlogin = loader.getController();
            controllerlogin.setPrincipal(this);
            stagePrincipal.show();
        } catch (IOException e) {
            //tratar la excepción.
        }
    }

    public void mostrarVentanaPrincipal() {
        try {
            FXMLLoader loader = new FXMLLoader(PrestamosMain.class.getResource("/Vista/Principal.fxml"));
            rootPane = (AnchorPane) loader.load();
            Scene scene = new Scene(rootPane);
            stagePrincipal.setTitle("Ventana Principal");
            stagePrincipal.setResizable(false);
            stagePrincipal.setScene(scene);
            PrincipalController controller = loader.getController();
            controller.setPrincipal(this);
            stagePrincipal.show();
        } catch (Exception e) {
            //tratar la excepción
        }
          
    }

}
