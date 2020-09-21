/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


import java.util.Scanner;

/**
 *
 * @author 56963
 */
public class Cliente {
    Scanner sn = new Scanner(System.in);
    private String nombre;
    private String diaAtencion;
    private Mascota mascota;

    public Cliente(String nombre, String diaAtencion, Mascota mascota) {
        this.nombre = nombre;
        this.diaAtencion = diaAtencion;
        this.mascota= mascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDiaAtencion() {
        return diaAtencion;
    }

    public void setDiaAtencion(String diaAtencion) {
        this.diaAtencion = diaAtencion;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
 
     
   
    
}
