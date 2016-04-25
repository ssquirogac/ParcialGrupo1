/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.Date;

/**
 *
 * @author Estudiante
 */
public abstract class Employee extends Person{
    
    private String oficina;
    private Date fechaContratacion;

    public Employee(String oficina, Date fechaContratacion, String nombre, String apellido, int salario) {
        super(nombre, apellido, salario);
        this.oficina = oficina;
        this.fechaContratacion = fechaContratacion;
    }

    public String getOficina() {
        return oficina;
    }

    public void setOficina(String oficina) {
        this.oficina = oficina;
    }

    public Date getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(Date fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }
}
