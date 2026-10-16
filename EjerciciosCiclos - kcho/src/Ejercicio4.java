import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){

//        Programa que reciba una frase y una letra por teclado. Deberá retornar como resultado cuántas veces existe esa letra
//        dentro de la frase. Si no existe, imprimir un mensaje “Carácter no encontrado”.

        System.out.println("\nPrograma que reciba una frase y una letra por teclado.");
        System.out.println("Deberá retornar como resultado cuántas veces existe esa letra");
        System.out.println("dentro de la frase. Si no existe, imprimir un mensaje “Carácter no encontrado”.");

        Scanner capTeclado = new Scanner(System.in);
        int contLetra = 0;

        System.out.print("\nIntroduce una frase : ");
        String frase = capTeclado.nextLine();

        System.out.print("Dame una letra : ");
        char letra = capTeclado.nextLine().charAt(0);

        for(int i = 0 ; i < frase.length(); i++){
            if(frase.charAt(i) == letra){
                contLetra++;
            }
        }
        /// supercalifragilisticoespiralidoso supercaleidoscopico superchipirindehi
        if(contLetra > 0 ){
            System.out.print("La letra [" + letra + "] aparece en la frase : (" + contLetra);

            if (contLetra == 1)
                System.out.println(") vez.");
            else
                System.out.println(") veces.");
        } else {
            System.out.println("Caracter no encontrado!!!.");
        }

    }
}
