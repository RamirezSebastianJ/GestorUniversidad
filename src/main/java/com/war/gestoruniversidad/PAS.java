
package com.war.gestoruniversidad;

public class PAS extends Persona {
    
    int registro;
    String unidadAdministrativa;
    
    public PAS(String nombre, String direccion, String campo,int tipo) {
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
        return unidadAdministrativa;
    }
    
    @Override
    public int getRegistro() {
        return registro;
    }
    
    @Override
    public void setCampo(String campo){
        unidadAdministrativa = campo;
    }

    @Override
    public void setRegistro(int registro) {
        this.registro = registro;
    }
    
    @Override
    public int getTipo() {
        return this.tipo;
    }
        
}
