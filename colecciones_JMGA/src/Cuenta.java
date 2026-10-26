public class Cuenta {
    String numeroDeCuenta;
    String numTarjeta;
    String nip;
    String nombre;
    double saldo;
    String fecha;

    public Cuenta() {
    }

    public Cuenta(String numeroDeCuenta, String numTarjeta, String nip, String nombre, double saldo, String fecha) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.numTarjeta = numTarjeta;
        this.nip = nip;
        this.nombre = nombre;
        this.saldo = saldo;
        this.fecha = fecha;
    }

    public String getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(String numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public String getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "numeroDeCuenta='" + numeroDeCuenta + '\'' +
                ", numTarjeta='" + numTarjeta + '\'' +
                ", nip='" + nip + '\'' +
                ", nombre='" + nombre + '\'' +
                ", saldo='" + saldo + '\'' +
                ", fecha='" + fecha + '\'' +
                '}';
    }
}
