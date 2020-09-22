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

 

  
    
}
