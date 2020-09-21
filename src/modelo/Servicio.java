/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author 56963
 */
public abstract class Servicio {
    protected String nombre;
    protected int costoBase;
    public ArrayList<Cliente> clientes;
    
    
    public Servicio(String nombre) {
        this.nombre = nombre;
        this.costoBase = 4500;
        this.clientes= new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCostoBase() {
        return costoBase;
    }

    public void setCostoBase(int costoBase) {
        this.costoBase = costoBase;
    }
     public abstract double costo();
     
     
     public void agregarCliente(Cliente c){
         //Agregando cliente a lista de clientes. 
         this.clientes.add(c);
     }
    
     public abstract String descripcion();
       
    
}
