import java.util.Arrays;
import java.util.Scanner;

//La herencia define una relacion "ES UN"
public class Smartphone extends Celular {
    //Especializar: Sobre lo que ya existe, agregar algo que rompa la forma
    //original del concepto

    String sistemaOperativo;

    //Composicion : Define una relacion "TIENE UN"
    //Es la idea de que un objeto complejo se compone/contiene otros mas
    String[] aplicaciones;
    Pantalla pantalla;
    Camara[] cams;

    public Smartphone() {

    }

    public Smartphone(String marca, String color, String modelo, double mAh, String sistemaOperativo, String[] aplicaciones, Pantalla pantalla, Camara[] cams) {
        super(marca, color, modelo, mAh);
        this.sistemaOperativo = sistemaOperativo;
        this.aplicaciones = aplicaciones;
        this.pantalla = pantalla;
        this.cams = cams;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String[] getAplicaciones() {
        return aplicaciones;
    }

    public void setAplicaciones(String[] aplicaciones) {
        this.aplicaciones = aplicaciones;
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
                ", aplicaciones=" + Arrays.toString(aplicaciones) +
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
        System.out.println("Llamar mediante: ");
        System.out.println("1 Red de Operador");
        System.out.println("2 Whatsapp");
        System.out.println("3 Telegram");
        System.out.println("4 Messenger");
        int select = scan.nextInt();

        switch (select) {
            case 1:
                System.out.println("Llamado por Red de Operador a:" + numero);
                break;
            case 2:
                System.out.println("Llamado por Whatsapp a:" + numero);
                break;
            case 3:
                System.out.println("Llamado por Telegram a:" + numero);
                break;
            case 4:
                System.out.println("Llamado por Messenegr a:" + numero);
                break;
            default:
                System.out.println("Opcion invalidad");
                break;
        }
    }
}