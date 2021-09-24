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
public class Materia extends Alumno {

    private int codMateria;

    private String NombreMateria;

    private int Grado;

    public double NotaFinal;

    public Materia() {
    }

    public Materia(int co, String no, String ap, int codMateria, String NombreMateria, int Gra) {

        super(co, no, ap);
        this.codMateria = codMateria;
        this.NombreMateria = NombreMateria;
        this.Grado = Gra;
    }

    public double getNotaFinal() {
        return NotaFinal;
    }

    public void setNotaFinal(double NotaFinal) {
        this.NotaFinal = NotaFinal;
    }

    public int getCodMateria() {
        return codMateria;
    }

    public String getNombreMateria() {
        return NombreMateria;
    }

    public int getGrado() {
        return Grado;
    }

    public void setCodMateria(int codMateria) {
        this.codMateria = codMateria;
    }

    public void setNombreMateria(String NombreMateria) {
        this.NombreMateria = NombreMateria;
    }

    public void setGrado(int Grado) {
        this.Grado = Grado;
    }

}
