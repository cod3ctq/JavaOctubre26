public class iphone {
    //al cambiarlo, se considera constante:
    //Atributo que integra static y final
    public static final String FABRICANTE="Apple";
    public static final String SISTEMA_OPERATIVO="iOs";


    private String modelo;
    private String versionSistema;
    private String color;
    private double precio;

    public iphone(String modelo, String versionSistema, String color, double precio) {
        this.modelo = modelo;
        this.versionSistema = versionSistema;
        this.color = color;
        this.precio = precio;
    }

    /*public static String getFabricante() {
        return fabricante;
    }

    public static void setFabricante(String fabricante) {
        iphone.fabricante = fabricante;
    }*/

    /*public static String getSistemaOprativo() {
        return sistemaOprativo;
    }

    public static void setSistemaOprativo(String sistemaOprativo) {
        iphone.sistemaOprativo = sistemaOprativo;
    }*/

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVersionSistema() {
        return versionSistema;
    }

    public void setVersionSistema(String versionSistema) {
        this.versionSistema = versionSistema;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "iphone{" +
                "modelo='" + modelo + '\'' +
                ", versionSistema='" + versionSistema + '\'' +
                ", color='" + color + '\'' +
                ", precio=" + precio +
                '}';
    }
}
