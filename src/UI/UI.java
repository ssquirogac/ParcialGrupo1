/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Servicios.UniversidadServicios;
import datos.Person;
import datos.Staff;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class UI {
    
    public static void main(String arg[]) throws FileNotFoundException{
        UniversidadServicios servicios = new UniversidadServicios();
        Scanner seleccion = new Scanner(System.in);
        System.out.println("Opciones");
        System.out.println("1. Cargar. 2. Listar personas. 3. Salarios");
        int opcion = -1;
        boolean indicador = true;
        
        while(indicador){
            opcion = seleccion.nextInt();
            switch(opcion){
                case 1:
                    servicios.cargarDatos();
                break;
                case 2:
                    ArrayList<Person> persons = servicios.listarPersonas();
                    for(Person p : persons)
                        System.out.println(p);
                break;
                case 3:
                    ArrayList<Staff> staffs = servicios.listarStaff();
                    for(Staff s : staffs)
                        System.out.println(s);
                break;
                case 4:
                    
                break;
                default:
                    System.out.println("Opcion Invalida");
                    System.out.println("Baby... Haste un favor a ti misma y vacila con... Los Favoritos.... praaa");
            }
        }
    }
}
