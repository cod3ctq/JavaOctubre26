import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Programa Java que lea dos números y muestre los números desde el menor hasta el mayor

        int num1;
        int num2;
        int menor;
        int mayor;

        System.out.println( " Escribe el primer numero: ");
        num1 = scan.nextInt();

        System.out.println( " Escribe el segundo numero ");
        num2 = scan.nextInt();

        if(num1 < num2){
            menor = num1;
            mayor = num2;
        }else{
            menor = num2;
            mayor = num1;
        }

        for( int i = menor; i <= mayor; i++){
            System.out.println(i + " ");
        }


    }
}
