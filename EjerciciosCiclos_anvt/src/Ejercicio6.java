public class Ejercicio6 {
    public static void main(String[] args) {


        //6.- Una persona desea invertir $1000.00 en un banco,
        // el cual le otorga un 2% de interés mensual.
        // Cual será la cantidad de dinero que esta persona
        // tendrá al cabo de un año si todo el dinero lo reinvierte?.

        double inversion = 1000.00;

        for (int i = 1; i <= 12; i++ ) {
            inversion = inversion * 1.02;
        }
        System.out.println("Ganancia total : "+inversion);
    }
}
