import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        scanner.close();

        int menor = Math.min(numero1, numero2);
        int mayor = Math.max(numero1, numero2);

        System.out.println("Números desde el menor hasta el mayor:");

        for (int i = menor; i <= mayor; i++) {
            System.out.print(i + " ");
        }
    }
}
