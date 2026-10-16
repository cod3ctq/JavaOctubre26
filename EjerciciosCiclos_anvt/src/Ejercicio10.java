import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Peso del paquete (kg): ");
        double peso = sc.nextDouble();
        System.out.print("Zona (1-5): ");
        int zona = sc.nextInt();
        if (peso > 5) {
            System.out.println("RECHAZADO: El paquete supera los 5 kg");
        } else {
            double costoKg = 0;
            switch (zona) {
                case 1: costoKg = 24.00; break;
                case 2: costoKg = 20.00; break;
                case 3: costoKg = 21.00; break;
                case 4: costoKg = 10.00; break;
                case 5: costoKg = 18.00; break;
                default:
                    System.out.println("ERROR: zona incorrecta");
                    sc.close();
                    return;
            }
            double total = peso * costoKg;
            System.out.printf("Costo del envío: %.2f euros%n", total);
        }
        sc.close();
    }
}
