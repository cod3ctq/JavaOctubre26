import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args){

//        Se ingresan un conjunto de n edades de personas por teclado.
//        El programa finalizara cuando el promedio de las edades sea superior a 25.


        System.out.println("\nSe ingresan un conjunto de n edades de personas por teclado.");
        System.out.println("El programa finalizara cuando el promedio de las edades sea superior a 25.\n");

        Scanner capTeclado = new Scanner(System.in);
        double promedioEdad = 0.0;
        double edad = 0.0;
        int cuantasEdadesCapturadas = 0;

        do {
            System.out.print("Introduce una edad : ");
            edad += capTeclado.nextDouble();
            cuantasEdadesCapturadas++;
            promedioEdad = edad / cuantasEdadesCapturadas;
        } while(promedioEdad <= 25);

        System.out.println("\nSe introdujeron : [" + cuantasEdadesCapturadas + "] edad(es)");
        System.out.println("El promedio de todas las edades es : " + String.format("%.2f",promedioEdad));
    }
}
