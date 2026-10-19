import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        // Programa Java que lea dos números y muestre los números pares ENTRE ELLOS
        // si introducimos 2 y 10 el resultado sera: [2] --> 2, 4, 6, 8, <-- [10]
        // si introducimos 1 y 11 el resultado sera: [1] --> 2, 4, 6, 8, 10, <-- [11]
        System.out.println("\nPrograma Java que lea dos números y muestre los números pares ENTRE ELLOS");

        Scanner capTeclado = new Scanner(System.in);

        System.out.print("Introduce el primer número : ");
        int num1 = capTeclado.nextInt();

        System.out.print("Introduce el segundo número : ");
        int num2 = capTeclado.nextInt();

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        // imprime solo el primer numero para indicar que ahi comienza
        // pero no forma parte de los pares que se muestran
        System.out.print("[" + num1 + "] --> ");

        for (int i = num1 + 1; i < num2; i++) {
            System.out.print((i % 2 == 0) ? (i + ", ") : "");
        }

        // imprime solo el ultimo numero para indicar que ahi termina
        // pero no forma parte de los pares que se muestran
        System.out.print("<-- [" + num2 + "]");


    }
}
