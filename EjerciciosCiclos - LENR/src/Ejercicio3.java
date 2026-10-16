import java.util.Scanner;

public class Ejercicio3{

    public static void main(String[] args) {




                //Palindromo : OXXXO

                Scanner scan = new Scanner(System.in);
                System.out.println("Ingresa una cadena de texto");
                String texto = scan.nextLine().toUpperCase(); //"HOLA"

                System.out.println(">>>>>Mensaje en mayusculas: " + texto);
                //texto = texto.toLowerCase(); //minusculas
                //"etnalag atag al ante"
                String reversa = ""; //[]

                //for, charAt
                //Itera al reves para extraer los caracteres en orden inverso
                //y armar la cadena de texto al reves
                for (int k = texto.length() - 1; k >= 0; k--) {
                    System.out.println(k + ": " + texto.charAt(k));

                    //Validar si el caracter actual es un espacio
                    if (!(texto.charAt(k) == ' ')) {
                        reversa = reversa + texto.charAt(k);
                    }
                }

                //Limpiar la cadena de texto original
                //etnalagatagalante
                texto = texto.replace(" ", "");

                //comparar las 2 cadenas, la original y la reversa
                //si son iguales, es un palindromo
                if (texto.equals(reversa)) {
                    System.out.println("Si es palindromo");
                } else {
                    System.out.println("No es palindromo");
                }

                System.out.println("Reversa : " + reversa);
            }
        }


