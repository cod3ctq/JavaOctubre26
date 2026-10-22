import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese valor: ");
        int valor = teclado.nextInt();
        teclado.close();

        /*
         * Usamos dos bucles anidados para crear el cuadrado.
         * Si pensamos en el cuadrado como una tabla de asteriscos,
         * el primer bucle crearía las FILAS
         * y el segundo las COLUMNAS
         */
        for (int fila = 1; fila <= valor; fila++) {
            for (int columna = 1; columna <= valor; columna++)
                System.out.print("* ");

            System.out.println();//Salto de línea para pasar a la siguiente FILA
        }
    }
}
