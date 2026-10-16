import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés mensual. En cuantos meses tendrá
        //mas de $1500, si reinvierte cada mes todo su dinero?

        double dinero = 700.00;
        int meses = 0;

        while(dinero <= 1500){
            dinero = dinero + dinero * 0.02;
            meses++;
        }
        System.out.println( " Tendra mas de $1500 en " + meses + " meses ");
        System.out.println( " Tendra: $" + dinero);





    }
}
