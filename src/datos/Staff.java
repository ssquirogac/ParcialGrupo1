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
public class Staff extends Employee{
    
    private String titulo;

    public Staff(String titulo, String oficina, Date fechaContratacion, String nombre, String apellido, int salario) {
        super(oficina, fechaContratacion, nombre, apellido, salario);
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
