import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cantidadNumeros = 20;
        int sumaPositivos = 0;
        int sumaImpares = 0;

        for (int i = 1; i <= cantidadNumeros; i++) {
            System.out.print("Ingrese el número #" + i + ": ");
            int numero = scanner.nextInt();

            if (numero > 0) {
                System.out.println(numero + " es un número positivo.");
                sumaPositivos += numero;
            } else if (numero < 0) {
                System.out.println(numero + " es un número negativo.");
            } else {
                System.out.println(numero + " es igual a cero.");
            }

            if (numero % 2 == 0) {
                System.out.println(numero + " es un número par.");
            } else {
                System.out.println(numero + " es un número impar.");
                sumaImpares += numero;
            }
        }

        System.out.println("Sumatoria de números positivos: " + sumaPositivos);
        System.out.println("Sumatoria de números impares: " + sumaImpares);

        scanner.close();
    }
}
