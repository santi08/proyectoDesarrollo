/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUDS;

import Conexion.Conexion;
import controladores.ClienteController;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Cliente;
import modelo.TipoCliente;

/**
 *
 * @author carlos
 */
public class CRUDClientes {
    
    private String sql;
    private PreparedStatement preparar;
    private Connection tipoconexion;
    private Conexion conexion;
    private ResultSet resultado;
    
   
    public CRUDClientes(){
    conexion = new Conexion();
    }
    
    
    public CRUDClientes(String sql, PreparedStatement preparar,Connection tipoconexion, Conexion conexion){
      
       this.sql = sql;
       this.conexion = conexion;
       this.preparar =preparar;
       this.tipoconexion=tipoconexion;
    }
    
    
    public boolean registrarArticulo(Cliente cliente){

        String sql ="insert into tbclientes(codigo,primer_nombre,segundo_nombre,primer_apellido,segundo_apellido,correo,idtipo,plan,estado) "
                + "values('"+cliente.getCodigo()+"','"+cliente.getPrimer_nombre()+"','"+cliente.getSegundo_nombre()
                +"','"+cliente.getPrimer_apellido()+"','"+cliente.getSegundo_apellido()+"','"+cliente.getCorreo()
                +"',"+cliente.getIdTipo()+",'"+cliente.getPlan()+"',"+cliente.isEstado()+")";
        
        boolean exito= false;
        try{
            exito = conexion.ejecutarSql(sql);

        }catch(Exception e){

        }
         return exito;
}
    

    public String consultarCliente(String codigo){
        sql = "select * from usuario where idusuario='"+codigo+"'";
        String c = "";

        try{
            ResultSet resultado = conexion.ejecutarQuery(sql);
            while(resultado.next()){
          
            Cliente usuario = new Cliente();
            usuario.setPrimer_nombre(resultado.getString("nombre"));
            c = usuario.getPrimer_nombre();
        }


        }catch(Exception e){

        }
        return c;
    }
    
    
    
    
  public ArrayList<TipoCliente> traerTipos(){

        String  sql ="select * from tbtipocliente";
        System.out.println(sql);
        TipoCliente tipC = null;     
        ArrayList<TipoCliente> tipos = new ArrayList<TipoCliente>();
        try{
            ResultSet resultado = conexion.ejecutarQuery(sql);
            while(resultado.next()){
                
                tipC = new TipoCliente();
                tipC.setDescripcion(resultado.getString("descripcion"));
                tipC.setId(Integer.parseInt(resultado.getString("id")));
                
                tipos.add(tipC);
            }
        }catch(Exception e){
            System.out.println("no hace ni mierda");
        }
        return tipos;
    }
  
   public ArrayList<Cliente> listarCliente(){
    
   ArrayList listaCliente = new ArrayList();
   Cliente cliente;
   Conexion c= new Conexion();
    
        try {
            Connection acceBD = c.getConexion();
            PreparedStatement ps=  acceBD.prepareStatement("Select * from tbclientes");
            ResultSet rs= ps.executeQuery();
            
            while (rs.next()){
                cliente= new Cliente();
                cliente.setCodigo(rs.getString(1));
                cliente.setPrimer_nombre(rs.getString(2));
                cliente.setSegundo_nombre(rs.getString(3));
                cliente.setPrimer_apellido(rs.getString(4));
                cliente.setSegundo_apellido(rs.getString(5));
                cliente.setCorreo(rs.getString(6));
              //  cliente.setNombreTipo(Integer.parseInt(rs.getString(7)));
                cliente.setPlan(rs.getString(8));
                listaCliente.add(cliente);
                
            }
        } catch (Exception e) {
        }
        
        
   return listaCliente;
    }

   
  
  
  
  
}
    
    
    
   
    
    
    
    
    
    
    
    
    

