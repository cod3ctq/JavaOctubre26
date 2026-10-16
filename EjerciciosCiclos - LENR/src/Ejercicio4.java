import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Programa que reciba una frase y una letra por teclado. Deberá retornar como resultado cuántas veces existe esa letra
        //dentro de la frase. Si no existe, imprimir un mensaje “Carácter no encontrado”.

        String frase;
        char letra;
        int contador = 0;

        System.out.println( " Escriba una frase : ");
        frase = scan.nextLine();

        System.out.println( " Letra a buscar : ");
        letra = scan.next().charAt(0);

        for(int i = 0; i < frase.length(); i++){

            if(frase.charAt(i) == letra){
                contador++;
            }
        }

        if(contador == 0){
            System.out.println( "Caracter no encontrado ");
        }else {
            System.out.println("La letra " + letra + " aparece " + contador + " veces ");
        }
    }
}
