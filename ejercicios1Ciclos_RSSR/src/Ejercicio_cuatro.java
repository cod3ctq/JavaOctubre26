
import java.util.Scanner;

public class Ejercicio_cuatro {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Declaracion de variables
        int edad;
        double nota;
        char sexo;

        // Solicitar datos
        System.out.println("Ingresa tu edad:");
        edad = teclado.nextInt();

        System.out.println("Ingresa tu nota:");
        nota = teclado.nextDouble();

        System.out.println("Ingresa tu sexo (M/F):");
        sexo = teclado.next().toUpperCase().charAt(0);

        // Evaluar la solicitud
        if (edad >= 18 && nota >= 5) {

            switch (sexo) {
                case 'M':
                    System.out.println("POSIBLE");
                    break;

                case 'F':
                    System.out.println("ACEPTADA");
                    break;

                default:
                    System.out.println("NO ACEPTADA");
                    break;
            }

        } else {
            System.out.println("NO ACEPTADA");
        }

        teclado.close();
    }
}
