import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el resultado del dado (1-6): ");
        int num = sc.nextInt();
        if (num < 1 || num > 6) {
            System.out.println("ERROR: número incorrecto");
        } else {
            String opuesta;
            switch (num) {
                case 1: opuesta = "seis"; break;
                case 2: opuesta = "cinco"; break;
                case 3: opuesta = "cuatro"; break;
                case 4: opuesta = "tres"; break;
                case 5: opuesta = "dos"; break;
                default: opuesta = "uno"; break;
            }
            System.out.println("La cara opuesta es: " + opuesta);
        }
        sc.close();

    }
}
