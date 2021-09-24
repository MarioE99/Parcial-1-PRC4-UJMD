/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ujmd.clases;

/**
 *
 * @author meev9
 */
public class Alumno {
    
    private int codigo;
    
    private String Nombre;
    
    private String Apellido;

    public Alumno() {
    }

    public Alumno(int codigo, String Nombre, String Apellido) {
        this.codigo = codigo;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    
    
    
}
