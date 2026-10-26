public class Iphone {

    //CONSTANTES : Atributo que integra static + final
    public static final String FABRICANTE = "Apple";
    public static final String SISTEMAOPERATIVO = "iOs";

    private String modelo;
    private String versionSistema;
    private String color;
    private double precio;

    public Iphone(String modelo, String versionSistema, String color, double precio) {
        this.modelo = modelo;
        this.versionSistema = versionSistema;
        this.color = color;
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getVersionSistema() {
        return versionSistema;
    }

    public void setVersionSistema(String versionSistema) {
        this.versionSistema = versionSistema;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "modelo='" + modelo + '\'' +
                ", versionSistema='" + versionSistema + '\'' +
                ", color='" + color + '\'' +
                ", precio=" + precio +
                '}';
    }
}
