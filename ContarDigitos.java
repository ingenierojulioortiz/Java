import java.util.Scanner;

public class ContarDigitos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número entero positivo: ");
        int n = sc.nextInt();

        int contador = 0;
        int copia = n;

        while (copia > 0) {
            copia = copia / 10; // elimina el último dígito
            contador++;

            System.out.println("El número " + n + " tiene " + contador + " digito(s)");
            sc.close();
        }
    }

}
