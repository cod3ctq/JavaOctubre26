import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
/*String frase;
		String letra;
		int contador;*/
        Scanner sc = new Scanner(System.in);

		/*System.out.println("Ingresa una frase/n");
		frase = sc.nextLine();

		System.out.println("Ingresa una letra");
		letra = sc.nextLine();
		letra.charAt(0);*/

        String cadena="";
        String caracter="";
        int cont=0;

        System.out.println("Ingresa el texto ");
        cadena = sc.nextLine();

        System.out.println("¿que caracter deseas contar? ");
        caracter = sc.nextLine();
        for (int i = 0; i < cadena.length(); i++) {
            if(cadena.charAt(i)== caracter.charAt(0) ){
                cont ++;
            }
        }

        if (cont != 0) {
            System.out.println("El caracter "+caracter.charAt(0)+ " se repite " + cont + " veces");
        }else{
            System.out.println("El caracter no se encuentra en este texto");
        }

    }
}
