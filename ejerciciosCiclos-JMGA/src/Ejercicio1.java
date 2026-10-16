import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Realiza tabla de multiplicar

        Scanner sc = new Scanner(System.in);

        int num1=0;
        int num2=0;
        System.out.println("Ingresa el numero a multiplicar");
        num1 = sc.nextInt();
        System.out.println("Iteracion deseada");
        num2 = sc.nextInt();

        for (int i = 1; i<=num2; i++) {

            //if (i%2==0) {
            System.out.println(num1+"*"+i+"="+num1*i);
            //}


        }

    }
}
