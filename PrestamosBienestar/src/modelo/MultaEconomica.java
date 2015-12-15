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
public class MultaEconomica extends Multa {

    private int cantidad_horas;
    private double valor;

    public MultaEconomica() {
    }

    public MultaEconomica(int idMulta, int idEstadoMulta, int idTipoMulta, String codigo_cliente, int idPrestamo, String descripcion,
            int cantidad_horas, double valor) {

        this.idMulta = idMulta;
        this.idEstadoMulta = idEstadoMulta;
        this.idTipoMulta = idTipoMulta;
        this.codigo_cliente = codigo_cliente;
        this.idPrestamo = idPrestamo;
        this.descripcion = descripcion;
        this.cantidad_horas = cantidad_horas;
        this.valor = valor;
    }

    /**
     * @return the cantidad_horas
     */
    public int getCantidad_horas() {
        return cantidad_horas;
    }

    /**
     * @param cantidad_horas the cantidad_horas to set
     */
    public void setCantidad_horas(int cantidad_horas) {
        this.cantidad_horas = cantidad_horas;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
