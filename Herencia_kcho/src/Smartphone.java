import java.util.Arrays;
import java.util.Scanner;

// La HERENCIA define una relacion "ES UN"
public class Smartphone extends Celular {

    // Especializar: sobre lo que ya existe agregar algo que rompa la forma original del concepto

    String sistemaOperativo;


    // Composicion : Define una relacion TIENE UN
    // es la idea de que un objeto complejo se compone/contiene otros mas pequeños
    Pantalla pantalla;
    Camara[] camara;
    String[] aplicaciones;
            //    String reproductorMusica; // spotigy, winamp, QuasarMx
            //    String navegador; // chrome, opera, safari
            //    String correo; // outlook, gmail, hotmail


    public Smartphone(){}

    public Smartphone(String marca, String color, String modelo, double mAh, String sistemaOperativo, Pantalla pantalla, Camara[] camara, String[] aplicaciones) {
        super(marca, color, modelo, mAh);   // llamada al constructor de la clase padre
        this.sistemaOperativo = sistemaOperativo;
        this.pantalla = pantalla;
        this.camara = camara;
        this.aplicaciones = aplicaciones;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }

    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }

    public Camara[] getCamara() {
        return camara;
    }

    public void setCamara(Camara[] camara) {
        this.camara = camara;
    }

    public String[] getAplicaciones() {
        return aplicaciones;
    }

    public void setAplicaciones(String[] aplicaciones) {
        this.aplicaciones = aplicaciones;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "sistemaOperativo='" + sistemaOperativo + '\'' +
                ", pantalla=" + pantalla +
                ", camara=" + Arrays.toString(camara) +
                ", aplicaciones=" + Arrays.toString(aplicaciones) +
                ", marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                ", mAh=" + mAh +
                '}';
    }

    @Override // Indica de forma explicita que se esta sobre escribiendo, que no es original de esta clase
    public void hacerLlamada(String numero){
        Scanner capTeclado = new Scanner(System.in);
        System.out.print("Llamar al numero [" + numero + "] mediante: \n1) Red de Operador\n2) WhatsApp\n3) Telegram\n4) Messenger\n¿ ? : ");
        int selecc = capTeclado.nextInt();

        switch(selecc){
            case 1:
                System.out.println("Llamando por Red de Operador al: " + numero);
                break;
            case 2:
                System.out.println("Llamando por WhatsApp al: " + numero);
                break;
            case 3:
                System.out.println("Llamando por Telegram al: " + numero);
                break;
            case 4:
                System.out.println("Llamando por Messenger al: " + numero);
                break;
            default:
                break;
        }
    }


}
