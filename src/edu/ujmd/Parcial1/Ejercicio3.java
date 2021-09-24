/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ujmd.Parcial1;

import edu.ujmd.clases.Materia;
import java.util.Scanner;

/**
 *
 * @author meev9
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        //Establecemos la lista
        Materia lista[] = new Materia[5];
        int limite = 1;
        int contadoraprobado = 0;
        String Estado[] = new String[5];
        String Estado2[] = new String[5];

        int contadormateria = 0;
        do {

            //Declaramos el scanner
            Scanner in = new Scanner(System.in);

            int cod;

            String Nombre;

            String Apellido;

            String Materia;

            int Grado;

            System.out.println("Digite el id del estudiante");
            cod = in.nextInt();

            System.out.println("Digite el nombre del estudiante");
            Nombre = in.next();

            System.out.println("Digite el apellido del estudiante");
            Apellido = in.next();

            System.out.println("Digite el nombre de la materia");
            Materia = in.next();

            System.out.println("Digite el grado del estudiante");
            Grado = in.nextInt();

            //Declaramos la instancia para almacenar los datos en la clase
            Materia m = new Materia();

            m.setCodigo(cod);
            m.setNombre(Nombre);
            m.setApellido(Apellido);
            m.setNombreMateria(Materia);
            m.setGrado(Grado);
            lista[contadormateria] = m;

            //Incrementamos los contadores
            contadormateria++;
            cod++;
            limite++;

            //Metodo que permite 
            double A1 = 0, A2 = 0, A3 = 0, A4 = 0, A5 = 0;
            double p1 = 0, p2 = 0, p3 = 0, p4 = 0, p5 = 0;

            System.out.println("Digite lo nota de la primera actividad que vale 15%");

            A1 = in.nextDouble();
            p1 = A1 * 0.15;

            System.out.println("Digite lo nota de la segunda actividad que vale 10%");
            A2 = in.nextDouble();
            p2 = A2 * 0.10;

            System.out.println("Digite lo nota de la tercera actividad que vale 20%");
            A3 = in.nextDouble();
            p3 = A3 * 0.20;

            System.out.println("Digite lo nota de la cuarta actividad que vale 30%");
            A4 = in.nextDouble();
            p4 = A4 * 0.30;

            System.out.println("Digite lo nota de la quinta actividad que vale 25%");
            A5 = in.nextDouble();
            p5 = A5 * 0.25;

            double totalActividad = p1 + p2 + p3 + p4 + p5;

            boolean concedido = false;

            //Hacemos el ciclo do while para continuar si la suma de las 5 actividades son menores a 50
            do {

                if (totalActividad > 50) {
                    System.out.println("La sumatoria de las 5 actividades no puede dar mayor a 50");
                    concedido = false;
                } else {

                    concedido = true;
                }

            } while (concedido == false);

            m.setNotaFinal(totalActividad);

            if (totalActividad >= 7) {
                Estado[contadoraprobado] = "Estas aprobado";

                if (Grado == 10) {
                    Estado2[contadoraprobado] = "Felicidades, estas graduado";
                } else {
                    Estado2[contadoraprobado] = "Aun no estas graduado, disfruta la escuela";
                }

                contadoraprobado++;
            }
            if (totalActividad <= 6.49) {
                Estado[contadoraprobado] = "Estas reprobado";
                Estado2[contadoraprobado] = "Lo sentimos, no pasastes de grado";
                contadoraprobado++;
            }

            //6.50<x<6.99
            if (6.50 < totalActividad && totalActividad < 6.99) {
                Estado[contadoraprobado] = "Tienes la posibilidad de realizar un examen de suficiencia para aprobar";
                Estado2[contadoraprobado] = "Pasastes la materia pero tienes la posibilidad de repetir el examen";
                contadoraprobado++;
            }

        } while (limite <= 5);

        for (int i = 0; i < contadormateria; i++) {
            System.out.println("El nombre del estudiante: " + lista[i].getNombre());
            System.out.println("El estudiante esta cursando esta materia: " + lista[i].getNombreMateria());
            System.out.println("La nota final del alumno es: " + lista[i].getNotaFinal());
            System.out.println("El estado de la materia del estudiantes es: " + Estado[i]);
            System.out.println("Resultado del año: " + Estado2[i]);
            System.out.println("---------------------------------------------------------");

        }

    }

}
