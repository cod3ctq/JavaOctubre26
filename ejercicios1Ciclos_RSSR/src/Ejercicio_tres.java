import java.util.Scanner;

public class Ejercicio_tres {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double numero1, numero2, resultado;
        //double resultado;



        System.out.println("INGRESA EL PRIMER NÚMERO: ");
        numero1 = teclado.nextDouble();
        System.out.println("INGRESE EL SEGUNDO NÚMERO: ");
        numero2 = teclado.nextDouble();

        if (numero2 == 0) {
            System.out.println("No se puede dividir");
        }else {
            resultado = numero1 / numero2;
            System.out.println("El resultado es: " + resultado);
        }

        teclado.close();


    }
}
