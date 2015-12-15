/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author GUARIN
 */
public class Prestamo {
    
    private int idPrestamo;
    private String codigo_cliente;
    private Date fecha_inicio;
    private Date hora_inicio;
    private Date fecha_fin;
    private Date hora_fin;
    private String cedulaEmpleado;
    private boolean estado;
    
    public Prestamo (){}
    
    public Prestamo(int idPrestamo, String codigo_cliente, Date fecha_inicio, Date hora_inicio,Date fecha_fin,
            Date hora_fin, String cedulaEmpleado, boolean estado){
    
        this.idPrestamo=idPrestamo;
        this.codigo_cliente=codigo_cliente;
        this.fecha_inicio=fecha_inicio;
        this.hora_inicio=hora_inicio;
        this.fecha_fin=fecha_fin;
        this.hora_fin=hora_fin;
        this.cedulaEmpleado=cedulaEmpleado;
        this.estado=estado;
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
     * @return the fecha_inicio
     */
    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    /**
     * @param fecha_inicio the fecha_inicio to set
     */
    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    /**
     * @return the hora_inicio
     */
    public Date getHora_inicio() {
        return hora_inicio;
    }

    /**
     * @param hora_inicio the hora_inicio to set
     */
    public void setHora_inicio(Date hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    /**
     * @return the fecha_fin
     */
    public Date getFecha_fin() {
        return fecha_fin;
    }

    /**
     * @param fecha_fin the fecha_fin to set
     */
    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    /**
     * @return the hora_fin
     */
    public Date getHora_fin() {
        return hora_fin;
    }

    /**
     * @param hora_fin the hora_fin to set
     */
    public void setHora_fin(Date hora_fin) {
        this.hora_fin = hora_fin;
    }

    /**
     * @return the cedulaEmpleado
     */
    public String getCedulaEmpleado() {
        return cedulaEmpleado;
    }

    /**
     * @param cedulaEmpleado the cedulaEmpleado to set
     */
    public void setCedulaEmpleado(String cedulaEmpleado) {
        this.cedulaEmpleado = cedulaEmpleado;
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
    
    
    
    
}
