/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ujmd.clases;

import java.util.Scanner;

/**
 *
 * @author meev9
 */
public class Persona {
    
    private int cod;
    
    private String Nombre;
    
    private String Apellido;
    
    Scanner in = new Scanner(System.in);

    public Persona() {
    }

    public Persona(int cod, String Nombre, String Apellido) {
        this.cod = cod;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
    }
    


    public int getCod() {
        return cod;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    
    
    
    
}
