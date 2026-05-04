package Semana2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Por favor ingrese un número: ");
        int numeroA = lector.nextInt();

        System.out.print("Por favor ingrese otro número: ");
        int numeroB = lector.nextInt();

        // Comparamos para ver cuál es mayor o si son iguales
        if (numeroA > numeroB) {
            System.out.println("El número " + numeroA + " es el mayor de los dos.");
        } else if (numeroB > numeroA) {
            System.out.println("El número " + numeroB + " es el mayor de los dos.");
        } else {
            System.out.println("Ambos números ingresados son exactamente iguales.");
        }

        lector.close();
    }
}
