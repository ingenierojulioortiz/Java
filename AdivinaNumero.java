import java.util.Scanner;

public class AdivinaNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secreto = 42;  // número a adivinar
        int intento = 0;
        int intentos = 0;
        System.out.println("=== ADIVINA EL NÚMERO (entre 1 y 100) ===");
        while (intento != secreto) {
            System.out.print("Tu intento: ");
            intento = sc.nextInt();
            intentos++;

            if (intento < secreto) {
                System.out.println("Demasiado bajo. Intenta más alto.");
            } else if (intento > secreto) {
                System.out.println("Demasiado alto. Intenta más bajo.");
            }
        }

        System.out.println("¡Correcto! Lo lograste en " + intentos + " intento(s).");
        sc.close();
    }
}
