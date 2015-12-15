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
public class EstadoMulta {
    
    private int idEstadoMulta;
    private String nombre;
    
    public EstadoMulta(){}
    
    public EstadoMulta(int idEstadoMulta, String nombre){
        this.idEstadoMulta=idEstadoMulta;
        this.nombre=nombre;
    }

    /**
     * @return the idEstadoMulta
     */
    public int getIdEstadoMulta() {
        return idEstadoMulta;
    }

    /**
     * @param idEstadoMulta the idEstadoMulta to set
     */
    public void setIdEstadoMulta(int idEstadoMulta) {
        this.idEstadoMulta = idEstadoMulta;
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
    
}
