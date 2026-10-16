import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Monto de la donación: ");
        double monto = sc.nextDouble();
        double salud, comedor, bolsa;
        if (monto >= 10000) {
            salud = monto * 0.30;
            comedor = monto * 0.50;
            bolsa = monto * 0.20;
        } else {
            salud = monto * 0.25;
            comedor = monto * 0.60;
            bolsa = monto * 0.15;
        }
        System.out.printf("Centro de salud: %.2f%n", salud);
        System.out.printf("Comedor de niños: %.2f%n", comedor);
        System.out.printf("Inversión en bolsa: %.2f%n", bolsa);
        sc.close();
    }
}
