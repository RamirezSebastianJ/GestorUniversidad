
package com.war.gestoruniversidad;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    //Atributos Principales
    public static PersonaFactoryMethod factory =  new PersonaFactory();
    public static ArrayList<Persona> universitarios = new ArrayList<Persona>();
    

    //Atributos Auxiliares
    public static int opcion;
    public static String nombre;
    public static String direccion;
    public static String cadenaAuxiliar;
    public static Persona auxiliar;
    public static Scanner entrada = new Scanner(System.in);
    
    public static void MenuPrincipal() {
        int enteroAuxiliar;
        
        System.out.println("Que desea hacer?"
            + "\n1. Registrar Universitario"
            + "\n2. Buscar Universitario"
            + "\n3. Eliminar Universitario"
            + "\n4. SALIR"
            );
        opcion = entrada.nextInt();
        
        switch(opcion){
            case 1:
                System.out.println("Tipo de Universitario: "
                    + "\n1. Estudiante"
                    + "\n2. Empleado"
                    );
                entrada.nextLine();
                opcion = entrada.nextInt();
                if(opcion == 1){
                    menuRegistrarEstudiante();
                }else{
                    if(opcion == 2){
                        menuRegistrarEmpleado();
                    }else
                        System.out.println("\nOpcion Incorrecta");
                } 

                break;
            case 2:
                System.out.println("Tipo de Universitario: "
                    + "\n1. Estudiante"
                    + "\n2. Docente"
                    + "\n3. PAS"
                    );
                entrada.nextLine();
                opcion = entrada.nextInt();
                
                switch(opcion){
                    case 1:
                        cadenaAuxiliar = "Facultad";
                        System.out.println("Nombre: ");
                        entrada.nextLine();
                        nombre = entrada.nextLine();

                        
                        for(enteroAuxiliar = 0;enteroAuxiliar < universitarios.size(); enteroAuxiliar++){
                            auxiliar = universitarios.get(enteroAuxiliar);
                            if(opcion == auxiliar.getTipo()){
                                if(nombre.equals(auxiliar.getNombre())){
                                    System.out.println(
                                        "Nombre: " + auxiliar.getNombre()
                                        + "Direccion: " + auxiliar.getNombre()
                                        + cadenaAuxiliar + auxiliar.getCampo()
                                    );
                                    
                                    enteroAuxiliar = universitarios.size() + 1;
                                }
                            }
                        }
                        if(enteroAuxiliar != universitarios.size() + 1){
                            System.out.println("usuario no encontrado" );
                        }
                        break;
                        
                    case 2:
                        cadenaAuxiliar = "Departamento";
                        System.out.println("Nombre: ");
                        entrada.nextLine();
                        nombre = entrada.nextLine();

                        
                        for( enteroAuxiliar = 0;enteroAuxiliar < universitarios.size(); enteroAuxiliar++){
                            auxiliar = universitarios.get(enteroAuxiliar);
                            if(opcion == auxiliar.getTipo()){
                                if(nombre.equals(auxiliar.getNombre())){
                                    System.out.println(
                                        "Nombre: " + auxiliar.getNombre()
                                        + "Direccion: " + auxiliar.getNombre()
                                        + cadenaAuxiliar + auxiliar.getCampo()
                                        + "Registro" + auxiliar.getRegistro()
                                    );
                                    enteroAuxiliar = universitarios.size() + 1;
                                }
                            }
                        }
                        if(enteroAuxiliar != universitarios.size() + 1){
                            System.out.println("usuario no encontrado" );
                        }
                        break;
                    case 3:
                        cadenaAuxiliar = "Unidad Administrativa";
                        System.out.println("Nombre: ");
                        entrada.nextLine();
                        nombre = entrada.nextLine();

                        
                        for( enteroAuxiliar = 0;enteroAuxiliar < universitarios.size(); enteroAuxiliar++){
                            auxiliar = universitarios.get(enteroAuxiliar);
                            if(opcion == auxiliar.getTipo()){
                                if(nombre.equals(auxiliar.getNombre())){
                                    System.out.println(
                                        "Nombre: " + auxiliar.getNombre()
                                        + "Direccion: " + auxiliar.getNombre()
                                        + cadenaAuxiliar + auxiliar.getCampo()
                                        + "Registro" + auxiliar.getRegistro()
                                    );
                                    enteroAuxiliar = universitarios.size() + 1;
                                }
                            }
                        }
                        if(enteroAuxiliar != universitarios.size() + 1){
                            System.out.println("usuario no encontrado" );
                        }
                        break;
                }        

                break;
            case 3:
                System.out.println("Tipo de Universitario: "
                    + "\n1. Estudiante"
                    + "\n2. Docente"
                    + "\n3. PAS"
                    );
                entrada.nextLine();
                opcion = entrada.nextInt();
                
                System.out.println("Nombre: ");
                entrada.nextLine();
                nombre = entrada.nextLine();

                enteroAuxiliar = universitarios.size();

                for(int i = 0;i < universitarios.size(); i++){
                    auxiliar = universitarios.get(i);
                    if(opcion == auxiliar.getTipo()){
                        if(nombre.equals(auxiliar.getNombre())){
                            universitarios.remove(i);
                            i = universitarios.size() + 1;
                        }
                    }
                }

                if(enteroAuxiliar != universitarios.size()){
                    System.out.println("eliminación correcta");
                }else{
                    System.out.println("El universitario no existe");
                }
      
                break;
            
            case 4: 
                System.exit(0);
                break;
                
            default:
                System.out.println("\nOpcion Incorrecta");
        }
        
        
    }
    
    public static void menuRegistrarEstudiante(){
        
        System.out.println("Nombre: ");
        entrada.nextLine();
        nombre = entrada.nextLine();
        
        System.out.println("Direccion");
        direccion = entrada.nextLine();
        
        System.out.println("Facultad");
        cadenaAuxiliar = entrada.nextLine();
        
        auxiliar = factory.createPersona(nombre, direccion, cadenaAuxiliar, 1);
        universitarios.add(auxiliar);
        auxiliar = null;
        
        System.out.println("\nEl estudiante ha sido Registrado");
        
    }
    
    public static void menuRegistrarEmpleado(){
        System.out.println("Tipo empleado?"
            + "\n1.Docente"
            + "\n2. Personal de administración y servicios (PAS)"
            );

        opcion = entrada.nextInt();
        
        switch(opcion){
            case 1:
                
                System.out.println("Nombre: ");
                entrada.nextLine();
                nombre = entrada.nextLine();

                System.out.println("Direccion");
                direccion = entrada.nextLine();

                System.out.println("Departamento");
                cadenaAuxiliar = entrada.nextLine();

                auxiliar = factory.createPersona(nombre, direccion, cadenaAuxiliar, 2);
                universitarios.add(auxiliar);
                auxiliar = null;

                System.out.println("\nEl Docente ha sido Registrado");
                break;
                
            case 2:
                
                System.out.println("Nombre: ");
                entrada.nextLine();
                nombre = entrada.nextLine();

                System.out.println("Direccion");
                direccion = entrada.nextLine();

                System.out.println("Unidad Administriva");

                cadenaAuxiliar = entrada.nextLine();

                auxiliar = factory.createPersona(nombre, direccion, cadenaAuxiliar, 3);
                universitarios.add(auxiliar);
                auxiliar = null;

                System.out.println("\nEl Auxiliar PAS ha sido Registrado");
                break;
                
            default:
                System.out.println("\nOpcion Incorrecta");    
        }
    }
}
