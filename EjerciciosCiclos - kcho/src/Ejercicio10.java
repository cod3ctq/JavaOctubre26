import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

//        Programa que lea 20 números e indique
//        si son positivos o negativos y                    // num < 0 negativo (-)    num > 0 positivo (+)
//        pares o impares y                                 // num%2 = 0  es (PAR)      num%2 != 0 es (IMPAR)
//        ademas muestre la sumatoria de los positivos      // sumatoria de positivos sumaPositivo += num (donde se valida si es (+) o (-)
//        y sumatoria de los impares.                       // sumatoria de impares   sumaImpares += num (donde se valida si es PAR o IMPAR)


        System.out.println("\nPrograma que lea 20 números e indique");
        System.out.println("---> si son positivos o negativos y");
        System.out.println("---> pares o impares y");
        System.out.println("---> ademas muestre la sumatoria de los positivos y");
        System.out.println("---> sumatoria de los impares.\n");


        Scanner capTeclado = new Scanner(System.in);
        int[] array = new int[20];
        int sumaPositivo = 0;
        int sumaImpares = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ") : ");
            array[i] = capTeclado.nextInt();

        }

        for (int i = 0; i < 20; i++) {
            System.out.print(array[i]);

            if (array[i] > 0 ) { // es positivo
                System.out.print("\t\t(+)");
                sumaPositivo += array[i];
            } else {            // es negativo
                System.out.print("\t\t(-)");
            }

            if ( array[i] % 2 == 0 ) { // es PAR
                System.out.println("\t\tPAR");
            } else{                     // es IMPAR
                System.out.println("\t\tIMPAR");
                sumaImpares += array[i];
            }
        }

        System.out.println("La sumatoria de los POSITIVOS (+) es : " + sumaPositivo);
        System.out.println("la sumatoria de los IMPARES es : " + sumaImpares);

//        for (int i = 0; i < 5; i++) {
//            System.out.print(array[i]);
//            System.out.print(array[i] > 0 ? "\t\t(+)" : "\t\t(-)");
//            System.out.println(array[i] % 2 == 0 ? "\t\tPAR" : "\t\tIMPAR");
//        }


    }
}
