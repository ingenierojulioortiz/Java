package Semana3;
import java.util.Scanner;

public class MayorMenor {
    static int numero1,numero2=0;
    public static void main (String[] args){
        Scanner entrada=new Scanner (System.in);
        System.out.println("Digite el primer numero: ");
        numero1=entrada.nextInt();
        System.out.println("Digite el segundo numero: ");
        numero2=entrada.nextInt();
    String resultado=(numero1>numero2)?"El numero mayor es: " + numero1:"El numero mayor es: " + numero2;
    System.out.println(resultado);
    if(numero1>numero2)
        System.out.println("El numero mayor es: " + numero1);
      else
        System.out.println("El numero mayor es: " + numero2);
    entrada.close();
}
}