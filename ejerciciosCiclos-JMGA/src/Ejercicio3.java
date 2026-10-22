import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        //Palindromo: OXXO
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa una cadena de texto");

        String texto =scan.nextLine().toUpperCase();


        String reversa= "";
        //for charAT
        for (int k = texto.length()-1 ; k>=0; k--){
            System.out.println(texto.charAt(k));


            //validar si elcaracter actual es un espacio
            if (! (texto.charAt(k) == ' ') ){
                reversa = reversa + texto.charAt(k);
            }
        }

        //Lipiar la cadena de rtexxto orginal
        texto= texto.replace(" ", "");

        if (texto.equals(reversa)){
            System.out.println("Si es un palindromo");
        }else {
            System.out.println("No es un palindromo");
        }
        System.out.println("Reversa: " +reversa);


    }
}
