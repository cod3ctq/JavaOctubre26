import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args){

//        Programa Java que lea dos números y muestre los números desde el menor hasta el mayor

        System.out.println("\nPrograma Java que lea dos números y muestre los números desde el menor hasta el mayor");

        Scanner capTeclado = new Scanner(System.in);

        int num1, num2;

        System.out.print("\nIntroduce el primer número : ");
        num1 = capTeclado.nextInt();

        System.out.print("Introduce el segundo número : ");
        num2 = capTeclado.nextInt();

        System.out.println();

//          // OPCION 1
//        for (int i = num1; i <= num2; i++){
//            System.out.println("Numero : [" + i + "]");
//        }

            // OPCION 2
        if (num1 < num2){
            for(int i = num1; i <= num2; i++){
                System.out.print( i != num2 ? i + " < " : i);

//                if(i != num2){
//                    System.out.print(i + " < ");
//                }else{
//                    System.out.print(i);
//                }
            }
        }else{
            for(int i = num2; i <= num1; i++){
                System.out.print( i != num1  ? i + " < " : i);
            }
        }



    }
}
