public class Iphone {

    public static String fabricante="Apple";
    public static String sistemaOperativo="iOs";

    private String modelo;
    private String versionSistemas;
    private String color;
    private double precio;


    public Iphone(String modelo, String versionSistemas, String color, double precio) {
        this.modelo = modelo;
        this.versionSistemas = versionSistemas;
        this.color = color;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static String getFabricante() {
        return fabricante;
    }

    public static void setFabricante(String fabricante) {
        Iphone.fabricante = fabricante;
    }

    public static String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public static void setSistemaOperativo(String sistemaOperativo) {
        Iphone.sistemaOperativo = sistemaOperativo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getVersionSistemas() {
        return versionSistemas;
    }

    public void setVersionSistemas(String versionSistemas) {
        this.versionSistemas = versionSistemas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "modelo='" + modelo + '\'' +
                ", versionSistemas='" + versionSistemas + '\'' +
                ", color='" + color + '\'' +
                ", precio=" + precio +
                '}';
    }
}
