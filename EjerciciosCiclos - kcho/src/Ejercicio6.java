import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

//        Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés mensual. Cual será la cantidad
//        de dinero que esta persona tendrá al cabo de un año si todo el dinero lo reinvierte?.

        System.out.println("\nUna persona desea invertir $1000.00 en un banco, ");
        System.out.println("el cual le otorga un 2% de interés mensual. Cual será la cantidad");
        System.out.println("de dinero que esta persona tendrá al cabo de un año si todo el dinero lo reinvierte?.");

        double inversion = 1000.00;

        for (int i = 1; i <= 12; i++) {
            inversion = inversion * 1.02;
        }
        System.out.println("\nInversión inicial : $1000.00");
        System.out.println("Ganancia total : $" + String.format("%.02f",inversion));
        System.out.println("Intereses ganados por los 12 meses : $" + String.format("%.02f",(inversion - 1000)));
    }
}
