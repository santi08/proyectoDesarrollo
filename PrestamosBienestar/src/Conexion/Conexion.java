/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author carlos
 */
public class Conexion  {
    
String driver = "org.postgresql.Driver";
String connectString = "jdbc:postgresql://localhost:5432/BDprestamos";
String user = "postgres";
String password = "postgres";
Connection con;


public Conexion(){
    try{
        Class.forName(driver);
        con = DriverManager.getConnection(connectString, user , password);
    }catch(Exception e){
        JOptionPane.showMessageDialog(null,e.getMessage());
    }
}

public Connection getConexion(){
  return con;
}


public boolean ejecutarSql (String sql){
    boolean guardo = false;
    try{
            Statement stmt = con.createStatement();
            guardo  = stmt.execute(sql);
            stmt.close();
            con.close();
            
            System.out.println("ejecutar sql");
    
    }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
            System.out.println(" catch ejecutar sql");
    }
  
        return guardo;
}


public ResultSet ejecutarQuery(String sql){
   ResultSet rs = null;
    try{
  
        Statement stmt = con.createStatement();
        rs= stmt.executeQuery(sql);

        con.close();
        System.out.println("ejecutar query");
    }catch(Exception e){
         JOptionPane.showMessageDialog(null,e.getMessage());
         System.out.println("catch ejecutar qery");
    }
  
  return rs;
 
}

    
    
    
    
    
    
    
    
    
    
}
