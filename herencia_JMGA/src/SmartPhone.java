import java.util.Arrays;
import java.util.Scanner;

public class SmartPhone extends Celular {

    //Al herencia define una relacion "Es un"
    //Especializar sobre lo qu eya existe, agregar algo que rompa la forma original del concepto
    String sistemaOperativo;

    //Composicion proximamente- definme una relacion "TIEne un"
    //Es la idea de que un objeto complejo se compone /tiene otros mas pequeños
    String[] aplicaciones;

    //resolucion, color briloo, tamaño, ppi. touch, proteccion
    //String, String, int, ¿double, int,bulean,String

    Pantalla pantalla;
    Camara[] cams;


    public SmartPhone() {

    }

    public SmartPhone(String marca, String color, String modelo, double mAh, String sistemaOperativo, String[] aplicaciones, Pantalla pantalla, Camara[] cams) {
        super(marca, color, modelo, mAh); //Llamada al constructor de la clase padre
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
        return "SmartPhone{" +
                "mAh=" + mAh +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", cams=" + Arrays.toString(cams) +
                ", pantalla=" + pantalla +
                ", aplicaciones=" + Arrays.toString(aplicaciones) +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                '}';
    }

    @Override
    public void llamr (String numero){
        Scanner scan = new Scanner(System.in);

        System.out.println("Llamar mediante: ");
        int selecc = scan.nextInt();
        switch (selecc){
            case 1:
            System.out.println("llamada por red de operador a:"+numero);
            break;
            case 2:
                System.out.println("llamada whatsapp a:"+numero);
                break;
            case 3:
                System.out.println("llamada por telegram a:"+numero);
                break;
            case 4:
                System.out.println("llamada por Messenger  a:"+numero);
                break;
        }
    }


}
