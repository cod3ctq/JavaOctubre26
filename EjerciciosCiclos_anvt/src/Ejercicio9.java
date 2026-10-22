import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número del mes (1-12): ");
        int mes = sc.nextInt();
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 ||
                mes == 8 || mes == 10 || mes == 12) {
            System.out.println("31 días");
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            System.out.println("30 días");
        } else if (mes == 2) {
            System.out.println("28 o 29 días (depende del año)");
        } else {
            System.out.println("ERROR: mes incorrecto");
        }
        sc.close();
    }
}
