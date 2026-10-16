import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el día (1-7): ");
        int dia = sc.nextInt();
        if (dia == 1) System.out.println("Lunes");
        else if (dia == 2) System.out.println("Martes");
        else if (dia == 3) System.out.println("Miércoles");
        else if (dia == 4) System.out.println("Jueves");
        else if (dia == 5) System.out.println("Viernes");
        else if (dia == 6) System.out.println("Sábado");
        else if (dia == 7) System.out.println("Domingo");
        else System.out.println("ERROR: número incorrecto");
        sc.close();

    }
}
