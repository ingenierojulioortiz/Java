package Semanas;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Digita un número entero que tenga 5 cifras: ");
        int numeroCompleto = lector.nextInt();

        // Extrayendo cada cifra usando divisiones y módulos
        int primeraCifra = numeroCompleto / 10000;
        int segundaCifra = (numeroCompleto / 1000) % 10;
        int terceraCifra = (numeroCompleto / 100) % 10;
        int cuartaCifra = (numeroCompleto / 10) % 10;
        int quintaCifra = numeroCompleto % 10;

        System.out.println("Los números separados son: "
                + primeraCifra + " - "
                + segundaCifra + " - "
                + terceraCifra + " - "
                + cuartaCifra + " - "
                + quintaCifra);

        lector.close();
    }
}