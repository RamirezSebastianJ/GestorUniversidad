
package com.war.gestoruniversidad;


public class Estudiante extends Persona{
    
    String facultad;

    public Estudiante(String nombre, String direccion, String campo, int tipo) {
        super(nombre, direccion, campo, tipo);
    }
 
    //Getters
    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public String getDireccion() {
        return this.direccion;
    }
    
    @Override
    public String getCampo() {
        return facultad;
    }

    @Override
    public int getRegistro() {
        return 0;
    }

    @Override
    public void setCampo(String campo){
        facultad = campo;
    }

    @Override
    public void setRegistro(int registro) {}

    @Override
    public int getTipo() {
        return this.tipo;
    }
 
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        