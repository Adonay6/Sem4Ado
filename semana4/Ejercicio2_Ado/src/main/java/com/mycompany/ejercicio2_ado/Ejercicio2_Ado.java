/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2_ado;

/**
 *
 * @author MINEDUCYT
 */

import java.util.Scanner;

public class Ejercicio2_Ado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        do {
            System.out.print("Ingrese un número: ");
            numero = scanner.nextInt();

            if (esPar(numero)) {
                System.out.println(numero + " es un número par.");
            } else {
                System.out.println(numero + " es un número impar.");
            }

        } while (numero > 50);
        scanner.close();
    }
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}

