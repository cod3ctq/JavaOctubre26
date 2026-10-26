public class Dispositivo {
    private String marca;
    private String modelo;
    private String gama;
    private double precio;
    private String mprocesador;
    private String ram;
    private String gpu;
    private String sistemaOperativo;
    private int mAh;


    public Dispositivo() {
    }

    public Dispositivo(String marca, String modelo, String gama, double precio, String mprocesador, String ram, String gpu, String sistemaOperativo, int mAh) {
        this.marca = marca;
        this.modelo = modelo;
        this.gama = gama;
        this.precio = precio;
        this.mprocesador = mprocesador;
        this.ram = ram;
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

    public String getMprocesador() {
        return mprocesador;
    }

    public void setMprocesador(String mprocesador) {
        this.mprocesador = mprocesador;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
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
                ", mprocesador='" + mprocesador + '\'' +
                ", ram='" + ram + '\'' +
                ", gpu='" + gpu + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", mAh=" + mAh +
                '}';
    }
}
