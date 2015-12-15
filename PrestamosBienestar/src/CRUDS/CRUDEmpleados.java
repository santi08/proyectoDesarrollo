/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUDS;

import Conexion.Conexion;
import java.sql.ResultSet;
import java.util.ArrayList;

import modelo.Rol;

/**
 *
 * @author carlos
 */
public class CRUDEmpleados {
     Conexion conexion;
    
    public CRUDEmpleados(){
        conexion = new Conexion();
    }
    
    
    
    
    
    
    
    
    
    
public  ArrayList<Rol> cargarRoles(){

    String  sql ="select * from tbrol";
        System.out.println(sql);
        Rol rol = null;     
        ArrayList<Rol> roles = new ArrayList<Rol>();
        try{
            ResultSet resultado = conexion.ejecutarQuery(sql);
            while(resultado.next()){
                
                rol = new Rol();
                rol.setDescripcion(resultado.getString("descripcion"));
                rol.setId(Integer.parseInt(resultado.getString("id")));
                roles.add(rol);
                
            }
        }catch(Exception e){
            System.out.println("no hace ni mierda");
        }
        return roles;
    
    
}
    
    
    
    
    
    
}











