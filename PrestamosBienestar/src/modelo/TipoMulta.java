/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author GUARIN,
 */
public class TipoMulta {
    
    private int idTipoMulta;
    private String nombre;
    
    public TipoMulta(){}
    
    public TipoMulta(int idTipoMulta, String nombre){
    this.idTipoMulta=idTipoMulta;
    this.nombre=nombre;
    }

    /**
     * @return the idTipoMulta
     */
    public int getIdTipoMulta() {
        return idTipoMulta;
    }

    /**
     * @param idTipoMulta the idTipoMulta to set
     */
    public void setIdTipoMulta(int idTipoMulta) {
        this.idTipoMulta = idTipoMulta;
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
