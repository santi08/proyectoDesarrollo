/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUDS;

import Conexion.Conexion;
import java.sql.ResultSet;
import java.util.ArrayList;
import modelo.Articulo;
import modelo.CategoriaArticulo;

/**
 *
 * @author carlos
 */
public class CRUDArticulos {
    
    Conexion conexion;
    public CRUDArticulos(){
        conexion = new Conexion();
        /*Prueba*/
    }
    
 
public boolean registrarArticulo(Articulo art){

        String sql ="insert into tbarticul0(nombre,marca,idcategoria,estado,acceso,descripcion_estado) "
                + "values('"+art.getNombre()+"'"+",'"+art.getMarca()+"',"+art.getIdcategoria()+","
                +art.isEstado()+","+art.isAcceso()+",'"+art.getDescripcion_estado()+"')";
        
        boolean exito= false;
        try{
            exito = conexion.ejecutarSql(sql);

        }catch(Exception e){

        }
         return exito;
}



public ArrayList<Articulo> consultar(String uname){

        String  sql ="select * from tbarticul where  nombre like '%"+uname+"%' or marca like '%"+uname+"%'";
        System.out.println(sql);
        Articulo art = null;     
        ArrayList<Articulo> articulos = new ArrayList<Articulo>();
        try{
            ResultSet resultado = conexion.ejecutarQuery(sql);
            while(resultado.next()){
                
                art = new Articulo();
                art.setNombre(resultado.getString("nombre"));
                art.setMarca(resultado.getString("marca"));
                art.setIdcategoria(Integer.parseInt(resultado.getString("idcategoria")));
                art.setEstado(Boolean.parseBoolean(resultado.getString("estado")));
                art.setAcceso(Boolean.parseBoolean(resultado.getString("acceso")));
                art.setDescripcion_estado(resultado.getString("descripcion_estado"));
                
                articulos.add(art);
            }
        }catch(Exception e){
            System.out.println("no hace ni mierda");
        }
        return articulos;
    }

public ArrayList<CategoriaArticulo> traerCategorias(){

        String  sql ="select * from tbcategorias";
        System.out.println(sql);
        CategoriaArticulo cat = null;     
        ArrayList<CategoriaArticulo> categorias = new ArrayList<CategoriaArticulo>();
        try{
            ResultSet resultado = conexion.ejecutarQuery(sql);
            while(resultado.next()){
                
                cat = new CategoriaArticulo();
                cat.setIdcategoria(Integer.parseInt(resultado.getString("idcategoria")));
                cat.setNombre(resultado.getString("nombre"));
                cat.setMaximo_horas_prestamo(Integer.parseInt(resultado.getString("maximo_horas_prestamo")));
                categorias.add(cat);
            }
        }catch(Exception e){
            System.out.println("no hace ni mierda");
        }
        return categorias;
    }

    
}
