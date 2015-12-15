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
public class MultaArticulo extends Multa{
    
    private int idArticulo;
    
    public MultaArticulo(){}
    
    public MultaArticulo(int idMulta,int idEstadoMulta,int idTipoMulta,String codigo_cliente,int idPrestamo,String descripcion,
            int idArticulo){
    
    this.idMulta=idMulta;
    this.idEstadoMulta=idEstadoMulta;
    this.idTipoMulta=idTipoMulta;
    this.codigo_cliente=codigo_cliente;
    this.idPrestamo=idPrestamo;
    this.descripcion=descripcion;
    this.idArticulo=idArticulo;
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
}
