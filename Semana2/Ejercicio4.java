package Semana2;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int valorActual, maximo, minimo;

        System.out.print("Introduce el valor número 1: ");
        valorActual = teclado.nextInt();

        // Asignamos el primer número como el mayor y menor temporalmente
        maximo = valorActual;
        minimo = valorActual;

        // Iniciamos el ciclo desde el segundo número
        for (int contador = 2; contador <= 5; contador++) {
            System.out.print("Introduce el valor número " + contador + ": ");
            valorActual = teclado.nextInt();

            // Actualizamos el máximo si encontramos uno más grande
            if (valorActual > maximo) {
                maximo = valorActual;
            }

            // Actualizamos el mínimo si encontramos uno más pequeño
            if (valorActual < minimo) {
                minimo = valorActual;
            }
        }

        System.out.println("-> De los 5, el mayor resultó ser: " + maximo);
        System.out.println("-> De los 5, el menor resultó ser: " + minimo);

        teclado.close();
    }
}