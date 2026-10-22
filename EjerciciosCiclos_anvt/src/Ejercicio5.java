public class Ejercicio5 {

    public static void main(String[] args) {

        //5. Simular el comportamiento de un reloj digital,
        // imprimiendo la hora, minutos y segundos de un día
        //desde las 00:00:00 horas hasta las 23:59:59 horas


        for (int m = 0; m <= 59; m++) { //mover los mibutos

        }
        for (int h = 0; h <= 24; h++) {
            for (int m = 0; m <= 59; m++) { //mueve los segundos
                for (int s = 0; s <= 59; s++) {
                    System.out.println(h + ":" +m+":"+s);


                }
            }
        }
    }
}