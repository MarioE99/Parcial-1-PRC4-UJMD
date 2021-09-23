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
public class Empleado extends Persona {

    private float Hora;

    private double sueldo;

    private double DescuentoISSS;

    private double DescuentoAFP;

    private double DescuentoRENTA;

    double sueldoliquido = 0;

    private String Cargo;

    Persona p = new Persona();

    public Empleado() {
    }

    Scanner in = new Scanner(System.in);

    public Empleado(int co, String n, String a, String car, float H, double s, double sl, double is, double af, double re) {
        super(co, n, a);
        this.Hora = H;
        this.Cargo = car;
        this.sueldo=s;
        this.sueldoliquido=sl;
        this.DescuentoISSS=is;
        this.DescuentoAFP=af;
        this.DescuentoRENTA=re;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getSueldoliquido() {
        return sueldoliquido;
    }

    public void setSueldoliquido(double sueldoliquido) {
        this.sueldoliquido = sueldoliquido;
    }
    
    

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public float getHora() {
        return Hora;
    }

    public double getDescuentoISSS() {
        return DescuentoISSS;
    }

    public double getDescuentoAFP() {
        return DescuentoAFP;
    }

    public double getDescuentoRENTA() {
        return DescuentoRENTA;
    }

    public void setHora(float Hora) {
        this.Hora = Hora;
    }

    public void setDescuentoISSS(double DescuentoISSS) {
        this.DescuentoISSS = DescuentoISSS;
    }

    public void setDescuentoAFP(double DescuentoAFP) {
        this.DescuentoAFP = DescuentoAFP;
    }

    public void setDescuentoRENTA(double DescuentoRENTA) {
        this.DescuentoRENTA = DescuentoRENTA;
    }

}
