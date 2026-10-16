import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Dibuja un cuadrado, como en la imagen que acompaña, introducir desde teclado el ancho y el alto.
        //Ejemplo: 8 x 8

        int ancho;
        int alto;

        System.out.println( " Ancho del cuadrado ");
        ancho = scan.nextInt();

        System.out.println( " Alto del cuadrado ");
        alto = scan.nextInt();

        for( int fila = 1; fila <= alto; fila++){

            for( int columna = 1; columna <= ancho; columna++){
                System.out.print( " * ");
            }
            System.out.println();
        }



    }
}
