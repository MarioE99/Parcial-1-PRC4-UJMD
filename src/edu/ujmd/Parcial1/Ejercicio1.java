/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ujmd.Parcial1;

import java.util.Scanner;

import static java.lang.Math.abs;

import static java.lang.Math.pow;

import static java.lang.Math.sqrt;

/**
 *
 * @author meev9
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Programa para resolver la ecucacion cuadratica
        //Declaramos variables de la ecuacion cuadratica
        int a = 0;

        int b = 0;

        int c = 0;

        System.out.println("Digite las variables de la ecuación");

        Scanner in = new Scanner(System.in);

        System.out.println("Digite el valor de a");
        a = in.nextInt();

        System.out.println("Digite el valor de b");
        b = in.nextInt();

        System.out.println("Digite el valor de c");
        c = in.nextInt();

        //Establecemos la condicion que si a es igual a cero, no se puede continuar
        if (a == 0) {
            System.out.println("No se puede continuar, a no puede ser 0");

        } else {

            System.out.println("La formula quedaria x= " + a + "x² +" + b + "x +" + c + "=0");

            //inciaremos la variable de la potencia
            double raiz = pow(b, 2) - (4 * a * c);

            //obtenemos el valor absoluto de la raiz
            raiz = abs(raiz);

            //Como en la ecuacion cuadratica tenemos 2 soluciones, establecemos x1 y x2
            double x1;

            double x2;

            double pr;

            double pi;

            //Determinamos si lo que esta dentro de la raiz es mayor a 0, podemos seguir con la operacion, en caso contrario no
            if (raiz > 0) {
                x1 = (-b + sqrt(raiz)) / (2 * a);
                x2 = (-b - sqrt(raiz)) / (2 * a);

                //Despues imprimos los resultados de la ecucacion
                System.out.println("El resultado de la primera solucion es X1= " + x1);
                System.out.println("El resultado de la segunda solucion es X2= " + x2);

            }
            
            else{
                System.out.println("EL resultado dentro de la raiz, es 0");
            }

        }

    }

}
