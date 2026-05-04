package Semana2;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Escribe el primer valor: ");
        double valor1 = teclado.nextDouble();

        System.out.print("Escribe el segundo valor: ");
        double valor2 = teclado.nextDouble();

        // Calculamos y mostramos los resultados básicos
        System.out.println("La suma es: " + (valor1 + valor2));
        System.out.println("La multiplicación es: " + (valor1 * valor2));
        System.out.println("La resta es: " + (valor1 - valor2));

        // Verificamos que no se divida por cero
        if (valor2 != 0) {
            double division = valor1 / valor2;
            System.out.println("La división es: " + division);
        } else {
            System.out.println("Error: No es posible dividir entre cero.");
        }

        teclado.close();
    }
}