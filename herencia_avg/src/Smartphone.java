import java.util.Arrays;
import java.util.Scanner;

//La herencia define una relacion "ES UN"
public class Smartphone extends Celular {
    //Especializar: Sobre lo que ya existe, agregar algo que
    // rompa la forma original del concepto

    String sistemaOperativo;

     //Composicion
    //Es la idea de que un objeto complejo se compone/contiene

    String[] apps;
    Pantalla pantalla;
    Camara [] cams;

    public Smartphone() {}

    public Smartphone(String marca, String color, String modelo, double mAh, String sistemaOperativo, String[] aplicaciones, Pantalla pantalla, Camara[] cams) {
        super(marca, color, modelo, mAh);//Llamada al constructor de la clase padre
        this.sistemaOperativo = sistemaOperativo;
        this.apps = apps;
        this.pantalla = pantalla;
        this.cams = cams;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String[] getApps() {
        return apps;
    }

    public void setApps(String[] aplicaciones) {
        this.apps = aplicaciones;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }

    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }

    public Camara[] getCams() {
        return cams;
    }

    public void setCams(Camara[] cams) {
        this.cams = cams;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "sistemaOperativo='" + sistemaOperativo + '\'' +
                ", aplicaciones=" + Arrays.toString(apps) +
                ", pantalla=" + pantalla +
                ", cams=" + Arrays.toString(cams) +
                ", marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                ", mAh=" + mAh +
                '}';
    }

    @Override
    public void hacerLlamada(String numero) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Llamar mediante :");
        System.out.println("1 Red de operador");
        System.out.println("2 Whatsapp");
        System.out.println("3 Telegram");
        System.out.println("4 Messenger");
        int selecc = scan.nextInt();

        switch (selecc) {
            case 1:
                System.out.println("Llamando por Red de Operador a:" + numero);
                break;
            case 2:
                System.out.println("Llamando por Whatsapp a:" + numero);
                break;
            case 3:
                System.out.println("Llamando por Telegram a:" + numero);
                break;
            case 4:
                System.out.println("Llamando por Messenger a:" + numero);
                break;
            default:
                System.out.println("Opción invalida");
                break;
        }
    }
}
