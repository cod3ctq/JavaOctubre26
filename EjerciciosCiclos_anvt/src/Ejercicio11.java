import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Peso (kg): ");
        double peso = sc.nextDouble();
        System.out.print("Altura (m): ");
        double altura = sc.nextDouble();
        double imc = peso / (altura * altura);
        System.out.printf("IMC: %.2f%n", imc);
        if (imc < 16) {
            System.out.println("Criterio de ingreso en hospital");
        } else if (imc < 17) {
            System.out.println("Infrapeso");
        } else if (imc < 18) {
            System.out.println("Bajo peso");
        } else if (imc < 25) {
            System.out.println("Peso normal (saludable)");
        } else if (imc < 30) {
            System.out.println("Sobrepeso (obesidad de grado I)");
        } else if (imc < 35) {
            System.out.println("Sobrepeso crónico (obesidad de grado II)");
        } else if (imc < 40) {
            System.out.println("Obesidad premórbida (obesidad de grado III)");
        } else {
            System.out.println("Obesidad mórbida (obesidad de grado IV)");
        }
        sc.close();
    }
}
