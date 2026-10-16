public class EjercicioFinal {
    public static void main(String[] args) {

        //Dada la siguiente cadena de texto, determinar cuantas veces aparece cada numero dentro de la cadena

        String datos = "mfih9845029f8me095274rnhi0n&/()%&/))(7$%#$8yomi89sdavdfvdfvm84353790o76850983y2fj084254312352347ff029384m098fu0r98f2049f8/$5t&/(345x";
        String numeros = "0123456789";
        int contador = 0;

        for (int i = 0; i < datos.length(); i++) {
            System.out.println("Posición: " + i + "\nCaracter: " + datos.charAt(i));
            if (numeros.indexOf(datos.charAt(i)) >= 0) {


            }


        }
    }
}
