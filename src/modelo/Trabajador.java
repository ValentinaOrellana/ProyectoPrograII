/*
GenerarContraseña():
Fuente:(2013)Disco Duro de Roer. Ejercicios propuestos y resueltos programación orientado a objetos Java.https://www.discoduroderoer.es/ejercicios-propuestos-y-resueltos-programacion-orientado-a-objetos-java/ 

 */
package modelo;

import java.util.ArrayList;


/**
 *
 * @author 56963
 */
public class Trabajador {
    private String nombre;
    private String apellido;
    private String contraseña;
    protected ArrayList<Servicio> servicios;
    private boolean verifContraseña;
    
    public Trabajador(String nombre, String apellido, String contraseña, boolean verifContraseña) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.contraseña = contraseña;
        this.verifContraseña = verifContraseña;
        servicios=new ArrayList<>();
    }
    public Trabajador(String nombre, String apellido, boolean verifContraseña) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.contraseña = ""; 
        this.verifContraseña = verifContraseña;
        servicios=new ArrayList<>();
    }

    public boolean isVerifContraseña() {
        return verifContraseña;
    }

    public void setVerifContraseña(boolean verifContraseña) {
        this.verifContraseña = verifContraseña;
    }

    

    public ArrayList<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(ArrayList<Servicio> servicios) {
        this.servicios = servicios;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public String crearContraseña(){
        System.out.println("Creando contraseña... \n       \n");
        
       this.contraseña="";     
        for(int i=0;i<4;i++){
           //Si es distinto de 1 y 2 agregar numeros.
                     char numeros=(char)((int)Math.floor(Math.random()*(58-48)+48));
                    contraseña+=numeros;
                
             }
      return  contraseña;
    }
     @Override
    public String toString() {
        String  cadena= "Nombre completo del Trabajador: "+this.nombre+"  "+this.apellido+"\n   \n";
        
        return cadena;
    }
    
    
}
