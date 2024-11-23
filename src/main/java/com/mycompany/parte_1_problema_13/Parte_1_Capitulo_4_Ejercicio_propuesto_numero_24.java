/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parte_1_problema_13;
import java.util.Scanner;

/**
 *
 * @author Samuel Cataño C
 */
public class Parte_1_Capitulo_4_Ejercicio_propuesto_numero_24 {

    public static void main(String[] args) {
        double A, B, C;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el peso de la pelota A:");
        A = lector.nextDouble();
        System.out.println("Ingrese el peso de la pelota B:");
        B = lector.nextDouble();
        System.out.println("Ingrese el peso de la pelota C:");
        C = lector.nextDouble();
        if (A>B&&A>C) {
            System.out.println("La pelota A es la de mayor peso");
        } else {
            if (B>C) {
                System.out.println("La pelota B es la de mayor peso");
            } else {
                System.out.println("La pelota C es la de mayor peso");
            }
        }
    }
}