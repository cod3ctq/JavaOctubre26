public class Ejercicio7 {
    public static void main(String[] args) {

//        Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés mensual.
//        En cuantos meses tendrá mas de $1500, si reinvierte cada mes todo su dinero?.


        System.out.println("\nUna persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés mensual.");
        System.out.println("En cuantos meses tendrá mas de $1500, si reinvierte cada mes todo su dinero?.");

        double saldo = 700.0;
        int contadorMeses = 0;

        do{
            saldo = saldo * 1.02;
            contadorMeses++;
        }while(saldo < 1500);

        System.out.println("\nSaldo inicial : $ 700.00");
        System.out.println("Saldo final : $ " + String.format("%.02f",saldo));
        System.out.println("Saldo final superó los $1500.00 en [" + contadorMeses + "] meses reinvirtiendo el saldo inicial.");
    }
}
