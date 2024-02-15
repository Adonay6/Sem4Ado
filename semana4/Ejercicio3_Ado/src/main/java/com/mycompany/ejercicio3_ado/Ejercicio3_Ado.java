/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3_ado;

/**
 *
 * @author MINEDUCYT
 */

import java.util.Scanner;

public class Ejercicio3_Ado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Elija la operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        
        System.out.println("Ingrese el numero de la operacion que desea:");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Resultado de la suma: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Resultado de la resta: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Resultado de la multiplicación: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Resultado de la división: " + (num1 / num2));
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                }
                break;
            default:
                System.out.println("Opción no válida");
        }

        scanner.close();
    }
}
