import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args){

        Scanner capTeclado = new Scanner(System.in);
        System.out.print("Ingresa una cadena de texto: ");
        //Palindromo    : OXXO
        String texto = capTeclado.nextLine().toUpperCase();
        //String texto = "etna la gata galante";
        String reversa = "";

        // for, charAt

        for(int k = texto.length()-1 ; k >= 0 ; k--){
            System.out.println(k + "- " + texto.charAt(k));

            // validar si el caracter actual es un espacio
            if ( ! (texto.charAt(k) == ' ') ){
                reversa += texto.charAt(k);
            }
        }

        // Limpiar la cadena de texto original
        texto = texto.replace(" ", "");
        //System.out.println(reversa);

        // comparar las 2 cadenas, la original y la reversa
        // si son igales, es un palindrome
        if (texto.equals(reversa)){
            System.out.println("La palabra "+ texto + " es palíndromo.");
        }else{
            System.out.println("La palabra "+ texto + " NO es palíndromo.");
        }
    }
}
