public class Dispositivo {

    private String marca;
    private String modelo;
    private String gama;
    private double precio;
    private String procesador;
    private String rama;
    private String gpu;
    private String sistemaOperativo;
    private int mAh;


    public Dispositivo(){}

    public Dispositivo(String marca, String modelo, String gama, double precio, String procesador, String rama, String gpu, String sistemaOperativo, int mAh) {
        this.marca = marca;
        this.modelo = modelo;
        this.gama = gama;
        this.precio = precio;
        this.procesador = procesador;
        this.rama = rama;
        this.gpu = gpu;
        this.sistemaOperativo = sistemaOperativo;
        this.mAh = mAh;

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getGama() {
        return gama;
    }

    public void setGama(String gama) {
        this.gama = gama;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getRama() {
        return rama;
    }

    public void setRama(String rama) {
        this.rama = rama;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public int getmAh() {
        return mAh;
    }

    public void setmAh(int mAh) {
        this.mAh = mAh;
    }

    @Override
    public String toString() {
        return "Dispositivo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", gama='" + gama + '\'' +
                ", precio=" + precio +
                ", procesador='" + procesador + '\'' +
                ", rama='" + rama + '\'' +
                ", gpu='" + gpu + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", mAh=" + mAh +
                '}';
    }
}
