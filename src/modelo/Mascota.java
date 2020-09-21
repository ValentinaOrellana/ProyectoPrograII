/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author 56963
 */
public class Mascota {
    private String nombre;
    private String sexo;
    private String edad;
    private String tamaño;
    private String especie;

    public Mascota(String nombre, String sexo, String edad, String tamaño, String especie) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.tamaño = tamaño;
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    @Override
    public String toString() {
        String  cadena=" Nombre de Mascota:"+ this.nombre+"\n";
        cadena+= "Especie:"+this.especie+"\n";
        cadena+="Edad:"+this.edad+"años \n";
        cadena+="Sexo:"+this.sexo+"\n";
        cadena+="Tamaño:"+this.tamaño+"\n";
        
        return cadena;
    }
}
