/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import CRUDS.CRUDArticulos;
import java.util.ArrayList;

/**
 *
 * @author GUARIN
 */
public class Articulo {

   private int idArticulo;
   private String nombre;
   private String marca;
   private int idcategoria;
   private boolean estado;
   private boolean acceso;
   private String descripcion_estado;
   
   public Articulo(){}
   
   public Articulo(String nombre, String marca,int idcategoria,boolean estado,boolean acceso, String descripcion_estado){
   this.nombre=nombre;
   this.marca=marca;
   this.idcategoria=idcategoria;
   this.estado=estado;
   this.acceso=acceso;
   this.descripcion_estado=descripcion_estado;
   
   }

    /**
     * @return the idArticulo
     */
    public int getIdArticulo() {
        return idArticulo;
    }

    /**
     * @param idArticulo the idArticulo to set
     */
    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the idcategoria
     */
    public int getIdcategoria() {
        return idcategoria;
    }

    /**
     * @param idcategoria the idcategoria to set
     */
    public void setIdcategoria(int idcategoria) {
        this.idcategoria = idcategoria;
    }

    /**
     * @return the estado
     */
    public boolean isEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    /**
     * @return the acceso
     */
    public boolean isAcceso() {
        return acceso;
    }

    /**
     * @param acceso the acceso to set
     */
    public void setAcceso(boolean acceso) {
        this.acceso = acceso;
    }

    /**
     * @return the descripcion_estado
     */
    public String getDescripcion_estado() {
        return descripcion_estado;
    }

    /**
     * @param descripcion_estado the descripcion_estado to set
     */
    public void setDescripcion_estado(String descripcion_estado) {
        this.descripcion_estado = descripcion_estado;
    }
    
    
     
   

    
}
