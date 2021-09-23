/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ujmd.Parcial1;

import edu.ujmd.clases.Empleado;
import java.util.Scanner;

/**
 *
 * @author meev9
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        double mayor = 0;

        String NombreMayor = "";

        double menor = 0;

        String NombreMenor = "";

        int limite = 1;
        int contadorempleado = 0;
        int contador300 = 0;

        String Nombre300 = "";

        double salario300 = 0;

        Empleado lista[] = new Empleado[5];

        do {

            Scanner in = new Scanner(System.in);
            int codigo;

            String nombre;

            String apellido;

            String cargo;

            float hora;

            System.out.println("Digite el codigo del empleado");

            codigo = in.nextInt();

            System.out.println("Digite el nombre del empleado");

            nombre = in.next();

            System.out.println("Digite el apellido del empleado");

            apellido = in.next();

            System.out.println("Digite el cargo del empleado");

            cargo = in.next();

            System.out.println("Digite las horas trabajadas del empleado");

            hora = in.nextFloat();

            double sueldo = 0;
            double sueldoliquido;
            double descuentoisss = 0;
            double descuentoafp = 0;
            double descuentorenta = 0;
            //Establecemos la condicion de las horas de los trabajdores
            if (hora <= 160) {

                sueldo = hora * 9.75;
            } else if (hora > 160) {
                sueldo = hora * 11.50;
            }
            //Realizamos el calculo del sueldo 
            sueldoliquido = sueldo - ((sueldo * 0.0525) + (sueldo * 0.0688) + (sueldo * 0.10));
            descuentoisss = (sueldo * 0.0525);
            descuentoafp = (sueldo * 0.0688);
            descuentorenta = (sueldo * 0.10);

            //Declaramos la isntancia
            Empleado e = new Empleado();

            //Almacenamos los datos en la clase de empleado
            e.setCod(codigo);
            e.setNombre(nombre);
            e.setApellido(apellido);
            e.setCargo(cargo);
            e.setHora(hora);
            e.setDescuentoISSS(descuentoisss);
            e.setDescuentoAFP(descuentoafp);
            e.setDescuentoRENTA(descuentorenta);
            e.setSueldo(sueldo);
            e.setSueldoliquido(sueldoliquido);

            lista[contadorempleado] = e;

            //Incrementamos los contadores
            contadorempleado++;
            codigo++;
            limite++;

            //Calculamos quien tiene el mayor salario, menor y cuanto ganan mas de 300
            if (sueldoliquido > mayor) {
                mayor = sueldoliquido;
                NombreMayor = nombre;
            }
            if (sueldoliquido < mayor) {
                menor = sueldoliquido;
                NombreMenor = nombre;
            }
            if (sueldoliquido > 300) {
                salario300 = sueldoliquido;
                Nombre300 = nombre;
                contador300++;
            }

        } while (limite <= 5);

        //Mostramos los datos mediante el ciclo for
        for (int i = 0; i < contadorempleado; i++) {

            System.out.println("El nombre del empleado: " + lista[i].getNombre());
            System.out.println("Las horas son: " + lista[i].getHora());
            System.out.println("El sueldo es: " + lista[i].getSueldo());
            System.out.println("El descuento ISSS: " + lista[i].getDescuentoISSS());
            System.out.println("El descuento AFP: " + lista[i].getDescuentoAFP());
            System.out.println("El descuento RENTA: " + lista[i].getDescuentoRENTA());
            System.out.println("sueldoliquido es: " + lista[i].getSueldoliquido());
            System.out.println("---------------------------------------------------------");

        }

        System.out.println("------------------------------------------------------");
        System.out.println("El empleado con mayor salario es: " + NombreMayor + " con el sueldo: " + mayor);
        System.out.println("El empleado con menor salario es: " + NombreMenor + " con el sueldo: " + menor);
        System.out.println("---------------------------------------------------------");
        //Msotramos los empleados mayores a 300 mediante un ciclo for
        for (int i = 0; i < contador300; i++) {
            System.out.println("-------------------------------------------------------");
            System.out.println("Los empleados con salario mayor a 300 son: " + lista[i].getNombre());
            System.out.println("Con salario de: " + lista[i].getSueldoliquido());
        }
    }

}
