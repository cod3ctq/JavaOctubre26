import java.util.Scanner;

public class Ejercicio_dos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("INGRESE UN NÚMERO");
         numero = teclado.nextInt();


         if(numero % 2 ==0){
             System.out.println("EL NUMERO ES PAR.");
         }else {
             System.out.println("EL NÚMERO ES IMPAR");
         }

         teclado.close();
    }
}
