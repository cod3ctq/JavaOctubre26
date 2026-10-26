public class Iphone {

    // al aplicar FINAL se vuelve constante (accesible pero no modificable)
    // atributo que integra static + final
    // lo que nunca cambia es STATIC
    public static final String FRABRICANTE = "Apple";
    public static final String SISTEMA_OPERATIVO = "iOs";

    // lo que si cambia es manejado como INSTANCIA
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
