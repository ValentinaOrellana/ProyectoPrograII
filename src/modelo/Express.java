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
public class Express extends Servicio{
    Scanner sn = new Scanner(System.in);
     public Express(String nombre) {
        super(nombre);
    }
    
    @Override
    public double costo() {
        int costo= super.getCostoBase();
        
        return costo;
        }

    @Override
    public String descripcion() {
        // Nombres  del servicio express
         String cadena= " Los servicios Express son los siguientes: \n 1. Corte de uñas. \n 2. Bañado de mascota. \n 3.Corte de pelo. \n 4. Limpieza de oidos.";
                
          return cadena;
         }

  
    
}
