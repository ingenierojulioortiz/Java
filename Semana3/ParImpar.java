package Semana3;

import java.util.Scanner;

public class ParImpar {
    static int numero;

public static void main (String[] args){
    Scanner scanner = new Scanner (System.in);
    System.out.println("Digite un número entero: ");
    numero=scanner.nextInt();
    if(numero%2==0) {
        System.out.println("El numero " + numero + " Es par");
    } else {
        System.out.println("El numero " + numero + " Es impar"); 
    }
    scanner.close();
 }
}