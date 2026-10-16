import java.util.Scanner;

public class Ejercicio_uno {
    //metodo main
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        int numero1=teclado.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int numero2=teclado.nextInt();

        if (numero1 > numero2){
            System.out.println("El primer número es mayor ");
        }else if (numero1 < numero2){
            System.out.println("El segundo número es menor ");
        } else {
            System.out.println("Los dos números son iguales: ");
        }
        teclado.close();
    }
}
