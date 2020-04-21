
package com.war.gestoruniversidad;


public abstract class Persona {
    String nombre;
    String direccion;
    String campo;
    int registro;
    int tipo;
    
    public Persona(String nombre, String direccion, String campo,int tipo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.campo = campo;
        this.tipo = tipo;
    }
    
    
    //Getters
    public abstract String getNombre();
    public abstract String getDireccion();
    public abstract String getCampo();
    public abstract int getRegistro();
    public abstract int getTipo();
    
    //Setters
    public abstract void setCampo(String campo);
    public abstract void setRegistro(int registro);
    
    
    
}
