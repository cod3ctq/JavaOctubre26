import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

//        Programa un algoritmo que realice la tabla de multiplicar de un numero introducido desde teclado,
//        hasta la iteración deseada por el usuario.
//        Ejemplo, tabla de 23 hasta el 95.
//        23 x 95 = ???;


        System.out.println("\nPrograma un algoritmo que realice la tabla de multiplicar de un numero introducido desde teclado,");
        System.out.println("hasta la iteración deseada por el usuario.");
        System.out.println("Ejemplo, tabla de 23 hasta el 95.");
        System.out.println("23 x 95 = ???;");

        Scanner capTeclado = new Scanner(System.in);

        System.out.print("\nDe que número quieres imprimir la tabla? :");
        int tablaDelNumero = capTeclado.nextInt();

        System.out.print("Hasta que número deseas que termine la tabla? :");
        int numeroFinalTabla = capTeclado.nextInt();

        for(int i = 1 ; i <= numeroFinalTabla; i++){
            System.out.println(tablaDelNumero + " x " + i + " = " + tablaDelNumero * i);
        }




    }
}
