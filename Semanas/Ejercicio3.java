package Semanas;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Brinda el primer número entero: ");
        int n1 = entrada.nextInt();

        System.out.print("Brinda el segundo número entero: ");
        int n2 = entrada.nextInt();

        System.out.print("Brinda el tercer número entero: ");
        int n3 = entrada.nextInt();

        // Cálculos matemáticos
        int totalSuma = n1 + n2 + n3;
        int totalProducto = n1 * n2 * n3;
        double valorPromedio = totalSuma / 3.0;

        // Encontrar el máximo y mínimo
        int valorMaximo = Math.max(n1, Math.max(n2, n3));
        int valorMinimo = Math.min(n1, Math.min(n2, n3));

        // Mostrar resultados en consola
        System.out.println("Resultado de la suma: " + totalSuma);
        System.out.println("Resultado del producto: " + totalProducto);
        System.out.println("El promedio calculado es: " + valorPromedio);
        System.out.println("El número más alto es: " + valorMaximo);
        System.out.println("El número más bajo es: " + valorMinimo);

        entrada.close();
    }
}