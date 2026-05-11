import java.util.Scanner;

public class ControlUsuarios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 3; i++){
            System.out.println("====Usuario " + i + " ====");
        
        System.out.print("ingrese el nombre de usuario: ");
        String nombre = sc.nextLine();

        System.out.print("ingrese la edad: ");
        int edad = sc.nextInt();

        int calificacion;
        do {
            System.out.print("ingrese la calificacion (0-100): ");
            calificacion = sc.nextInt();
            if (calificacion < 0 || calificacion > 100) {
                System.out.println("Calificacion invalida. Por favor introduzca un valor entre 0 y 100.");
            }
        } while (calificacion < 0 || calificacion > 100);

        sc.nextLine(); // Limpiar el buffer

        String clasificacionEdad;
        if (edad < 18) {
            clasificacionEdad = "Menor de Mayor";
        } else {
            clasificacionEdad = "Mayor de Edad";
        }
        String resultado;
        if(calificacion >= 90) {
            resultado = "Excelente";
        } else if (calificacion >= 80) {
            resultado = "Bueno";
        } else if (calificacion >= 70) {
            resultado = "Regular";
        } else 
            resultado = "Reprobado";

            System.out.println("\n----Resumen del Usuario ---");
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad + " (" + clasificacionEdad + ")");
            System.out.println("Calificacion: " + calificacion + " (" + resultado + ")");
            System.out.println("-------------------------------\n");
        }
        sc.close();
    }
}
