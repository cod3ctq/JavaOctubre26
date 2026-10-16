import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la edad: ");
        int edad = sc.nextInt();
        System.out.print("Introduce la nota: ");
        double nota = sc.nextDouble();
        System.out.print("Introduce el sexo (M/F): ");
        char sexo = sc.next().toUpperCase().charAt(0);
        if (nota >= 5 && edad >= 18) {
            if (sexo == 'M') {
                System.out.println("POSIBLE");
            } else if (sexo == 'F') {
                System.out.println("ACEPTADA");
            } else {
                System.out.println("NO ACEPTADA");
            }
        } else {
            System.out.println("NO ACEPTADA");
        }
        sc.close();

    }
}
