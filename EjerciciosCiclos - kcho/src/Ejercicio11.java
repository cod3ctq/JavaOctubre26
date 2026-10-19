import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args){
//        Dibuja un cuadrado, como este que se muestra,
//        introducir desde teclado el ancho y el alto.
//                Ejemplo: 4 x 4
//                * * * *
//                * * * *
//                * * * *
//                * * * *
//


        System.out.println("\nDibuja un cuadrado, como este que se muestra,");
        System.out.println("introducir desde teclado el ancho y el alto.");
        System.out.println("\t\t\tEjemplo: 4 x 4");
        System.out.println("\t\t\t* * * *");
        System.out.println("\t\t\t* * * *");
        System.out.println("\t\t\t* * * *");
        System.out.println("\t\t\t* * * *\n");

        Scanner capTeclado = new Scanner(System.in);

        System.out.print("De cuantas FILAS quieres el cuadrado : ");
        int filas = capTeclado.nextInt();

        System.out.print("De cuantas COLUMNAS quieres el cuadrado : ");
        int columnas = capTeclado.nextInt();


        for (int fila = 1 ; fila <= filas ; fila++){
            for (int columna = 1 ; columna <= columnas; columna++){
                System.out.print("* ");
            }
            System.out.println();
        }



    }
}
