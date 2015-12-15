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
public class Multa {
    
    int idMulta;
    int idEstadoMulta;
    int idTipoMulta;
    String codigo_cliente;
    int idPrestamo;
    String descripcion;
    
    public Multa(){}
    
    public Multa(int idMulta,int idEstadoMulta,int idTipoMulta,String codigo_cliente,int idPrestamo,String descripcion){
    
    this.idMulta=idMulta;
    this.idEstadoMulta=idEstadoMulta;
    this.idTipoMulta=idTipoMulta;
    this.codigo_cliente=codigo_cliente;
    this.idPrestamo=idPrestamo;
    this.descripcion=descripcion;
    }

    /**
     * @return the idMulta
     */
    public int getIdMulta() {
        return idMulta;
    }

    /**
     * @param idMulta the idMulta to set
     */
    public void setIdMulta(int idMulta) {
        this.idMulta = idMulta;
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
     * @return the codigo_cliente
     */
    public String getCodigo_cliente() {
        return codigo_cliente;
    }

    /**
     * @param codigo_cliente the codigo_cliente to set
     */
    public void setCodigo_cliente(String codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }

    /**
     * @return the idPrestamo
     */
    public int getIdPrestamo() {
        return idPrestamo;
    }

    /**
     * @param idPrestamo the idPrestamo to set
     */
    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
