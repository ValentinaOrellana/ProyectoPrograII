/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Cliente;
import modelo.Express;
import modelo.Largo;
import modelo.Mascota;
import modelo.Trabajador;
import vista.ClienteExpress;
import vista.ClienteLargo;
import vista.Ingresar;
import vista.Menu;

/**
 *
 * @author 56963
 */
public class ServiMascoShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         /*Trabajador t (Nombre, apellido, contraseña, posee contraseña)
        Trabajador t2(Nombre, Apellido, no tiene contraseña)*/
        Trabajador t= new Trabajador ("Valentina", "Orellana","1236",true);
        Trabajador t2= new Trabajador ("Valentina", "Orellana",false);
        
        //Mascotas ( nombre, sexo, edad, tamaño,especie)
        Mascota m=new Mascota("Pelusa","Hembra","8","Pequeño","Felino");
        //Clientes 
        Cliente c2=new Cliente ("Catalina Monsalvez","02-04-2020",m);
        
        Cliente c3= new Cliente ("Andres Alarcon", "25-04-2020",m);
        
        //Servicios
        
        //Largo(dias, nombre)
        Largo l=new Largo(20,"Cuidados diarios");
        //Express(nombre)
        Express ex=new Express ("Corte de uñas");
        
        l.agregarCliente(c3);
        //l.agregarCliente(c2);
        
        ex.agregarCliente(c3); 
        ex.agregarCliente(c2);
       
        Ingresar i=new Ingresar();
        i.setVisible(true);
        
        Menu menu=new Menu();
        ClienteExpress cliexpress= new ClienteExpress();
        ClienteLargo clilargo=new ClienteLargo();
        
     //Controlador Instanciado
        Controlador contro= new Controlador(i, cliexpress, clilargo, menu, t2, l, ex);
        
    }
    
}
