public class Pantalla {
    String resolucion;
    String color;
    int brillo;
    double tamaño;
    int ppi;
    boolean touch;
    String proteccion;

    public Pantalla() {}

    public Pantalla(String resolucion, String color, int brillo, double tamaño, int ppi, boolean touch, String proteccion) {
        this.resolucion = resolucion;
        this.color = color;
        this.brillo = brillo;
        this.tamaño = tamaño;
        this.ppi = ppi;
        this.touch = touch;
        this.proteccion = proteccion;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getBrillo() {
        return brillo;
    }

    public void setBrillo(int brillo) {
        this.brillo = brillo;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public int getPpi() {
        return ppi;
    }

    public void setPpi(int ppi) {
        this.ppi = ppi;
    }

    public boolean isTouch() {
        return touch;
    }

    public void setTouch(boolean touch) {
        this.touch = touch;
    }

    public String getProteccion() {
        return proteccion;
    }

    public void setProteccion(String proteccion) {
        this.proteccion = proteccion;
    }
}
