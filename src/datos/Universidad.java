/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Universidad {
    
    protected ArrayList<Person> persons;

    public ArrayList<Person> getPersons() {
        return persons;
    }
    
    public void addPersons(Person person){
        this.persons.add(person);
    }
}
