public class Ejercicio3 {
    public static void main(String[] args) {

        //Palindromo : OXXO

        String texto = "anita lava la tina";
        String reversa = "";

        for (int k = texto.length() - 1; k >= 0; k--) {
            System.out.println(texto.charAt(k));
            reversa = reversa + texto.charAt(k);

        }
    }
}
