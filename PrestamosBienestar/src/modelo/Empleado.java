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
public class Empleado {

    private String cedula;
    private String primer_nombre;
    private String segundo_nombre;
    private String primer_apellido;
    private String segundo_apellido;
    private String cargo;
    private int idrol;
    private boolean estado;
    private String correo;

    public Empleado() {
    }

    public Empleado(String cedula, String primer_nombre, String segundo_nombre, String primer_apellido,
            String segundo_apellido, String cargo, int idrol, boolean estado, String correo) {

        this.cedula = cedula;
        this.primer_nombre=primer_nombre;
        this.segundo_nombre=segundo_nombre;
        this.primer_apellido=primer_apellido;
        this.segundo_apellido=segundo_apellido;
        this.cargo=cargo;
        this.idrol=idrol;
        this.estado=estado;
        this.correo=correo;

    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the primer_nombre
     */
    public String getPrimer_nombre() {
        return primer_nombre;
    }

    /**
     * @param primer_nombre the primer_nombre to set
     */
    public void setPrimer_nombre(String primer_nombre) {
        this.primer_nombre = primer_nombre;
    }

    /**
     * @return the segundo_nombre
     */
    public String getSegundo_nombre() {
        return segundo_nombre;
    }

    /**
     * @param segundo_nombre the segundo_nombre to set
     */
    public void setSegundo_nombre(String segundo_nombre) {
        this.segundo_nombre = segundo_nombre;
    }

    /**
     * @return the primer_apellido
     */
    public String getPrimer_apellido() {
        return primer_apellido;
    }

    /**
     * @param primer_apellido the primer_apellido to set
     */
    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    /**
     * @return the segundo_apellido
     */
    public String getSegundo_apellido() {
        return segundo_apellido;
    }

    /**
     * @param segundo_apellido the segundo_apellido to set
     */
    public void setSegundo_apellido(String segundo_apellido) {
        this.segundo_apellido = segundo_apellido;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the idrol
     */
    public int getIdrol() {
        return idrol;
    }

    /**
     * @param idrol the idrol to set
     */
    public void setIdrol(int idrol) {
        this.idrol = idrol;
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
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    

}
