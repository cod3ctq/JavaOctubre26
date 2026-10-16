import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Una persona desea invertir $1000.00 en un banco, el cual le otorga un %2 de interes mensual
        //Cual sera la cantidad de dinero que etsa persona tendra al cabo de un año
        //si todo el dinero se reinvierte

        double inversion = 1000.00;

        //Repite la reinversion del monto total por 12 meses
        for (int i = 1; i <=12; i++ ){
            inversion = inversion * 1.02;
        }

        System.out.println("Ganancia total :" + inversion );
    }
}
