//La herencia define una relacion "ES UN"

import java.util.Arrays;
import java.util.Scanner;

public class Smartphone extends Celular {

    //Especializar: Sobre lo que ya existe, agregar algo que tompa la forma original del concepto
    String sistemaOperativo;

    //Composicion : Define una relacion "TIENE UN"
    //Es la idea de que un objeto completo se compone o contiene otros mas pequeños
    String[] aplicaciones;

    Pantalla pantalla;
    Camara[] cams;

    public Smartphone() {

    }

    public Smartphone(String marca, String color, String modelo, double mAh, String sistemaOperativo, String[] aplicaciones, Pantalla pantalla, Camara[] cams) {
        super(marca, color, modelo, mAh);//Llamada al constructor de la clase padre
        this.sistemaOperativo = sistemaOperativo;
        this.aplicaciones = aplicaciones;
        this.pantalla = pantalla;
        this.cams = cams;
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


    @Override //Indica de forma explicita que se esta sobreescribiendo
    public void hacerLlamada(String numero) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Llamar mediante :");
        int selecc = scan.nextInt();

                switch (selecc){
                    case 1:
                    System.out.println("Llamando por red de Operador a : " + numero);
                    break;

                    case 2:
                    System.out.println("Llamando por Whatsapp a : " + numero);
                    break;

                    case 3:
                    System.out.println("Llamando por Telegram a : " + numero);
                    break;

                    case 4:
                    System.out.println("Llamando por Messenger a : " + numero);
                    break;

                    default:
                        System.out.println(" Opcion invalida");


                }


    }


}
