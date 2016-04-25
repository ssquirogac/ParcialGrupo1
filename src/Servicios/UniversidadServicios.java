/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import datos.Person;
import datos.Staff;
import datos.Universidad;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class UniversidadServicios {
    
    private Universidad universidad;

    public UniversidadServicios(){
        this.universidad = new Universidad();
    }
    
    public void cargarDatos() throws FileNotFoundException{
        Scanner lectura = new Scanner(new File("datos.txt"));
        lectura.useDelimiter(",");
        while(lectura.hasNext()){
            //Definir Tipo
            System.out.println(lectura.next());
        }
    }
    
    public ArrayList<Person> listarPersonas(){
        return this.universidad.getPersons();
    }
    
    public ArrayList<Staff> listarStaff(){
        return null;
    }
    
    public double salarioTotal(){
        double total=0;
        for(Person p : this.universidad.getPersons())
            total+= p.getSalario();
        return total;
    }
}
