/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mendezguillen_20250825;

import java.util.Scanner;

/**
 *
 * @author UFG
 */
public class Main {

    //METODO QUE CALULA Y MUESTRA LOS RESULTADOS//
    
    public static void procesarEdades(int[] edades) {
        int total = edades.length;
        int suma = 0;
        int pares = 0;
        int impares = 0;

        // RECOREMOS EL ARRGLO//
        for (int edad : edades) {
            suma += edad;
            if (edad % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        double promedio = (double) suma / total;

        //MOSTRANDO RESULTADOS//
        System.out.println("\n--- Resultados ---");
        System.out.println("Numero de registros ingresados: " + total);
        System.out.println("Promedio de edades: " + promedio);
        System.out.println("Cantidad de edades pares: " + pares);
        System.out.println("Cantidad de edades impares: " + impares);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ARREGLO DE 10 POSICIONES//
        int[] edades = new int[10];

        System.out.println("Ingrese 10 edades de estudiantes:");

        for (int i = 0; i < edades.length; i++) {
            System.out.print("Edad " + (i + 1) + ": ");
            edades[i] = sc.nextInt();
        }

        // LLAMAMOS AL MODULO PARA PROCESAR//
        procesarEdades(edades);

        sc.close();
    }
}


   