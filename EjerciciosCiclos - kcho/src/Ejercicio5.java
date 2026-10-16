import java.util.Scanner;

public class Ejercicio5 {
    public void main(String[] args) {

//        Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y segundos
//        de un día desde las 00:00:00 horas hasta las 23:59:59 horas (24:00:00)

        System.out.println("\nSimular el comportamiento de un reloj digital, imprimiendo la hora, minutos y segundos");
        System.out.println("de un día desde las 00:00:00 horas hasta las 23:59:59 horas (24:00:00)");

        for (int h = 0; h <= 23; h++) {
            for (int m = 0; m <= 59; m++) {
                for (int s = 0; s <= 59; s++) {
                    System.out.println(String.format("%02d:%02d:%02d", h, m, s));
                }
            }
        }

    }
}
