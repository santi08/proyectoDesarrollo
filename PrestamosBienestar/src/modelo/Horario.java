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
public class Horario {
    
    private int idHorario;
    private Date dia;
    private Date hora_inicio;
    private Date hora_inicio_receso;
    private Date hora_fin_receso;
    private Date hora_fin;
    
    
    public Horario(){}
    
    public Horario( int idHorario, Date dia,Date hora_inicio, Date hora_inicio_receso,Date hora_fin_receso,Date hora_fin){
    this.idHorario=idHorario;
    this.hora_inicio=hora_inicio;
    this.hora_inicio_receso=hora_inicio_receso;
    this.hora_fin_receso=hora_fin_receso;
    this.hora_fin=hora_fin;
    
    
    }

    /**
     * @return the idHorario
     */
    public int getIdHorario() {
        return idHorario;
    }

    /**
     * @param idHorario the idHorario to set
     */
    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }

    /**
     * @return the dia
     */
    public Date getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(Date dia) {
        this.dia = dia;
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
     * @return the hora_inicio_receso
     */
    public Date getHora_inicio_receso() {
        return hora_inicio_receso;
    }

    /**
     * @param hora_inicio_receso the hora_inicio_receso to set
     */
    public void setHora_inicio_receso(Date hora_inicio_receso) {
        this.hora_inicio_receso = hora_inicio_receso;
    }

    /**
     * @return the hora_fin_receso
     */
    public Date getHora_fin_receso() {
        return hora_fin_receso;
    }

    /**
     * @param hora_fin_receso the hora_fin_receso to set
     */
    public void setHora_fin_receso(Date hora_fin_receso) {
        this.hora_fin_receso = hora_fin_receso;
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
    
    
    
    
}
