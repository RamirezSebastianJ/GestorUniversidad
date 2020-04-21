
package com.war.gestoruniversidad;


public class PersonaFactory implements PersonaFactoryMethod{
    public Persona createPersona(String nombre, String direccion, String campo, int tipo){
        switch(tipo){
            case 1:
                return new Estudiante (nombre, direccion,campo, tipo);
            case 2:
                return new Docente (nombre, direccion,campo, tipo);
            case 3:
                return new PAS (nombre, direccion,campo, tipo);
            default:
                return null;
        }
     
    }

   
}
