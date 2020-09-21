/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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

public class Controlador implements ActionListener{
 DefaultTableModel model= new DefaultTableModel();
 DefaultTableModel model1= new DefaultTableModel();
    
   private Ingresar ingresar;
   private ClienteExpress cliexpress;
   private ClienteLargo clilargo;
   private Menu menu;
   private Trabajador t;
   private Largo l;
   private Express ex;
   

    public Controlador(Ingresar ingresar, ClienteExpress cliexpress, ClienteLargo clilargo,Menu menu, Trabajador t, Largo l, Express ex) {
        this.ingresar = ingresar;
        this.cliexpress = cliexpress;
        this.clilargo = clilargo;
        this.menu=menu;
        this.t = t;
        this.l = l;
        this.ex = ex;
      
         //botones de Ventana Ingresar 
        this.ingresar.CrearContraseña.addActionListener(this);
        this.ingresar.Ingresar.addActionListener(this);
        
         //Botones de Ventana Menu
       this.menu.ServExpress.addActionListener(this);
       this.menu.ServLargo.addActionListener(this);
        
        //Botones de ventana Cliente Express
        this.cliexpress.Agregar.addActionListener(this);
        this.cliexpress.Costo.addActionListener(this);
        this.cliexpress.Eliminar.addActionListener(this);
        this.cliexpress.EliminarTodo.addActionListener(this);
        this.cliexpress.Atras.addActionListener(this);
    
        //Botones de Ventana Cliente Largo 
        this.clilargo.Agregar.addActionListener(this);
        this.clilargo.Costo.addActionListener(this);
        this.clilargo.Eliminar.addActionListener(this);
        this.clilargo.EliminarTodo.addActionListener(this);
        this.clilargo.Promocion.addActionListener(this);
        this.clilargo.Atras.addActionListener(this); 
    }

    //Llenado de tablas Ventanas ClienteExpress y Cliente Largo
    public void llenarTablaExp(JTable tablaD){
    
         tablaD.setModel(this.model);
            model.addColumn("Codigo");
            model.addColumn("Nombre Completo");
            model.addColumn("Dia de Atencion ");
            model.addColumn("Nombre del Servicio");
            model.addColumn("Nombre Mascota");
            model.addColumn("Sexo Mascota");
            model.addColumn("Edad Mascota");
            model.addColumn("Especie Mascota");
            model.addColumn("Tamaño Mascota");
            
       
    
        Object [] columna =new Object[9];
        for(int i=0; i< this.ex.clientes.size();i++){
            columna[0]=i+1 ;
            columna[1]= this.ex.clientes.get(i).getNombre();
            columna[2]= this.ex.clientes.get(i).getDiaAtencion();
            columna[3]= this.ex.getNombre();
            columna[4]= this.ex.clientes.get(i).getMascota().getNombre();
            columna[5]= this.ex.clientes.get(i).getMascota().getSexo();
            columna[6]= this.ex.clientes.get(i).getMascota().getEdad();
            columna[7]= this.ex.clientes.get(i).getMascota().getEspecie();
            columna[8]= this.ex.clientes.get(i).getMascota().getTamaño();
            model.addRow(columna);
        }
    } 
    
    
     public void llenarTablaLarg(JTable tablaD){
         
           tablaD.setModel(model1); 
            model1.addColumn("Codigo");
            model1.addColumn("Nombre Completo");
            model1.addColumn("Dia de Atencion");
            model1.addColumn("Duracion del Servicio");
            model1.addColumn("Nombre Mascota");
            model1.addColumn("Sexo Mascota");
            model1.addColumn("Edad Mascota");
            model1.addColumn("Especie Mascota");
            model1.addColumn("Tamaño Mascota");
        
        Object [] columna =new Object[9];
        
          for(int i=0; i< this.l.clientes.size();i++){
               columna[0]=i+1 ;
               columna[1]= this.l.clientes.get(i).getNombre();
               columna[2]= this.l.clientes.get(i).getDiaAtencion();
               columna[3]= this.l.getDias();
               columna[4]= this.l.clientes.get(i).getMascota().getNombre();
               columna[5]= this.l.clientes.get(i).getMascota().getSexo();
               columna[6]= this.l.clientes.get(i).getMascota().getEdad();
               columna[7]= this.l.clientes.get(i).getMascota().getEspecie();
               columna[8]= this.l.clientes.get(i).getMascota().getTamaño();
               
        model1.addRow(columna);
          }
    }
   
     
    //Botones de las ventanas 
     
    @Override
    public void actionPerformed(ActionEvent e) {
    //Ingresar
       //Boton Ingresar
        if(e.getSource()== ingresar.Ingresar){
            //Boton ingresar 
            if(!"".equals(this.t.getContraseña())){
              if(ingresar.nombre.getText().equals(this.t.getNombre())){
                if(ingresar.contraseña.getText().equals(this.t.getContraseña())){
                System.out.println("Ingresando al Sistema...");
                menu.setVisible(true);
                ingresar.setVisible(false);
                }
                else{
                  System.out.println("Contraseña incorrecta... Ingrese nuevamente. ");
                  System.out.println("Su contraseña:"+this.t.getContraseña()+ "    Escrito:"+ingresar.contraseña.getText());
                    }
                 } 
              else{
               System.out.println("Nombre incorrecto... Ingrese nuevamente.");   
               ingresar.nombre.setText("");
               ingresar.contraseña.setText("");
                }
            }else{
                System.out.println("Usted no posee contraseña...");
            }
        } 
      //Boton Crear contraseña
        if(e.getSource()==ingresar.CrearContraseña){
                //Crear contraseña para el trabajor 
                if(this.t.isVerifContraseña()==true){
                System.out.println("Error... Usted ya posee contraseña");
                }else{
                    //Llama al metodo crear contraseña del trabajador 
                    String newContraseña=this.t.crearContraseña();
                    //Se le asigna la nueva contraseña al trabajador 
                      this.t.setContraseña(newContraseña);
                      //Se informa del nombre y contraseña al Trabajador 
                     System.out.println("Su Contraseña es:"+t.getContraseña());
                     System.out.println("Su nombre es: "+t.getNombre()+"\n ------------------");   
                  }   
         }
   //Menu
      //Boton Cliente Express
        if(e.getSource()== menu.ServExpress){
            cliexpress.setVisible(true);
        if(this.model.getColumnCount()==0&&this.model.getRowCount()==0){
            System.out.println("Tabla vacia. Llenando tabla...");
            llenarTablaExp(cliexpress.Tabla1); 
        } 
        }
      //Boton Cliente Largo
        if(e.getSource()== this.menu.ServLargo){
            clilargo.setVisible(true);
            if(this.model1.getColumnCount()==0&&this.model1.getRowCount()==0){
             System.out.println("Tabla vacia. Llenando tabla...");
             llenarTablaLarg(clilargo.Tabla); 
            }
        }
        
   //Cliente Express
      //Boton Agregar
         if(e.getSource()== cliexpress.Agregar){
             
           // Agragr datos a la tabla 
                //Hacemos un arreglo
                String []agregar=new String [9];
                agregar[0]=cliexpress.codigo.getText();
                agregar[1]=cliexpress.nombre.getText();
                agregar[2]=cliexpress.diaAtencion.getText();
                agregar[3]=(String)cliexpress.nombreServicio.getSelectedItem();
                agregar[4]=cliexpress.nombreMasc.getText();
                agregar[5]=(String)cliexpress.sexo.getSelectedItem();
                agregar[6]=cliexpress.edadMasco.getText();
                agregar[7]=(String) cliexpress.especie.getSelectedItem();
                agregar[8]=(String)cliexpress.tamaño.getSelectedItem();

               model.addRow(agregar);
               
          //Creando mascota ( nombre, sexo, edad, tamaño,especie)
          Mascota m= new Mascota(cliexpress.nombreMasc.getText(),(String)cliexpress.sexo.getSelectedItem(),cliexpress.edadMasco.getText(),(String)cliexpress.tamaño.getSelectedItem(),(String) cliexpress.especie.getSelectedItem());
          
          //Creando Cliente y asignar al servicio express 
           Cliente c= new Cliente(cliexpress.nombre.getText(),cliexpress.diaAtencion.getText(),m); 
           
           this.ex.agregarCliente(c);
                   
         }
      //Boton Eliminar
         if(e.getSource()== cliexpress.Eliminar){
             //Eliminar fila, seleccionandola primero
                int eli= cliexpress.Tabla1.getSelectedRow();

               if(cliexpress.Tabla1.isRowSelected(eli)){
                    if(eli>=0){
                        model.removeRow(eli);
                        this.ex.clientes.remove(eli);
                    }else{
                        JOptionPane.showMessageDialog(null, "No hay datos que eliminar.");
                    }
               }else{
                   System.out.println("Seleccione Fila a eliminar.");  
                    } 
         }
         
      //Boton Eliminar Todo
         if(e.getSource()== cliexpress.EliminarTodo){
              // Eliminar Todo
                do {
                 model.removeRow(0);
                 this.ex.clientes.remove(0);
                 
              } while (model.getRowCount() !=0&& ex.clientes.size()!=0); 
         }
     //Boton Calcular costo
         if(e.getSource()== cliexpress.Costo){
             //Elijo una fila 
              int eli= cliexpress.Tabla1.getSelectedRow();
        
                if(cliexpress.Tabla1.isRowSelected(eli)){ 

                    if(eli>=0){
                        System.out.println("Costo Total: $"+4500);
                    }else{
                        JOptionPane.showMessageDialog(null, "Error. No existen datos para calcular Costo.");
                    }
                }else{
                    System.out.println("Seleccione Fila para Calcular el Costo.");  
                     }       
         }
      //Boton Atras    
         if(e.getSource()== cliexpress.Atras){
             this.menu.setVisible(true);
             this.cliexpress.setVisible(false);
             
         }
         
         
  //Cliente Largo 
      //Boton Agregar
          if(e.getSource()== clilargo.Agregar){
            // Agragr datos a la tabla 
                //Hacemos un arreglo
               String []agregar=new String [9];
               agregar[0]=clilargo.codigo.getText();
               agregar[1]=clilargo.nombre.getText();
               agregar[2]=clilargo.diaAtencion.getText();
               agregar[3]=clilargo.diaDuracion.getText();
               agregar[4]=clilargo.nombremasco.getText();
               agregar[5]=(String)clilargo.sexo.getSelectedItem();
               agregar[6]=clilargo.edadmasco.getText();
               agregar[7]=(String)clilargo.especie.getSelectedItem();
               agregar[8]=(String)clilargo.tamaño.getSelectedItem();

             model1.addRow(agregar);
             
            //Creando mascota ( nombre, sexo, edad, tamaño,especie)
             Mascota m= new Mascota(clilargo.nombremasco.getText(),(String)clilargo.sexo.getSelectedItem(),clilargo.edadmasco.getText(),(String)clilargo.tamaño.getSelectedItem(),(String)clilargo.especie.getSelectedItem());
            
            //Creando Cliente y asignar al servicio express   
            Cliente c= new Cliente(clilargo.nombre.getText(),clilargo.diaAtencion.getText(),m);
            this.l.agregarCliente(c);
         }
     //Boton Eliminar 
         if(e.getSource()== clilargo.Eliminar){
             //Eliminar fila, seleccionandola primero
                int eli= clilargo.Tabla.getSelectedRow();

               if(clilargo.Tabla.isRowSelected(eli)){ 

                if(eli>=0){
                    model1.removeRow(eli);
                    this.l.clientes.remove(eli);
                }else{
                    JOptionPane.showMessageDialog(null, "No hay datos que eliminar.");
                }
               }else{
                      System.out.println("Seleccione Fila a eliminar.");  
                        }
             
         }
      //boton Eliminar Todo
         if(e.getSource()== clilargo.EliminarTodo){
             // TODO add your handling code here:
                do {
                 model1.removeRow(0);
                 this.l.clientes.remove(0);

                } while (model1.getRowCount() !=0&& l.clientes.size()!=0);


         }
      //Boton Calcular Costo
         if(e.getSource()== clilargo.Costo){
            Scanner sn = new Scanner(System.in);
              //Selecciono fila en Tabla
             int eli= clilargo.Tabla.getSelectedRow();
               if(clilargo.Tabla.isRowSelected(eli)){ 
                    if(eli>=0){
                        System.out.println("Ingrese Cantidad de Dias...");
                          int dias=sn.nextInt();
                          l.setDias(dias);
                          //Calcular Costo Total
                        System.out.println("Costo: $"+l.costo()); 
                    }else{
                        JOptionPane.showMessageDialog(null, "No hay datos que Calcular.");
                    }
                   }else{
                        System.out.println("Seleccione Fila para Calcular Costo.");  
                         }        
          }
      
     //Boton Aplicar Promocion
         if(e.getSource()== clilargo.Promocion){
             Scanner sn = new Scanner(System.in);
              //Selecciono fila en Tabla
             int eli= clilargo.Tabla.getSelectedRow();
               if(clilargo.Tabla.isRowSelected(eli)){ 
                    if(eli>=0){
                        System.out.println("Ingrese Cantidad de Dias (Duracion del servicio)...");
                          int dias=sn.nextInt();
                          l.setDias(dias);
                          //Calcular Calcular Promocion 
                          System.out.println(l.descripcion());
                        System.out.println("Costo: $"+l.promocion(l)); 
                    }else{
                        JOptionPane.showMessageDialog(null, "No hay datos que Calcular.");
                    }
                   }else{
                        System.out.println("Seleccione Fila para Calcular Costo.");  
                         }        
             
         }
     //Boton Atras     
         if(e.getSource()== clilargo.Atras){
             this.menu.setVisible(true);
             this.clilargo.setVisible(false);
         }
             
    }
            
        
            
        
        
     
}
