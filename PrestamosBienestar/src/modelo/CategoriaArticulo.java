/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author GUARIN
 */
public class CategoriaArticulo {
    
    private int idcategoria;
    private String nombre;
    private int maximo_horas_prestamo;
    
    public CategoriaArticulo(){}
    
    public CategoriaArticulo(int idcategoria, String nombre, int maximo_horas_prestamo ){
        this.idcategoria=idcategoria;
        this.nombre=nombre;
        this.maximo_horas_prestamo=maximo_horas_prestamo;
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
     * @return the maximo_horas_prestamo
     */
    public int getMaximo_horas_prestamo() {
        return maximo_horas_prestamo;
    }

    /**
     * @param maximo_horas_prestamo the maximo_horas_prestamo to set
     */
    public void setMaximo_horas_prestamo(int maximo_horas_prestamo) {
        this.maximo_horas_prestamo = maximo_horas_prestamo;
    }
    
    
}
