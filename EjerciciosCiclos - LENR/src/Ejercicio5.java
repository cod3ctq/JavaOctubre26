public class Ejercicio5 {
    public static void main(String[] args) {

        //Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y segundos
        // de un dia desde las 00:00:00 horas hasta las 23:59:59

        //0
        //59

        for(int h = 0; h<24; h++){//mueve las horas

            for(int m = 0; m<=59; m ++) {//mueve los minutos

                for (int s = 0; s <= 59; s++) { //mueve los segundos
                    System.out.println(h + ":" + m + ":" + s);
                }
            }
        }
    }
}
