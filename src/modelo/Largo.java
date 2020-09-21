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
public class Largo extends Servicio implements Promocionable<Largo>{
    Scanner sn = new Scanner(System.in);
     private int dias;

    public Largo(int dias, String nombre) {
        super(nombre);
        this.dias = dias;
    }

     public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }
    
   
    @Override
    public double costo() {
        double costoTotal= this.dias*super.getCostoBase();
        return costoTotal;
        
    }
      @Override
    public double promocion(Largo l) {
    if(this.dias>=25){
        System.out.println("Aplicando promocion del 50%"); 
        
       double costoResto = (costo()*(0.5)); 
       double costoTotal= costo()-costoResto;
       
       return costoTotal;
    }
    else{
        if(this.dias>=20){
             System.out.println("Aplicando promocion del 30%"); 
       double costoResto = (costo()*(0.3)); 
       double costoTotal= costo()-costoResto;
       return costoTotal;
        }else{
            if(this.dias>=11){
                System.out.println("Aplicando promocion del 20%"); 
                 double costoResto= (costo()*(0.2)); 
                double costoTotal= costo()-costoResto;
   
               return costoTotal;
            }
            else{
               System.out.println("Promoción solo para cuidados de 11 dias o mas");
        
        double costoTotal=costo(); 
        return costoTotal;
            }
        }
    }    
    }


    @Override
    public String descripcion() {
       String cadena= "Este servicio cuenta con: \n 1. Cuidados por "+ this.dias+" dias. \n 2. Alojamiento  \n 3. Comida \n 4. Paseo diario \n 5. Bañado de mascota cada 5 dias. \n 6. Cepillado de pelo \n ";
          return cadena;
    }
   

    
}
